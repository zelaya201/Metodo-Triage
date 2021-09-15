/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Vaquerano
 */
public class Paciente implements Comparable<Paciente> {

    //Datos personales del paciente
    private String numero;//Autoincrementable
    private String nombre;
    private String edad;
    private String genero;
    //Datos clinicos del paciente
    private int nivel; //leve, grave, muy grave
    private String observaciones;
    private String estado; //En espera, atendido, de alta, cancelado (fallecido o retirado)

    public Paciente() {
    }

    // Constructor para guardado en el array
    public Paciente(String numero, String nombre, String edad, String genero, int nivel, String observaciones, String estado) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nivel = nivel;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Paciente o) {
        if (nivel >= o.getNivel()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {

        return "Paciente : " + nombre + " con prioridad nivel " + nivel;
    }
}
