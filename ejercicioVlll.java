/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author u20241222690
 */
import java.util.Scanner;
public class ejercicioVlll {
    
    /*Crear un programa que declare una variable de tipo entero y pida al usuario por teclado un valor
para ella. A continuación muestra un mensaje indicando si el valor de dicha variable es positivo o
negativo (Consideraremos el 0 como positivo)
*/
 public static void main(String[] args) {
      int number;
     Scanner sc=new  Scanner(System.in);
     System.out.println("ingresa un numero:");
      number=  sc.nextInt();
      if (number>=0){
          System.out.println("El número"+" " + number+" "+  "es positivo");
      }
      else{
          System.out.println("El número"+ " "+number +"  "+ "es negativo");
                  
                  
          
              
      }
      
     
    }
}
