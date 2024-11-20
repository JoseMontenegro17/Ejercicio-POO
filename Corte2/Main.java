package Corte2;

public class Main {
    public static void Main(String[] args) {
        // Crear un camión sencillo
        camion camionSencillo = new camion("Ford", "F750", 80000, 2, "Sencillo", 10);
        System.out.println("Camión Sencillo:");
        System.out.println("Impuesto de circulación: $" + camionSencillo.calcularImpuestoCirculacion());
        System.out.println("Cuota mensual del garaje: $" + camionSencillo.calcularCuotaMensualGaraje());

        // Crear un camión doble
        camion camionDoble = new camion("Mercedes", "Actros", 120000, 4, "Doble", 20);
        System.out.println("\nCamión Doble:");
        System.out.println("Impuesto de circulación: $" + camionDoble.calcularImpuestoCirculacion());
        System.out.println("Cuota mensual del garaje: $" + camionDoble.calcularCuotaMensualGaraje());
    }
}
