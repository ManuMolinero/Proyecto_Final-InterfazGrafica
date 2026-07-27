package parcial1;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import parcial1.controlador.SimuladorController;
import parcial1.vista.PantallaSimulador;
import parcial1.dao.InicializadorDB;

public class MainApp {
    public static void main(String[] args) {
        InicializadorDB.inicializar();
        // Intentar usar el Look and Feel del sistema para una apariencia más moderna y premium
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Ignorar y continuar con Look and Feel por defecto si falla
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PantallaSimulador vista = new PantallaSimulador();
                // El modelo se creará dinámicamente al iniciar una nueva simulación o cargar
                SimuladorController controlador = new SimuladorController(null, vista);
                vista.setVisible(true);
            }
        });
    }
}
