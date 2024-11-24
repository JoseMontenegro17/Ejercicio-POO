/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje(10); // Garaje con capacidad de 10 vehículos

        int opcion;
        do {
            System.out.println("\n--- Menú del Garaje ---");
            System.out.println("1. Buscar vehículo por matrícula");
            System.out.println("2. Alquilar un espacio");
            System.out.println("3. Calcular proporción Auto/Moto/Camión");
            System.out.println("4. Ver camiones por tipo");
            System.out.println("5. Plazas disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la matrícula: ");
                    String matricula = scanner.nextLine();
                    int posicion = -1;
                    for (int i = 0; i < garaje.vehiculos.size(); i++) {
                        if (garaje.vehiculos.get(i).getMatricula().equals(matricula)) {
                            posicion = i;
                            break;
                        }
                    }
                    if (posicion != -1) {
                        System.out.println("Vehículo encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el tipo de vehículo (Auto/Moto/Camion): ");
                    String tipo = scanner.nextLine();
                    if (tipo.equalsIgnoreCase("Camion")) {
                        System.out.print("Ingrese el tipo de camión (Sencillo/Doble): ");
                        String tipoCamion = scanner.nextLine();
                        System.out.print("Ingrese la matrícula: ");
                        matricula = scanner.nextLine();
                        System.out.print("Ingrese la marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese el modelo: ");
                        String modelo = scanner.nextLine();
                        Camion camion = new Camion(marca, modelo, matricula, tipoCamion);
                        if (garaje.alquilarEspacio(camion)) {
                            System.out.println("Espacio alquilado para el camión.");
                        } else {
                            System.out.println("No hay espacio disponible para camiones.");
                        }
                    } else {
                        System.out.print("Ingrese la matrícula: ");
                        matricula = scanner.nextLine();
                        System.out.print("Ingrese la marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese el modelo: ");
                        String modelo = scanner.nextLine();
                        if (tipo.equalsIgnoreCase("Auto")) {
                            Auto auto = new Auto(marca, modelo, matricula);
                            if (garaje.alquilarEspacio(auto)) {
                                System.out.println("Espacio alquilado para el auto.");
                            } else {
                                System.out.println("No hay espacio disponible para autos.");
                            }
                        } else if (tipo.equalsIgnoreCase("Moto")) {
                            Moto moto = new Moto(marca, modelo, matricula);
                            if (garaje.alquilarEspacio(moto)) {
                                System.out.println("Espacio alquilado para la moto.");
                            } else {
                                System.out.println("No hay espacio disponible para motos.");
                            }
                        }
                    }
                    break;

                case 3:
                    garaje.calcularProporcionVehiculos();
                    break;

                case 4:
                    garaje.contarCamionesPorTipo();
                    break;

                case 5:
                    System.out.println("Plazas disponibles: " + garaje.plazasDisponibles());
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

