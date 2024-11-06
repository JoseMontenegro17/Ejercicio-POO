package EjercicioEnClase;

public class moto extends vehiculo {
    private boolean tieneSidecar;

    public moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5; // Aumento del 50% en cuota mensual
        }
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.1); // Aumento del 10% en impuesto
        }
    }

    // Getters y Setters
    public boolean tieneSidecar() {
        return tieneSidecar;
    }
}
