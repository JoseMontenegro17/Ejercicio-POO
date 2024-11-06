package garaje2;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();

        while (true) {
            System.out.println("\n*** Menú de Gestión del Garaje ***");
            System.out.println("1. Alquilar una plaza");
            System.out.println("2. Baja de alquiler");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción coches / motos");
            System.out.println("5. Listado de matrículas y cuota mensual");
            System.out.println("6. Guardar vehículos en fichero (binario)");
            System.out.println("7. Recuperar vehículos de fichero (binario)");
            System.out.println("8. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer de scanner

            switch (opcion) {
                case 1:
                    // Alquilar una plaza
                    // Código de alquiler (similar a lo que ya tienes)
                    break;

                case 2:
                    // Baja de alquiler
                    // Código para retirar vehículo
                    break;

                case 3:
                    // Consulta de ingresos mensuales
                    try {
                        System.out.println("Ingresos mensuales: " + garaje.calcularIngresos());
                    } catch (VamosALaQuiebraException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    // Consulta proporción coches/motos
                    System.out.println("Proporción coches/motos:");
                    System.out.println("Motos: " + garaje.calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false)));
                    System.out.println("Coches: " + garaje.calcularOcupacionPorTipoVehiculo(new Coche("", 0, 0, false, false)));
                    break;

                case 5:
                    // Listado de vehículos ordenado alfabéticamente
                    garaje.ordenarVehiculos();
                    for (vehiculo v : garaje.getVehiculos()) {
                        System.out.println(v.getMatricula() + " - " + v.getCuotaMesGarage() + " - " + v.getClass().getSimpleName());
                    }
                    break;

                case 6:
                    // Guardar vehículos en fichero (binario)
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehiculos.dat"))) {
                        out.writeObject(garaje.getVehiculos());
                        System.out.println("Vehículos guardados exitosamente.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar vehículos.");
                    }
                    break;

                case 7:
                    // Recuperar vehículos de fichero (binario)
                    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("vehiculos.dat"))) {
                        List<vehiculo> vehiculos = (List<ehiculo>) in.readObject();
                        System.out.println("Vehículos recuperados exitosamente.");
                        // Añadir los vehículos recuperados al garaje
                        for (vehiculo v : vehiculos) {
                            garaje.getVehiculos().add(v);
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error al recuperar vehículos.");
                    }
                    break;

                case 8:
                    // Salir
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
