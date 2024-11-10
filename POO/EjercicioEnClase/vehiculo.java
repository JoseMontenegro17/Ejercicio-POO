package EjercicioEnClase;

public class vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    protected double cuotaMesGaraje;
    
    public static  double CUOTA_BASE = 100.0;
    
    public vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.placa = null;
        this.cuotaMesGaraje = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        }
        return false;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }

    // Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }
}
