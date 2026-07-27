/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.modelo;

public class ReporteSimulacion {

    private int id;
    private String nombre;
    private String fecha;
    private int plantas;
    private int conejos;
    private int lobos;
    private int turnos;
    private String resultado;

    public ReporteSimulacion() {
    }

    public ReporteSimulacion(
            String nombre,
            String fecha,
            int plantas,
            int conejos,
            int lobos,
            int turnos,
            String resultado
    ) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.plantas = plantas;
        this.conejos = conejos;
        this.lobos = lobos;
        this.turnos = turnos;
        this.resultado = resultado;
    }

    public ReporteSimulacion(
            int id,
            String nombre,
            String fecha,
            int plantas,
            int conejos,
            int lobos,
            int turnos,
            String resultado
    ) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.plantas = plantas;
        this.conejos = conejos;
        this.lobos = lobos;
        this.turnos = turnos;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public int getConejos() {
        return conejos;
    }

    public void setConejos(int conejos) {
        this.conejos = conejos;
    }

    public int getLobos() {
        return lobos;
    }

    public void setLobos(int lobos) {
        this.lobos = lobos;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return nombre + " - " + fecha;
    }
}