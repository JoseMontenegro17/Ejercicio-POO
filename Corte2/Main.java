package Corte2;

// Clase Main para probar el funcionamiento
public class Main {
    public static void main(String[] args) {

        garaje garaje = new garaje(5);

        camion camion1 = new camion("ABC123", 4, "Sencillo", 10);
        camion camion2 = new camion("DEF456", 6, "Doble", 15);

        // Agregar los camiones al garaje
        garaje.agregarVehiculo(camion1);
        garaje.agregarVehiculo(camion2);

        // Imprimir el valor de la matrícula para cada camión
        System.out.println("Valor matrícula camion1: " + camion1.calcularValorMatricula());
        System.out.println("Valor matrícula camion2: " + camion2.calcularValorMatricula());

        // Contar vehículos por tipo en el garaje
        garaje.contarVehiculosPorTipo();

        // Verificar plazas disponibles en el garaje
        System.out.println("Plazas disponibles en el garaje: " + garaje.plazasDisponibles());
    }
}