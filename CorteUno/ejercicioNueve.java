/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenegro u20241222690
 /* Crear un programa que declare tres variables de tipo entero y pida al usuario por teclado un valor  
para cada una de ellas. A continuación muestra un mensaje indicando si todos los valores son iguales 
*/
import java.util.Scanner;
public class ejercicioNueve {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Igualdad de valores");
        System.out.println("Ingrese el primer dato:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo dato:");
        num2= sc.nextInt();
        System.out.println("Ingrese el tercer dato");
        num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3){
        
            System.out.println("tus datos son iguales");
            
        }else if( num1 == num2 || num2 == num3 || num1 == num3){
        
            System.out.println("dos de los tres datoa son iguales");
        }else System.out.println("todos los datos son diferentes");
       
       
       }
    }
    

