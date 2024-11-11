package Corte2;
public class Vehiculo {
    
    private String matricula; 
    private String tipo; // "Auto", "Moto", "Camion"
    protected int capacidadCarga;

    // Constructor
    public Vehiculo(String matricula, String tipo, int capacidadCarga) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.capacidadCarga = capacidadCarga;
    }

   
    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}