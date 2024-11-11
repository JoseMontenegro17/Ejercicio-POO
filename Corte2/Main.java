package Corte2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        garaje garaje = new garaje(5);
        
        // prueba
        camion camion1 = new camion("ABC123", 4, "Sencillo", 10);
        camion camion2 = new camion("DEF456", 6, "Doble", 15);
        
        // Agregar los camiones al garaje
        garaje.agregarVehiculo(camion1);
        garaje.agregarVehiculo(camion2);
        
        
        int opcion;
        do {
            System.out.println("\n--- Menú del Garaje ---");
            System.out.println("1. Agregar un vehículo");
            System.out.println("2. Ver cantidad de vehículos por tipo");
            System.out.println("3. Ver valor de matrícula de los camiones");
            System.out.println("4. Ver plazas disponibles en el garaje");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    //agregar vehiculo
                    System.out.print("Ingrese el tipo de vehículo (Auto, Moto, Camion): ");
                    String tipo = scanner.next();
                    System.out.print("Ingrese la matrícula: ");
                    String matricula = scanner.next();
                    System.out.print("Ingrese la capacidad de carga: ");
                    int capacidadCarga = scanner.nextInt();
                    
                    Vehiculo vehiculo;
                    if (tipo.equalsIgnoreCase("Camion")) {
                        System.out.print("Ingrese el número de ejes: ");
                        int numeroEjes = scanner.nextInt();
                        System.out.print("Ingrese el tipo de camión (Sencillo o Doble): ");
                        String tipoCamion = scanner.next();
                        vehiculo = new camion(matricula, numeroEjes, tipoCamion, capacidadCarga);
                    } else {
                        vehiculo = new Vehiculo(matricula, tipo, capacidadCarga);
                    }
                    
                    boolean agregado = garaje.agregarVehiculo(vehiculo);
                    if (agregado) {
                        System.out.println("Vehículo agregado al garaje.");
                    } else {
                        System.out.println("No hay espacio disponible en el garaje.");
                    }
                    break;
                    
                case 2:
                    // Opción para ver cantidad de vehículos por tipo
                    garaje.contarVehiculosPorTipo();
                    break;
                    
                case 3:
                    // Opción  ver el valor de matrícula 
                    for (Vehiculo v : garaje.obtenerVehiculos()) {
                        if (v instanceof camion) {
                            camion c = (camion) v;
                            System.out.println("Camión con matrícula " + c.getMatricula() + " tiene un valor de matrícula de: " + c.calcularValorMatricula());
                        }
                    }
                    break;
                    
                case 4:
                    // Opció veer plazas disponibles en el garaje
                    System.out.println("Plazas disponibles en el garaje: " + garaje.plazasDisponibles());
                    break;
                    
                case 5:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                    
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
}