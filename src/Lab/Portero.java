package Lab;


public class Portero extends Jugador{
    protected int bloques;

    public int getBloques() {
        return bloques;
    }

    public void setBloques(int bloques) {
        this.bloques = bloques;
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

    public Portero(int bloques) {
        this.bloques = bloques;
    }

    public Portero(String nombre, int dorsal, int goles, int asistencias, int partidos, int amarillas, int rojas, int comitidas, int recibidas, int posicion, int bloques) {
        super(nombre, dorsal, goles, asistencias, partidos, amarillas, rojas, comitidas, recibidas, posicion);
        this.bloques = bloques;
    }
    
}
