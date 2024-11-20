package Corte2;
import java.util.Scanner;

public class garaje {
    private Vehiculo[] espacios; // Arreglo de espacios en el garaje
    private int capacidad; // Capacidad total del garaje
    private int totalOcupados; // Contador de espacios ocupados
    private int maxCamiones; // Capacidad máxima para camiones

    // Constructor
    public garaje(int capacidad) {
        this.capacidad = capacidad;
        this.espacios = new Vehiculo[capacidad];
        this.totalOcupados = 0;
        this.maxCamiones = (int) (capacidad * 0.1); // 10% de espacios reservados para camiones
    }

    // Método para alquilar un espacio
    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (totalOcupados >= capacidad) {
            System.out.println("El garaje está lleno.");
            return false;
        }

        // Verificar si se exceden los espacios para camiones
        if (vehiculo instanceof camion && contarCamiones() >= maxCamiones) {
            System.out.println("El garaje alcanzó el límite permitido para camiones.");
            return false;
        }

        // Agregar el vehículo al siguiente espacio disponible
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                totalOcupados++;
                System.out.println("Vehículo agregado con éxito en la posición " + i);
                return true;
            }
        }
        return false;
    }

    // Método para buscar un vehículo por matrícula
    public int buscarVehiculo(String matricula) {
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i] != null && espacios[i].getModelo().equalsIgnoreCase(matricula)) {
                return i; // Retornar la posición donde se encontró el vehículo
            }
        }
        return -1; // Retorna -1 si no se encuentra el vehículo
    }

    // Método para calcular la proporción Auto / Moto / Camión
    public void calcularProporciones() {
        int autos = 0, motos = 0, camiones = 0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo instanceof camion) {
                camiones++;
            } else if (vehiculo != null) {
                autos++; // Asumimos que no hay clases separadas para Auto/Moto
            }
        }
        System.out.println("Proporción:");
        System.out.println("Autos: " + autos);
        System.out.println("Camiones: " + camiones);
        System.out.println("Espacios libres: " + (capacidad - totalOcupados));
    }

    // Método para contar camiones por tipo
    public void contarCamionesPorTipo() {
        int sencillos = 0, dobles = 0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo instanceof camion) {
                camion camion = (camion) vehiculo;
                if (camion.getTipoCamion().equalsIgnoreCase("Sencillo")) {
                    sencillos++;
                } else if (camion.getTipoCamion().equalsIgnoreCase("Doble")) {
                    dobles++;
                }
            }
        }
        System.out.println("Camiones Sencillos: " + sencillos);
        System.out.println("Camiones Dobles: " + dobles);
    }

    // Método para determinar la cantidad de plazas disponibles
    public int plazasDisponibles() {
        return capacidad - totalOcupados;
    }

    // Método para contar camiones
    private int contarCamiones() {
        int contador = 0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo instanceof camion) {
                contador++;
            }
        }
        return contador;
    }

    // Método principal para ejecutar el menú
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú del Garaje ---");
            System.out.println("1. Alquilar espacio");
            System.out.println("2. Buscar vehículo");
            System.out.println("3. Calcular proporción Auto / Moto / Camión");
            System.out.println("4. Contar camiones por tipo");
            System.out.println("5. Mostrar plazas disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo (matrícula): ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();

                    System.out.print("¿Es un camión? (si/no): ");
                    String esCamion = scanner.next().toLowerCase();
                    if (esCamion.equals("si")) {
                        System.out.print("Ingrese el número de ejes: ");
                        int ejes = scanner.nextInt();
                        System.out.print("Ingrese el tipo de camión (Sencillo/Doble): ");
                        String tipo = scanner.next();
                        System.out.print("Ingrese la capacidad de carga en toneladas: ");
                        double carga = scanner.nextDouble();
                        Vehiculo camion = new camion(marca, modelo, precio, ejes, tipo, carga);
                        alquilarEspacio(camion);
                    } else {
                        Vehiculo vehiculo = new Vehiculo(marca, modelo, precio);
                        alquilarEspacio(vehiculo);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a buscar: ");
                    String matricula = scanner.nextLine();
                    int posicion = buscarVehiculo(matricula);
                    if (posicion != -1) {
                        System.out.println("El vehículo se encuentra en la posición " + posicion);
                    } else {
                        System.out.println("El vehículo no está en el garaje.");
                    }
                    break;

                case 3:
                    calcularProporciones();
                    break;

                case 4:
                    contarCamionesPorTipo();
                    break;

                case 5:
                    System.out.println("Plazas disponibles: " + plazasDisponibles());
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}

