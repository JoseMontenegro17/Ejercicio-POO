package Corte2;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private String tipoCamion; // "Sencillo" o "Doble"
    private double capacidadCarga; // En toneladas

    // Constructor
    public Camion(String marca, String modelo, double precio, int numeroEjes, String tipoCamion, double capacidadCarga) {
        super(marca, modelo, precio);

        // Validaciones
        if (tipoCamion.equalsIgnoreCase("Sencillo") && numeroEjes != 2) {
            throw new IllegalArgumentException("Un camión sencillo debe tener exactamente 2 ejes.");
        }
        if (tipoCamion.equalsIgnoreCase("Doble") && (numeroEjes < 3 || numeroEjes > 6)) {
            throw new IllegalArgumentException("Un camión doble debe tener entre 3 y 6 ejes.");
        }

        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;
    }

    // Métodos getter
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    // Sobrescribir método para calcular impuesto de circulación
    @Override
    public double calcularImpuestoCirculacion() {
        double impuestoBase = super.getPrecio() * 0.09;
        double extraPorCarga = Math.ceil(capacidadCarga / 5) * 10; // $10 por cada 5 toneladas
        return impuestoBase + extraPorCarga;
    }

    // Sobrescribir método para calcular cuota mensual del garaje
    @Override
    public double calcularCuotaMensualGaraje() {
        double cuotaBase = super.calcularCuotaMensualGaraje();
        if (tipoCamion.equalsIgnoreCase("Sencillo")) {
            return cuotaBase * 1.75; // Aumenta 75%
        } else if (tipoCamion.equalsIgnoreCase("Doble")) {
            return cuotaBase * 2.25; // Aumenta 125%
        }
        return cuotaBase; // Caso general (no debería ocurrir)
    }
}
