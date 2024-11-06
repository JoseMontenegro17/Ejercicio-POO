package ejercicio16;

import java.util.Scanner;

public class pruebaBingo {
    public static void main(String[] args) {
        int[][] carton = { 
            {0, 12, 0, 0, 43, 0, 60, 73, 85},
            {5, 0, 22, 34, 0, 55, 0, 78, 0},
            {9, 0, 0, 38, 45, 0, 69, 0, 90}
        };
        
        if (juegoDelBingo.cartonValido(carton)) {
            System.out.println("El cartón es válido.");
        } else {
            System.out.println("El cartón no es válido.");
            return;
        }
        
        juegoDelBingo juego = new juegoDelBingo(carton);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inicio del juego:");
        
        boolean lineaCantada = false;
        while (!juego.hayBingo()) {
            System.out.print("Ingrese un número a tachar: ");
            int numero = scanner.nextInt();
            
            if (juego.tacharNumero(numero)) {
                System.out.println("Número " + numero + " tachado.");
                if (!lineaCantada && juego.hayLinea()) {
                    System.out.println("¡Línea completada!");
                    lineaCantada = true;
                }
                if (juego.hayBingo()) {
                    System.out.println("¡Bingo!");
                    break;
                }
            } else {
                System.out.println("Número no encontrado en el cartón.");
            }
        }
        scanner.close();
    }
}

