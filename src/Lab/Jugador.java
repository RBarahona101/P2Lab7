package Lab;

public class Jugador {
    protected String nombre;
    protected int dorsal;
    protected int goles;
    protected int asistencias;
    protected int partidos;
    protected int amarillas;
    protected int rojas;
    protected int comitidas;
    protected int recibidas;
    protected int posicion;
    
    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getComitidas() {
        return comitidas;
    }

    public void setComitidas(int comitidas) {
        this.comitidas = comitidas;
    }

    public int getRecibidas() {
        return recibidas;
    }

    public void setRecibidas(int recibidas) {
        this.recibidas = recibidas;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencias, int partidos, int amarillas, int rojas, int comitidas, int recibidas, int posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencias = asistencias;
        this.partidos = partidos;
        this.amarillas = amarillas;
        this.rojas = rojas;
        this.comitidas = comitidas;
        this.recibidas = recibidas;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
