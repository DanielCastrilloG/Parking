/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/** Primer ejercicio de ARRAy´s 
 *
 * @author dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano;
        artesano=new Parking(5);
        artesano.inicializarPlazas();
        artesano.estadoParking();
    }
    
}
