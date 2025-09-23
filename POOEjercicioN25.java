/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicion25;

/**
 *
 * @author USER
 */
public class POOEjercicioN25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Perez",
        123456789,tipoCuenta.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        }
    
    
}
