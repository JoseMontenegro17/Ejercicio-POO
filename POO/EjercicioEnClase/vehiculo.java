package EjercicioEnClase;

public class vehiculo {
    private String placa;
    private String marca;
    private double precio;
    private int cilindraje;
    protected double impuestoCirculacion;
    protected double cuotaMesGaraje;
    
    public static final double CUOTA_BASE = 100; // Cuota base de garaje
    
    // Constructor
    public vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.placa = null;
        this.cuotaMesGaraje = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    // Método para calcular el impuesto de circulación
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = 0.02 * this.precio;
    }

    // Métodos setters y getters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }

    
    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.placa = matricula;
            return true;
        }
        return false;
    }
}
