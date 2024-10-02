/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Alejo
 */
/* Crear un programa que declare dos variables de tipo entero y pida al usuario por teclado un valor 
para cada una de ellas. A continuación muestra un mensaje indicando si ambos valores son iguales*/
import java.util.Scanner;
public class ejercicioDoce {
    public static void main(String[] args) {
  int num1, num2;
  
   Scanner sc=new Scanner(System.in);
   System.out.println("Ingrese un número:");     
  num1 =sc.nextInt();
  System.out.println("Ingrese otro número:");
  num2 =sc.nextInt();
  
  switch (Integer.compare(num1, num2)){
      case 0:
      System.out.println("Ambos números son iguales");
      break;
      case 1:
          System.out.println("EL primer número es mayor que el segundo");
      break;
      case -1:
          System.out.println("El segundo número es mayor que el primero;");
       break;
       
      
  }
   
    }
    
}
