/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejo
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


