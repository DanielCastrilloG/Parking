/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dam
 */
public class Parking {

    String[] plazas;

    public Parking() {
        plazas = new String[100];
    }

    /**
     * Este no es necesario pero es recomendable para hacer las pruebas y no
     * tener que meter 100 elementos
     *
     * @param nPlazas
     */
    public Parking(int nPlazas) {
        plazas = new String[nPlazas];
    }

    /**
     * Controlar que metemos los datos con un FOR es como un WHILE
     */
    public void inicializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }
        
        /**
         * Sacamos los datos para visualizarlos
         */
    }
    public void estadoParking() {
        int nplaza;
        plazas[1]="Ocupado";
        System.out.println("Nª Plaza Estado");
        for (nplaza = 0; nplaza < plazas.length; nplaza++) {

            System.out.println(nplaza + " - " + plazas[nplaza]);
        }
    }

}


