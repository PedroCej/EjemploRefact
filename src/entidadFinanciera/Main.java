/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {
//
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        try {
            c.ingresar(cantidad);
        } catch (Exception exception) {
        }
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        try {
            c.retirar(cantidad);
        } catch (Exception exception) {
        }
    }
}
