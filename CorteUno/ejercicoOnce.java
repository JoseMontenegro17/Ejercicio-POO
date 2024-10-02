/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenegro u20241222690
 
/* Escribir un programa que crea una variable y le asigna un número de segundos
 y nos dice a cuántas  horas, minutos y segundos corresponde dicha cantidad de segundos. 
Por ejemplo, si en el programa se  define un int seg =3734, después nos dice;  
3734 segundos son 1 horas 2 minutos y 14 segundos.
*/

public class ejercicoOnce {
    public static void main(String[] args) {

        int seg = 3734;

        
        int horas = seg / 3600; 
        int minutos = (seg % 3600) / 60; 
        int segundos = seg % 60; 

        System.out.println(seg + " segundos son " + horas + " horas " + minutos + " minutos y " + segundos + " segundos.");
    }
}



