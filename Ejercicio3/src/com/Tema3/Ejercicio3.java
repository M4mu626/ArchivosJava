/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 */
package com.Tema3;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[] nombres = {"pedro", "jose", "maria", "carlos"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.printf(nombre + " ");
        }

    }

}


