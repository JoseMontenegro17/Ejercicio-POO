package EjericioSimilarPar3;

public class vehiculo extends Vehiculo {
    //atri pa camion
    private int numeroEjes;
    private String tipoCamion; 
    private double capacidadCarga; 

    // Constructor
    public vehiculo(String marca, String modelo, double precio, int numeroEjes, String tipoCamion, double capacidadCarga) {
        super(marca, modelo, precio); 
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;

        // Validar y asignar el núme de ejes según  tipo de camión
        if (tipoCamion.equalsIgnoreCase("Sencillo")) {
            this.numeroEjes = 2;
        } else if (tipoCamion.equalsIgnoreCase("Doble")) {
            if (numeroEjes >= 3 && numeroEjes <= 6) {
                this.numeroEjes = numeroEjes;
            } else {
                throw new IllegalArgumentException("Un camión doble debe tener entre 3 y 6 ejes.");
            }
        } else {
            throw new IllegalArgumentException("Tipo de camión inválido. Debe ser 'Sencillo' o 'Doble'.");
        }
    }

    // Métodos para cálculo de impuesto y cuota de garaje
    public double calcularImpuesto() {
        double impuestoBase = getPrecio() * 0.09; // 9% del precio
        double impuestoCarga = (capacidadCarga / 5) * 10; // $10 por cada 5 toneladas de carga
        return impuestoBase + impuestoCarga;
    }

    public double calcularCuotaGaraje(double cuotaBase) {
        if (tipoCamion.equalsIgnoreCase("Sencillo")) {
            return cuotaBase * 1.75; // Aumenta un 75%
        } else if (tipoCamion.equalsIgnoreCase("Doble")) {
            return cuotaBase * 2.25; // Aumenta un 125%
        }
        return cuotaBase;
    }

    // Getters para los atributos adicionales si son necesarios
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
