
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Equipo {
    private String nombre; 
    private ArrayList<Jugador> plantilla;
    private float presupuesto;
    private int copas_ganadas;
    private String estadio;

    public Equipo() {
        plantilla = new ArrayList();
    }

    public Equipo(String nombre, float presupuesto, int copas_ganadas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas_ganadas = copas_ganadas;
        this.estadio = estadio;
        plantilla = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas_ganadas() {
        return copas_ganadas;
    }

    public void setCopas_ganadas(int copas_ganadas) {
        this.copas_ganadas = copas_ganadas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return nombre + "  Copas Ganadas: " + copas_ganadas;
    }
    
    
}
