package Corte2;
/**
 * Clase abstracta que representa un vehículo genérico.
 * Proporciona propiedades comunes como marca, modelo y matrícula,
 * así como métodos abstractos para mostrar información y obtener el tipo de vehículo.
 */
public abstract class Vehiculo {
    protected String marca;  // Marca del vehículo
    protected String modelo; // Modelo del vehículo
    protected String matricula; // Matrícula del vehículo

    // Constructor para inicializar las propiedades del vehículo
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Métodos para obtener los valores de las propiedades
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    // Método abstracto para mostrar información del vehículo
    public abstract void mostrarInfo();

    // Método abstracto para obtener el tipo de vehículo (Auto, Moto, etc.)
    public abstract String getTipoVehiculo();
}
