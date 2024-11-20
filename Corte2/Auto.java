package Corte2;

    /**
 * Clase que representa un automóvil.
 * Extiende la clase abstracta Vehiculo e implementa sus métodos abstractos.
 */
public class Auto extends Vehiculo {

    // Constructor que inicializa las propiedades del automóvil
    public Auto(String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
    }

    // Implementación del método para mostrar información específica del auto
    @Override
    public void mostrarInfo() {
        System.out.println("Auto - Marca: " + marca + ", Modelo: " + modelo + ", Matrícula: " + matricula);
    }

    // Implementación del método que devuelve el tipo de vehículo
    @Override
    public String getTipoVehiculo() {
        return "Auto";
    }
}

