package garaje2;

public class coche extends vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public coche(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindrada);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        
        if (tieneRadio) {
            this.impuestoCirculacion *= 1.01; // Incremento del 1% en impuesto
        }
        
        if (tieneNavegador) {
            this.impuestoCirculacion *= 1.02; // Incremento del 2% en impuesto
        }

        if (cilindrada > 2999) {
            this.cuotaMesGarage *= 1.2; // Aumento del 20% si la cilindrada es mayor de 2999
        }
    }
}

