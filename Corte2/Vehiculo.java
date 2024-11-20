package Corte2;
public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio; // Precio del vehículo

    // Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Métodos getter
    public String getMarca () {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio(){
        return precio;
    }

    // Método para calcular impuesto de circulación (general, se sobrescribe en subclases)
    public double calcularImpuestoCirculacion() {
        return precio * 0.05; // Ejemplo base: 5% del precio
    }

    // Método para calcular cuota mensual (general, se sobrescribe en subclases)
    public double calcularCuotaMensualGaraje() {
        return 100; // Valor base de la cuota mensual
    }
}

