/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Alejo
 */
import java.util.Scanner;
public class MatrizDos {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
       System.out.println("Ingrese 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números en orden inverso:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
    }


    
