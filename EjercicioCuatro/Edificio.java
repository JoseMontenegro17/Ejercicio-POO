package EjercicioCuatro;

 import java.util.Scanner;

public class Edificio {
    private static Ascensor ascensor1 = new Ascensor(5, 0); // Ascensor en la planta 0
    private static Ascensor ascensor2 = new Ascensor(5, 10); // Ascensor en la planta superior

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> añadirOcupanteAscensor(ascensor1);
                case 2 -> añadirOcupanteAscensor(ascensor2);
                case 3 -> quitarOcupanteAscensor(ascensor1);
                case 4 -> quitarOcupanteAscensor(ascensor2);
                case 5 -> moverAscensor(ascensor1, scanner);
                case 6 -> moverAscensor(ascensor2, scanner);
                case 7 -> mostrarEstadoAscensores();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

            // Reglas de movimiento de ascensores
            ajustarAscensorAPlantaCero();

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Añadir ocupante al ascensor 1");
        System.out.println("2. Añadir ocupante al ascensor 2");
        System.out.println("3. Salir ocupante del ascensor 1");
        System.out.println("4. Salir ocupante del ascensor 2");
        System.out.println("5. Mover ascensor 1");
        System.out.println("6. Mover ascensor 2");
        System.out.println("7. Mostrar estado de los ascensores");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void añadirOcupanteAscensor(Ascensor ascensor) {
        ascensor.añadirOcupante();
    }

    private static void quitarOcupanteAscensor(Ascensor ascensor) {
        ascensor.quitarOcupante();
    }

    private static void moverAscensor(Ascensor ascensor, Scanner scanner) {
        System.out.print("Ingrese el piso al que se quiere mover el ascensor (0-10): ");
        int pisoDestino = scanner.nextInt();
        if (ascensor.mover(pisoDestino)) {
            System.out.println("Ascensor movido al piso " + pisoDestino);
        }
    }

    private static void ajustarAscensorAPlantaCero() {
        if (ascensor1.getOcupacion() == 0 && ascensor1.getPisoActual() != 0) {
            if (ascensor2.getPisoActual() == 0) {
                ascensor1.setPisoActual(0);
                System.out.println("Ascensor 1 ha regresado a la planta 0 por estar vacío.");
            }
        } else if (ascensor2.getOcupacion() == 0 && ascensor2.getPisoActual() != 0) {
            if (ascensor1.getPisoActual() == 0) {
                ascensor2.setPisoActual(0);
                System.out.println("Ascensor 2 ha regresado a la planta 0 por estar vacío.");
            }
        }
    }

    public static void mostrarEstadoAscensores() {
        System.out.println("\n--- Estado de los Ascensores ---");
        System.out.println("Ascensor 1:");
        System.out.println("Capacidad: " + ascensor1.getCapacidad());
        System.out.println("Ocupación: " + ascensor1.getOcupacion());
        System.out.println("Consumo: " + ascensor1.getConsumo());
        System.out.println("Piso Actual: " + ascensor1.getPisoActual());

        System.out.println("Ascensor 2:");
        System.out.println("Capacidad: " + ascensor2.getCapacidad());
        System.out.println("Ocupación: " + ascensor2.getOcupacion());
        System.out.println("Consumo: " + ascensor2.getConsumo());
        System.out.println("Piso Actual: " + ascensor2.getPisoActual());
    }
}


