/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejercicion21;

/**
 *
 * @author USER
 */
public class Persona {
    String nombre; 
    String apellidos; 
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
    }
    
void imprimir() {
    System.out.println("Nombre = " + nombre);
    System.out.println("Apellidos = " + apellidos);
    System.out.println("Numero de documento de identidad = " + numeroDocumentoIdentidad);
    System.out.println("Ano de nacimiento = " + anoNacimiento);
    System.out.println();
    }
}
