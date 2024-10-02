/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Alejo
 */
public class ejercicoDiez {
    /*Escribir un programa que escriba por pantalla un numero al azar entre 0 y 99.*/
    public static void main(String[] args) {
       int n = (int) (Math.random() * (99 - 0)) + 0; 
        System.out.println("EL numero al zar es = " + n);
    }
}
