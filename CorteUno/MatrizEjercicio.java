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
public class MatrizEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        for (int num : numeros) {
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }
         System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);

        
        if (sumaPares > sumaImpares) {
            System.out.println("La suma de los números pares es mayor.");
        } else if (sumaPares < sumaImpares) {
            System.out.println("La suma de los números impares es mayor.");
        } else {
            System.out.println("La suma de los números pares e impares es igual.");
        }

        
      
    }
}

