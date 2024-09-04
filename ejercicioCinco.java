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
public class ejercicioCinco {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String Name =cs.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad =cs.nextInt();
        
        System.out.println("Me llamo"+ " "+Name+ " "+ "y tengo"+ " "+edad+ "años.");
    }
    
}
