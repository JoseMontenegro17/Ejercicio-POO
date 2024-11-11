package Corte2;

public class Main {
    public static void main(String[] args) {

        garaje garaje = new garaje(5);

        camion camion = new camion("ABC123", 4, "Sencillo", 10);

        // Agregar el camión al garaje
        boolean agregado = garaje.agregarVehiculo(camion);

        if (agregado) {
            System.out.println("Camión agregado al garaje.");
        } else {
            System.out.println("No hay espacio disponible en el garaje.");
        }
    }
}