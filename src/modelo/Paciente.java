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
public class Paciente implements Comparable<Paciente>{
    //Datos personales del paciente
    private int codigo;//Autoincrementable
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    //Datos clinicos del paciente
    private int nivel; //leve, grave, muy grave
    private String observaciones;
    private String tipoSangre;
    private String estado; //En espera, atendido, de alta, cancelado (fallecido o retirado)

    public Paciente() {
    }

    public Paciente(int codigo, String nombre, String apellido, int edad, String genero, int nivel, String observaciones, String tipoSangre, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.nivel = nivel;
        this.observaciones = observaciones;
        this.tipoSangre = tipoSangre;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
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

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Paciente o) {
        if(nivel >= o.getNivel()){
            return 1;
        } else {
            return -1;  
        }
    }
    @Override
    public String toString(){
        
        return codigo + " --- " + nombre + " " + apellido + " --- " + nivel;
    }
}