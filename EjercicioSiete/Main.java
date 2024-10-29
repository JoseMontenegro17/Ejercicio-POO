package EjercicioSiete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de producto (carne/pescado): ");
                    String tipo = scanner.nextLine();
                    
                    if (tipo.equalsIgnoreCase("carne")) {
                        System.out.print("Ingrese el nombre de la carne: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el peso (kg): ");
                        double peso = scanner.nextDouble();
                        System.out.print("Ingrese el precio por kilo: ");
                        double precioKilo = scanner.nextDouble();
                        System.out.print("Ingrese el origen (vacuno/avícola): ");
                        String origen = scanner.next();
                        System.out.print("Ingrese el tipo (fresca/congelada): ");
                        String tipoCarne = scanner.next();
                        
                        if (tipoCarne.equalsIgnoreCase("fresca")) {
                            System.out.print("Ingrese los días de caducidad: ");
                            int diasCaducidad = scanner.nextInt();
                            almacen.añadirProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));
                        } else if (tipoCarne.equalsIgnoreCase("congelada")) {
                            System.out.print("Ingrese la empresa distribuidora: ");
                            String empresaDistribuidora = scanner.next();
                            System.out.print("Ingrese si viene en bandeja (true/false): ");
                            boolean enBandeja = scanner.nextBoolean();
                            System.out.print("Ingrese si es de pieza troceada (true/false): ");
                            boolean esTroceada = scanner.nextBoolean();
                            
                            if (esTroceada) {
                                System.out.print("Ingrese el número medio de piezas: ");
                                int numeroPiezas = scanner.nextInt();
                                almacen.añadirProducto(new CarneCongeladaPiezaTroceada(nombre, peso, precioKilo, origen, empresaDistribuidora, numeroPiezas));
                            } else {
                                almacen.añadirProducto(new CarneCongeladaPiezaEntera(nombre, peso, precioKilo, origen, empresaDistribuidora, enBandeja));
                            }
                        }
                    } else if (tipo.equalsIgnoreCase("pescado")) {
                        System.out.print("Ingrese el nombre del pescado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el peso (kg): ");
                        double peso = scanner.nextDouble();
                        System.out.print("Ingrese el precio por kilo: ");
                        double precioKilo = scanner.nextDouble();
                        almacen.añadirProducto(new Pescado(nombre, peso, precioKilo));
                    } else {
                        System.out.println("Tipo de producto no válido.");
                    }
                    break;
                case 2:
                    almacen.listarProductos();
                    break;
                case 3:
                    almacen.productosEnPeligro();
                    break;
                case 4:
                    double precioMedio = almacen.calcularPrecioMedio();
                    System.out.println("Precio medio: " + precioMedio);
                    break;
                case 5:
                    almacen.eliminarBandejas();
                    System.out.println("Se han eliminado las carnes congeladas en bandeja.");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
        
        scanner.close();
    }
}
