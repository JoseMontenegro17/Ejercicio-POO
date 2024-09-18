/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author jose Montenegro 20241222690
 */
import java.util.Scanner;
public class MatrizNif {
 
    private static char calcularLetraNIF(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int index = dni % 23;
        return letras[index];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el DNI de 8 dígitos: ");
        int dni = scanner.nextInt();

        if (dni < 10000000 || dni > 99999999) {
            System.out.println("El DNI debe tener 8 dígitos.");
        } else {
            
            char letra = calcularLetraNIF(dni);

            System.out.printf("%08d-%c\n", dni, letra);
        }

    }
}


