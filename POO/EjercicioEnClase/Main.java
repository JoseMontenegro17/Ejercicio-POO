package EjercicioEnClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        garaje garaje = new garaje();
        
        while (true) {
            System.out.println("------ Menú de Gestión del Garaje ------");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas y cuota mensual");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    // Alquilar un espacio
                    System.out.print("Ingresa el tipo de vehículo (1. Moto, 2. Auto): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingresa la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingresa el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingresa el cilindraje del vehículo: ");
                    int cilindraje = scanner.nextInt();
                    
                    vehiculo vehiculo = null;
                    if (tipo == 1) {
                        System.out.print("¿La moto tiene sidecar? (true/false): ");
                        boolean tieneSidecar = scanner.nextBoolean();
                        vehiculo = new moto(marca, precio, cilindraje, tieneSidecar);
                    } else if (tipo == 2) {
                        System.out.print("¿El auto tiene radio? (true/false): ");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.print("¿El auto tiene navegador? (true/false): ");
                        boolean tieneNavegador = scanner.nextBoolean();
                        vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
                    }
                    
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingresa la matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    
                    if (vehiculo.matricular(matricula)) {
                        if (garaje.alquilarEspacio(vehiculo)) {
                            System.out.println("Vehículo alquilado con éxito.");
                        } else {
                            System.out.println("No se pudo alquilar el espacio.");
                        }
                    } else {
                        System.out.println("La matrícula no es válida.");
                    }
                    break;
                
                case 2:
                    // Retirar vehículo
                    System.out.print("Ingresa la matrícula del vehículo a retirar: ");
                    String matriculaRetiro = scanner.nextLine();
                    vehiculo vehiculoRetiro = null;
                    for (vehiculo v : garaje.vehiculos) {
                        if (v.getPlaca().equals(matriculaRetiro)) {
                            vehiculoRetiro = v;
                            break;
                        }
                    }
                    
                    if (vehiculoRetiro != null && garaje.retirarVehiculo(vehiculoRetiro)) {
                        System.out.println("Vehículo retirado con éxito.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                
                case 3:
                    // Consulta de ingresos mensuales
                    System.out.println("Ingresos mensuales: " + garaje.calcularIngresos());
                    break;
                
                case 4:
                    // Consulta proporción autos/motos
                    System.out.println("Proporción de motos: " + garaje.calcularOcupacionPorTipoVehiculo(new moto("", 0, 0, false)));
                    System.out.println("Proporción de autos: " + garaje.calcularOcupacionPorTipoVehiculo(new Auto("", 0, 0, false, false)));
                    break;
                
                case 5:
                    // Listado de matrículas y cuota mensual
                    garaje.listarVehiculos();
                    break;
                
                case 6:
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    return;
                
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción correcta.");
                    break;
            }
        }
    }
}
