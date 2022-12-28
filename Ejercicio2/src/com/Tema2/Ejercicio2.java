/*
para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

package com.Tema2;

import java.util.Scanner; // se importa esta libreria para poder escribir por teclado

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);  //Se crea un objeto de la clase Scanner que nos permitirá ingresar por teclado los valores deseados
        float  iva=0.16f; // el iva esta colocado con el 16%
        int total, ivaProducto,precio;
        System.out.print("Ingrese precio:"); // aqui se solicita que se introduzca el precio por teclado
        precio=teclado.nextInt();
        ivaProducto = (int) (precio* iva);  // se hace la multipicacion y se coloca el int para convertir el resultado en entero
        total= ivaProducto + precio; // aqui se suma ya el valor del iva del precio con el precio
        System.out.print("El precio mas iva incluido es:");
        System.out.println(total); // se muestra en pantalla el resultado total
    }
}











