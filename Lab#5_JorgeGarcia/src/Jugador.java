/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Jugador {
    private String nombre;
    private float precio;
    private String posicion;
    private boolean disponibilidad;
    private float habilidad;
    private float tecnica;
    private float resistencia_fisica;

    public Jugador() {
    }

    public Jugador(String nombre, float precio, String posicion, boolean disponibilidad, float habilidad, float tecnica, float resistencia_fisica) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia_fisica = resistencia_fisica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(float habilidad) {
        this.habilidad = habilidad;
    }

    public float getTecnica() {
        return tecnica;
    }

    public void setTecnica(float tecnica) {
        this.tecnica = tecnica;
    }

    public float getResistencia_fisica() {
        return resistencia_fisica;
    }

    public void setResistencia_fisica(float resistencia_fisica) {
        this.resistencia_fisica = resistencia_fisica;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
    
