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
public class MatrizTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = scanner.nextInt();
        boolean encontrado = false;
        for (int num : numeros) {
            if (num == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " ha sido encontrado.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el array.");
        }

    }
}


