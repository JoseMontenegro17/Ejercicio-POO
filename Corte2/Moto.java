package Corte2;

/**
 * Clase que representa una motocicleta.
 * Extiende la clase abstracta Vehiculo e implementa sus métodos abstractos.
 */
public class Moto extends Vehiculo {

    // Constructor que inicializa las propiedades de la motocicleta
    public Moto(String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
    }

    // Implementación del método para mostrar información específica de la moto
    @Override
    public void mostrarInfo() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Matrícula: " + matricula);
    }

    // Implementación del método que devuelve el tipo de vehículo
    @Override
    public String getTipoVehiculo() {
        return "Moto";
    }
}
