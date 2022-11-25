package Lab;

import java.util.ArrayList;

public class Seleccion {
    protected String nombre;
    protected int jugados;
    protected int ganados;
    protected int empatados;
    protected int perdidos;
    protected int favor;
    protected int contra;
    protected int diferencia;
    protected ArrayList<Jugador> jugadores = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getFavor() {
        return favor;
    }

    public void setFavor(int favor) {
        this.favor = favor;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Seleccion(String nombre, int jugados, int ganados, int empatados, int perdidos, int favor, int contra, int diferencia) {
        this.nombre = nombre;
        this.jugados = jugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.favor = favor;
        this.contra = contra;
        this.diferencia = diferencia;
    }

    public Seleccion() {
    }

    @Override
    public String toString() {
        return nombre + "," + jugados + "," + ganados + "," + empatados + "," + perdidos + "," + favor + "," + contra + "," + diferencia + ",";
    }
    
    
}
