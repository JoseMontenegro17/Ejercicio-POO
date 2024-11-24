/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejo
 */
public class Vehiculo {

    /**
     *
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

}
