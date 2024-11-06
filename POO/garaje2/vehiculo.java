package garaje2;

public class vehiculo {
    private String matricula;
    private String marca;
    private double precio;
    private int cilindrada;
    protected double impuestoCirculacion;
    protected double cuotaMesGarage;
    
    public static final double CUOTA_BASE = 100;

    public vehiculo(String marca, double precio, int cilindrada) {
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.matricula = null;
        this.cuotaMesGarage = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 7) {
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public void setCuotaMesGarage(double cuotaMesGarage) throws CuotaNegativaException {
        if (cuotaMesGarage < 0) {
            throw new CuotaNegativaException("La cuota no puede ser negativa.");
        }
        this.cuotaMesGarage = cuotaMesGarage;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }
}
