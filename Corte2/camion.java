package Corte2;

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

}
