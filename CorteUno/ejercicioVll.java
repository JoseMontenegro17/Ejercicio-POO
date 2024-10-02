/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Montenegro 20241222690
 */
/*Similar al anterior, pedir por teclado el radio de una circunferencia y calcular
su longitud L=2*PI*r
*/

 import java.util.Scanner;
public class ejercicioVll {
public static void main(String[] args) {
 int radio;
Scanner sc=new Scanner(System.in);
System.out.println("Ingresa el radio de tu circunferencia");
radio= sc.nextInt();
double longitud = Math.PI*Math.pow(2,radio);
    System.out.println("La longitud de la circunferencia es:"+ longitud);
  
    }
}
