package EjercicioEnClase;

import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        garaje garaje = new garaje();
        
        while (true) {
            System.out.println("1.- Alquilar un espacio");
            System.out.println("2.- Retirar vehículo");
            System.out.println("3.- Consulta de ingresos mensuales");
            System.out.println("4.- Consulta proporción autos / motos");
            System.out.println("5.- Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("6.- Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    
                    System.out.println("Ingrese tipo de vehículo (1 para Moto, 2 para Auto):");
                    int tipoVehiculo = sc.nextInt();
                    sc.nextLine(); // Consumir la línea
                    System.out.println("Ingrese marca del vehículo:");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese precio del vehículo:");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese cilindraje del vehículo:");
                    int cilindraje = sc.nextInt();
                    sc.nextLine();

                    if (tipoVehiculo == 1) {
                        System.out.println("¿La moto tiene sidecar? (true/false):");
                        boolean tieneSidecar = sc.nextBoolean();
                        moto moto = new moto(marca, precio, cilindraje, tieneSidecar);
                        if (garaje.alquilarEspacio(moto)) {
                            System.out.println("Moto alquilada exitosamente.");
                        }
                    } else if (tipoVehiculo == 2) {
                        System.out.println("¿El auto tiene radio? (true/false):");
                        boolean tieneRadio = sc.nextBoolean();
                        System.out.println("¿El auto tiene navegador? (true/false):");
                        boolean tieneNavegador = sc.nextBoolean();
                        Auto auto = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
                        if (garaje.alquilarEspacio(auto)) {
                            System.out.println("Auto alquilado exitosamente.");
                        }
                    }
                    break;
                case 2:
                    // Lógica para retirar un vehículo
                    System.out.println("Ingrese matrícula del vehículo para retirarlo:");
                    String matriculaRetirar = sc.nextLine();
                    if (garaje.retirarVehiculo(matriculaRetirar)) {
                        System.out.println("Vehículo retirado exitosamente.");
                    } else {
                        System.out.println("No se encontró el vehículo con esa matrícula.");
                    }
                    break;
                case 3:
                    
                    double ingresos = garaje.calcularIngresos();
                    System.out.println("Los ingresos mensuales son: " + ingresos);
                    break;
                case 4:
                    
                    int ocupacionMotos = garaje.calcularOcupacionPorTipoVehiculo(new moto("", 0, 0, false));
                    int ocupacionAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto("", 0, 0, false, false));
                    System.out.println("Proporción de motos: " + ocupacionMotos + "/" + garaje.NUMERO_ESPACIOS);
                    System.out.println("Proporción de autos: " + ocupacionAutos + "/" + garaje.NUMERO_ESPACIOS);
                    break;
                case 5:
                    
                    System.out.println("Listado de vehículos:");
                    for (int i = 0; i < garaje.NUMERO_ESPACIOS; i++) {
                        if (garaje.espacios[i] != null) {
                            vehiculo v = garaje.espacios[i];
                            System.out.println("Matrícula: " + v.getPlaca() +
                                               ", Cuota Mensual: " + v.getCuotaMesGaraje() +
                                               ", Tipo: " + v.getClass().getSimpleName());
                        }
                    }
                    break;
                case 6:
                    
                    System.out.println("Saliendo del sistema.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
