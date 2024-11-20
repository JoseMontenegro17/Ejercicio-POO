package Corte2;

/*import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
  /*  public static void main(String[] args) {
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
//modi con arrayList
   */
// Clase principal para ejecutar el programa
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje(20); // Crear un garaje con 20 plazas

        while (true) {
            // Menú de opciones
            System.out.println("Menú:");
            System.out.println("1. Alquilar espacio");
            System.out.println("2. Calcular proporción de vehículos");
            System.out.println("3. Contar camiones por tipo");
            System.out.println("4. Mostrar plazas disponibles");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Procesa la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese tipo de vehículo (Auto/Moto/Camion): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese matrícula: ");
                    String matricula = scanner.nextLine();

                    if (tipo.equalsIgnoreCase("Auto")) {
                        garaje.alquilarEspacio(new Auto(marca, modelo, matricula));
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        garaje.alquilarEspacio(new Moto(marca, modelo, matricula));
                    } else if (tipo.equalsIgnoreCase("Camion")) {
                        System.out.print("Ingrese tipo de camión (Sencillo/Doble): ");
                        String tipoCamion = scanner.nextLine();
                        garaje.alquilarEspacio(new Camion(marca, modelo, matricula, tipoCamion));
                    }
                    break;
                case 2:
                    garaje.calcularProporcionVehiculos();
                    break;
                case 3:
                    garaje.contarCamionesPorTipo();
                    break;
                case 4:
                    garaje.mostrarPlazasDisponibles();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
    /*Aclaro que ciertas cosas se quitaron */
}
