/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Jose Alejandro Montenegro Lizcano codigo: 20241222690
 */
package app;

import java.util.Random;
import java.util.Scanner;

public class ParcialMejor {

    public static void main(String[] args) {
        int dias = 30;
        int franjas = 4;
        int[][] Cantvehiculos = new int[dias][franjas];
        int[] totalVeicuPorDia = new int[dias];
        Scanner sc = new Scanner(System.in);
        Random AzarVeiculo = new Random();
        for (int i = 0; i < dias; i++) {
           
            Cantvehiculos[i][0] = AzarVeiculo.nextInt(71) + 10; 
            Cantvehiculos[i][3] = AzarVeiculo.nextInt(71) + 10;
            Cantvehiculos[i][1] = AzarVeiculo.nextInt(91) + 60; 
            Cantvehiculos[i][2] = AzarVeiculo.nextInt(91) + 60; 

            
            totalVeicuPorDia[i] = Cantvehiculos[i][0] + Cantvehiculos[i][1] + Cantvehiculos[i][2] + Cantvehiculos[i][3];
        }
        System.out.print("Ingrese un número del día 1 al 30: ");
        int dia = sc.nextInt() - 1; 

        if (dia >= 0 && dia < 30) {
           
            System.out.println("Día: " + (dia + 1));
            System.out.println("Cantidad de Vehículos por franja horaria:");
            System.out.println("Hora 0-6: " + Cantvehiculos[dia][0]);
            System.out.println("Hora 6-12: " + Cantvehiculos[dia][1]);
            System.out.println("Hora 12-18: " + Cantvehiculos[dia][2]);
            System.out.println("Hora 18-24: " + Cantvehiculos[dia][3]);

            System.out.println("   ");
            int totalFranja00_12 = Cantvehiculos[dia][0] + Cantvehiculos[dia][1];
            int totalFranja12_24 = Cantvehiculos[dia][2] + Cantvehiculos[dia][3];
            System.out.println("Total vehículos  00-12: " + totalFranja00_12);
            System.out.println("Total vehículos  12-24: " + totalFranja12_24);
        } else {
            System.out.println("Día inválido. Debe ser un número entre 1 y 30.");
        }

        int[] promedioFran = new int[franjas]; 
        for (int f = 0; f < franjas; f++) {
            int sumaFranja = 0;
            for (int d = 0; d < dias; d++) {
                sumaFranja += Cantvehiculos[d][f];
            }
            promedioFran[f] = sumaFranja / dias;
            System.out.println("Promedio de vehículos en la franja " + (f * 6) + "-" + ((f + 1) * 6) + ": " + promedioFran[f]);
            System.out.println("  ");
        }
        int diaMayor = 0, diaMenor = 0;
        int maximoVehiculos = totalVeicuPorDia[0], minVehiculos = totalVeicuPorDia[0];

        for (int i = 1; i < dias; i++) {
            if (totalVeicuPorDia[i] > maximoVehiculos) {
                maximoVehiculos = totalVeicuPorDia[i];
                diaMayor = i;
            }
            if (totalVeicuPorDia[i] < minVehiculos) {
                minVehiculos = totalVeicuPorDia[i];
                diaMenor = i;
            }
        }

        System.out.println("El día con mayor circulación de vehículos fue el día " + (diaMayor + 1) + " con " + maximoVehiculos + " vehículos.");
        System.out.println("   ");
        System.out.println("El día con menor circulación de vehículos fue el día " + (diaMenor + 1) + " con " + minVehiculos + " vehículos.");

        
        
    }
}


