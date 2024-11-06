package EjercicioEnClase;

public class moto extends vehiculo {
    private boolean tieneSidecar;

    public moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5; 
        }
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneSidecar) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.1); 
        }
    }

    
    public boolean tieneSidecar() {
        return tieneSidecar;
    }
}
