package parcial1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import parcial1.modelo.ReporteSimulacion;

public class ReporteDAOImpl implements ReporteDAO {

    @Override
    public void guardar(ReporteSimulacion reporte) {

        String sql = """
                     INSERT INTO reportes
                     (nombre, fecha, plantas, conejos, lobos, turnos, resultado)
                     VALUES (?, ?, ?, ?, ?, ?, ?)
                     """;

        try (
                Connection conexion = ConexionDB.conectar();
                PreparedStatement ps = conexion.prepareStatement(sql)
        ) {

            ps.setString(1, reporte.getNombre());
            ps.setString(2, reporte.getFecha());
            ps.setInt(3, reporte.getPlantas());
            ps.setInt(4, reporte.getConejos());
            ps.setInt(5, reporte.getLobos());
            ps.setInt(6, reporte.getTurnos());
            ps.setString(7, reporte.getResultado());

            ps.executeUpdate();

            System.out.println("Reporte guardado correctamente.");

        } catch (SQLException e) {

            System.err.println(
                    "Error al guardar el reporte: " + e.getMessage()
            );

        }
    }

    @Override
    public List<ReporteSimulacion> listar() {

        List<ReporteSimulacion> reportes = new ArrayList<>();

        String sql = """
                     SELECT id, nombre, fecha, plantas, conejos,
                            lobos, turnos, resultado
                     FROM reportes
                     ORDER BY id DESC
                     """;

        try (
                Connection conexion = ConexionDB.conectar();
                Statement st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                ReporteSimulacion reporte = new ReporteSimulacion(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("fecha"),
                        rs.getInt("plantas"),
                        rs.getInt("conejos"),
                        rs.getInt("lobos"),
                        rs.getInt("turnos"),
                        rs.getString("resultado")
                );

                reportes.add(reporte);
            }

        } catch (SQLException e) {

            System.err.println(
                    "Error al listar los reportes: " + e.getMessage()
            );

        }

        return reportes;
    }

    @Override
    public void eliminar(int id) {

        String sql = "DELETE FROM reportes WHERE id = ?";

        try (
                Connection conexion = ConexionDB.conectar();
                PreparedStatement ps = conexion.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int filasEliminadas = ps.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Reporte eliminado correctamente.");
            } else {
                System.out.println("No se encontró el reporte.");
            }

        } catch (SQLException e) {

            System.err.println(
                    "Error al eliminar el reporte: " + e.getMessage()
            );

        }
    }
}