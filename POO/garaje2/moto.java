package garaje2;

public class moto extends vehiculo {
    private boolean tieneSidecar;

    public moto(String marca, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            this.cuotaMesGarage *= 1.5;  // Aumento de 50% en cuota mensual
            this.impuestoCirculacion *= 1.1; // Aumento del 10% en impuesto
        }
    }

    public boolean tieneSidecar() {
        return tieneSidecar;
    }
}
