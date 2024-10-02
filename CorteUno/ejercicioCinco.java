/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenegro 20241222690
 */
import java.util.Scanner;
/* Crear un programa que pida dos valores, el nombre y la edad de una persona,
y escriba en consola "me llamo xxx tenfo FF años"
*/
public class ejercicioCinco {
    public static void main(String[] args) {
        System.out.println("Datos personales nombre y edad");
        Scanner cs= new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String Name =cs.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad =cs.nextInt();
        
        System.out.println("Me llamo"+ " "+Name+ " "+ "y tengo"+ " "+edad+ "años.");
    }
    
}
