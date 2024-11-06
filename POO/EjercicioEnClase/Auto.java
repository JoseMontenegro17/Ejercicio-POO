package EjercicioEnClase;


public class Auto extends vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuestoCirculacion();
        if (cilindraje > 2499) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.2);
        }
    }

    @Override
    public void calcularImpuestoCirculacion() {
        super.calcularImpuestoCirculacion();
        if (tieneRadio) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.01); 
        }
        if (tieneNavegador) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.02); 
        }
    }

    
    public boolean tieneRadio() {
        return tieneRadio;
    }

    public boolean tieneNavegador() {
        return tieneNavegador;
    }
}
