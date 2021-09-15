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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaArrayPrioridad colaa = new ColaArrayPrioridad();
        System.out.println("Codigo --- Nombre Completo --- Nivel");
//        (int codigo, String nombre, String apellido, int edad, String genero, int nivel, String observaciones, String tipoSangre, String estado)
        colaa.offer(new Paciente(1, "Luis", "Ramos", 20, "Masculino", 2, "Sin observaciones", "A+", "En espera"));
        colaa.offer(new Paciente(2, "Mario", "Zelaya", 20, "Masculino", 3, "Sin observaciones", "O", "Atendido"));
        colaa.offer(new Paciente(3, "Julio", "Torres", 21, "Masculino", 1, "Sin observaciones", "A+", "En espera"));
        
        while (!colaa.isEmpty()){
            System.out.println(colaa.poll());
        }
        
    }
    
}
