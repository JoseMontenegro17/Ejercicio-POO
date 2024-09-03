/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Jose Montenegro Codigo:2024122690
 */

public class ejercicioUno {
    
    public static void main(String[] args) {
       
        /* Crear un programa que pide un nombre por Scanner y escribe en consola 
        "buenas tardes, Sr XX"(Evidentemente, sustituyendo XX por el nombre que escriba en cosola*/
            
     Scanner sc = new Scanner(System.in);  
     System.out.println("Igresa tu nombre:");

     String userName = sc.nextLine();   
     System.out.println("Buenas tardes, Sr " + userName);  
  }
}

    
       
    
    
    

