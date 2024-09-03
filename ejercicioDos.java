/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenegro 20241222690
 * 
 */
import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
         
        /*Crea un programa que pida un numero por Scanner y escriba en consola "el numero es XX"
        (evidentemente, sustituyendo XX por el numero que se escriba en consola)
        */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String number = sc.nextLine();
        System.out.println("El número es:"+ " "+ number);
         
    }
    
}
