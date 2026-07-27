/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parcial1.dao;

import java.util.List;
import parcial1.modelo.ReporteSimulacion;

public interface ReporteDAO {

    void guardar(ReporteSimulacion reporte);

    List<ReporteSimulacion> listar();

    void eliminar(int id);

}