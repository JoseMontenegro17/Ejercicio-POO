package EjercicioSiete;

/*Se necesita hacer una aplicación que gestione el almacén de Mercaregala.
Mercaregala solo vende Productos que cumplen estas reglas:
- Los Productos almacenan su nombre, el peso y el preciokilo. Sólo se gestionan dos tipos de
productos, Carnes y Pescados.
- De las carnes vamos a controlar el origen (que sólo puede ser “vacuno” o “avícola”). Además, hay
carnes frescas, que deben guardar los días de caducidad, y carnes congeladas, que guardan la
información de la empresa distribuidora. Además hay dos tipos de carnes congeladas, las de pieza
entera, que debe reflejar si viene en bandeja o no, y las de pieza troceada, que refleja el número
medio de piezas que contiene.
- De los pescados, se trata el tipo de pescado, el peso y el preciokilo.
- El almacén debe gestionarse con una única colección (array, lista, conjunto, mapa... a elegir por el
programador), que puede incluir cualquier tipo de producto.
- Todos los productos deben cumplir con una interfaz que únicamente contiene el
método double calcularPrecio() , que deberá calcular el precio de un producto multiplicando su
peso por el preciokilo.
La aplicación debe tener un menú con estas opciones:
1.- Añadir producto.
Se pide al usuario los datos necesarios para introducir un producto en la colección. Se ha de
empezar por pedir que tipo de producto, y luego, los atributos de dicho producto.
2.- Listar productos.
Lista todos los productos del almacén: de cada uno, muestra su nombre y su precio.
3.- Productos en peligro
Lista las carnes frescas del almacén que tienen menos de 10 días de caducidad
4.- Calculo precio medio
Calcula el precio medio de los precios de todos los productos
5.- Eliminar bandejas
Elimina de la colección todas las carnes congeladas en pieza que vengan con bandeja. */

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
