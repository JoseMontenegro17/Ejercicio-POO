package Corte2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        garaje garaje = new garaje(100); 

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Alquilar un espacio para un vehículo");
            System.out.println("2. Buscar un vehículo por matrícula");
            System.out.println("3. Calcular proporciones de Autos/Motos/Camiones");
            System.out.println("4. Contar camiones en el garaje");
            System.out.println("5. Ver plazas disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la matrícula del vehículo: ");
                    String matricula = scanner.next();
                    System.out.print("¿Es un camión? (si/no): ");
                    String esCamion = scanner.next();
                    if (esCamion.equalsIgnoreCase("si")) {
                        System.out.print("Ingrese el tipo de camión (Sencillo/Doble): ");
                        String tipo = scanner.next();
                        System.out.print("Ingrese la capacidad de carga en toneladas: ");
                        double capacidad = scanner.nextDouble();
                        Camion camion = new Camion();
                        garaje.alquilarEspacio(camion);
                    } else {
                        Vehiculo vehiculo = new Vehiculo();
                        garaje.alquilarEspacio(vehiculo);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del vehículo: ");
                    matricula = scanner.next();
                    int posicion = garaje.buscarVehiculo(matricula);
                    if (posicion != -1) {
                        System.out.println("Vehículo encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                case 3:
                    garaje.calcularProporciones();
                    break;
                case 4:
                    System.out.println("Cantidad de camiones en el garaje: " + garaje.contarCamiones());
                    break;
                case 5:
                    System.out.println("Plazas disponibles: " + garaje.plazasDisponibles());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}