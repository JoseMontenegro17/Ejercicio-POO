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
public class NotasTres {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Ingrese la cantidad de notas:");
                int cantidad = sc.nextInt();
                
                int[] notas = new int[cantidad];
        
                
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese la nota " + (i + 1) + ":");
                    notas[i] = sc.nextInt(); 
                }
                
                System.out.println("Las notas ingresadas son:");
                for (int nota : notas) {
                    System.out.println(nota);
                }
                
                
            }
        }
        

