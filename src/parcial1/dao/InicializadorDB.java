/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.Statement;

public class InicializadorDB {

    public static void inicializar() {

        try {

            File carpeta = new File("database");

            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            Connection conexion = ConexionDB.conectar();

            Statement st = conexion.createStatement();

            st.execute("""
                CREATE TABLE IF NOT EXISTS reportes(
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nombre TEXT,
                    fecha TEXT,
                    plantas INTEGER,
                    conejos INTEGER,
                    lobos INTEGER,
                    turnos INTEGER,
                    resultado TEXT
                );
            """);

            st.close();
            conexion.close();

            System.out.println("Base de datos creada correctamente.");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}