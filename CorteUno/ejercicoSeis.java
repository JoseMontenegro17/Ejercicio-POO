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
public class ejercicoSeis {
    /*Solicita por teclado el radio de un círculo, guardar en un int, y
    calcular el área del circulo (el area de un circulo es 2*PI*radio).
    Escriba luego el área por consola. Comprobar que sale con decimales,
    si es que se da el caso
    
    MEJORA: El número Pi se usa como una constante.
    
    */
    public static void main(String[] args) {
        
        int radio;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        radio= sc.nextInt();
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es = " + area);
        
    }
    
}
