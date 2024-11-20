package EjericioSimilarPar3;

// Moto.java
public class moto extends vehiculo {
    public voto(String marca, String modelo, double precio, String matricula) {
        super(marca, modelo, precio, matricula);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * 0.04; // Impuesto de ejemplo para motos
    }
}