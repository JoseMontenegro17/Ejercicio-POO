/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Motenegro 20241222690
 */
import java.util.Scanner;

/* Crea un programa que pide dos números por Scanner y escribe en consola
la suma de ambos,con el texto"XX mas YY son ZZ"
*/
public class ejercicoCuatro {
    public static void main(String[] args) {
        int number1;
        int number2;
        int suma;
        System.out.println("Suma de dos numeros");
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        number1 =sc.nextInt();
        System.out.println("Ingresa el segundo número");
        number2 =sc.nextInt();
        
        suma= number1 + number2;
        System.out.println("La suma de ambos,"+" "+ number1 +"  "+ "mas"+" "+ number2+" "+ "son"+" "+ suma);
        
    }
    
}
