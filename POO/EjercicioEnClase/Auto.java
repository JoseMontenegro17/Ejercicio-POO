package EjercicioEnClase;


public class Auto extends vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;

        if (tieneRadio) {
            this.impuestoCirculacion *= 1.01; // Incrementa el impuesto en un 1%
        }
        if (tieneNavegador) {
            this.impuestoCirculacion *= 1.02; // Incrementa el impuesto en un 2%
        }
        if (cilindraje > 2499) {
            this.cuotaMesGaraje *= 1.2; // Incrementa la cuota en un 20%
        }
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }
}
