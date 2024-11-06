package Ejercicio15;

import java.util.Scanner;



public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cajaRegistradora caja = new cajaRegistradora("Caja Principal");

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar Contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de moneda: ");
                    double tipo = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades: ");
                    int unidades = scanner.nextInt();
                    if (caja.meterMonedas(tipo, unidades)) {
                        System.out.println("Monedas ingresadas correctamente.");
                    } else {
                        System.out.println("Error al ingresar monedas.");
                    }
                    break;

                case 2:
                    double[] tipos = caja.getTiposDeMonedas();
                    System.out.println("Contenido de la caja:");
                    for (double t : tipos) {
                        System.out.println("Tipo de moneda: " + t + ", Unidades: " + caja.getUnidadesTipoMoneda(t));
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: " + caja.getSaldo());
                    break;

                case 4:
                    System.out.print("Ingrese el tipo de moneda a extraer: ");
                    tipo = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades a extraer: ");
                    unidades = scanner.nextInt();
                    if (caja.extraerMonedas(tipo, unidades)) {
                        System.out.println("Monedas extraídas correctamente.");
                    } else {
                        System.out.println("Error al extraer monedas.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}

