package EjercicioEnClase;

public class moto extends vehiculo {
    private boolean tieneSidecar;

    public moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5; // Incrementa la cuota en 50%
            this.impuestoCirculacion *= 1.1; // Incrementa el impuesto en un 10%
        }
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}

