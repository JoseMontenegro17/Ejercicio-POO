/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Jose Alejandro Montenegro Lizcano codigo: 20241222690
 */
//cvd=Cantidadveiculodia//
//canVeiculos: cantidad de veiculos//
import java.util.Random;
import java.util.Scanner;

public class ParcialPooUno {
 
    public static void main(String[] args) {
        int cantvehiculos;
              Scanner sc = new Scanner(System.in);
      Random AzarVeiculo = new Random();
         int[][] Cantvehiculos = new int[30][5];  
       int[] totalVeicuPorDia = new int[30];  
       for (int i = 0; i < 30; i++) {
           for (int cvd= 0; cvd < 5; cvd++) {
             if (cvd == 0 | cvd == 5){ 
                  Cantvehiculos[i][cvd] = AzarVeiculo.nextInt();  
             } else {
                    Cantvehiculos[i][cvd] = AzarVeiculo.nextInt();  
                    
            }
         System.out.print("Ingrese un número de día 1 al 30= "+ " ");
        int dia = sc.nextInt() -1;
        if (dia >= 0 && dia < 30) {
            System.out.println("Día: " + (dia + 1));
            System.out.println("Cantidad de Vehículos por franja horaria:");
            System.out.println("Hora 0-6: " + Cantvehiculos[dia][0]);
            System.out.println("Hora 6-12: " +  Cantvehiculos[dia][1]);
            System.out.println("Hora 12-18:"+  Cantvehiculos[dia][2]);
            System.out.println("Hora18-24:")+ Cantvehiculos[dia][3];
                 
                
            }

            

                  
                  
       
       
                    

         
              
                      
                  }
         
             
         
             
             
             
        
             
             
             
             
        
    }
             
              
             
    
          
         }
    }
}
