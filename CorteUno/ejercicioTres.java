/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenergo 20241222690
 */
import java.util.Scanner;
/*Crea un programa que pida dos numeros por Scanner  y escribe en consola "los números
son X e Y"
*/
public class ejercicioTres {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int number =sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numberTwo =sc.nextInt();
        System.out.println("Los números son" + " " + number+" " + "e" + " " + numberTwo);
        
    }
    
}
