package Corte2;
/**
 * Clase que representa un camión.
 * Extiende la clase abstracta Vehiculo e implementa sus métodos abstractos.
 * Incluye una propiedad adicional para especificar el tipo de camión.
 */
public class Camion extends Vehiculo {
    private String tipoCamion; // Tipo de camión (Sencillo o Doble)

    // Constructor que inicializa las propiedades del camión
    public Camion(String marca, String modelo, String matricula, String tipoCamion) {
        super(marca, modelo, matricula);
        this.tipoCamion = tipoCamion;
    }

    // Método para obtener el tipo de camión
    public String getTipoCamion() {
        return tipoCamion;
    }

    // Implementación del método para mostrar información específica del camión
    @Override
    public void mostrarInfo() {
        System.out.println("Camión - Marca: " + marca + ", Modelo: " + modelo + ", Matrícula: " + matricula + ", Tipo: " + tipoCamion);
    }

    // Implementación del método que devuelve el tipo de vehículo
    @Override
    public String getTipoVehiculo() {
        return "Camion";
    }
}
