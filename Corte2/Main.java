package Corte2;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        garaje garaje = new garaje(10); // Garaje con capacidad de 10 vehículos

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
                    int posicion = garaje.buscarVehiculo(matricula);
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
                        Camion camion = new Camion(matricula, tipoCamion);
                        if (garaje.alquilarEspacio(camion)) {
                            System.out.println("Espacio alquilado para el camión.");
                        } else {
                            System.out.println("No hay espacio disponible para camiones.");
                        }
                    } else {
                        System.out.print("Ingrese la matrícula: ");
                        matricula = scanner.nextLine();
                        Vehiculo vehiculo = new Vehiculo(matricula, tipo);
                        if (garaje.alquilarEspacio(vehiculo)) {
                            System.out.println("Espacio alquilado.");
                        } else {
                            System.out.println("No hay espacio disponible.");
                        }
                    }
                    break;

                case 3:
                    garaje.calcularProporcion();
                    break;

                case 4:
                    garaje.camionesPorTipo();
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
