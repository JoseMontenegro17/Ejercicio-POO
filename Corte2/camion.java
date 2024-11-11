package Corte2;

// Clase Camion que hereda de Vehiculo
public class camion extends Vehiculo {
    private int numeroEjes;
    private String tipoCamion; // "Sencillo", "Doble"

    // Constructor
    public camion(String matricula, int numeroEjes, String tipoCamion, int capacidadCarga) {
        super(matricula, "Camion", capacidadCarga); // Llama al constructor de la clase padre (Vehiculo)
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    // Método para calcular el valor de la matrícula
    public double calcularValorMatricula() {
        double valor = 0;
        if (tipoCamion.equals("Sencillo")) {
            valor = capacidadCarga * 0.9 + 10;
        } else if (tipoCamion.equals("Doble")) {
            valor = capacidadCarga * 0.9 + 20;
        }
        return valor;
    }
}