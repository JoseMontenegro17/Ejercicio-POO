package EjercicioOcho;

class Motocicleta extends Vehiculo {
    private String tipo;

    public Motocicleta(String marca, String modelo, int año, String tipo) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }

    @Override
    public void iniciar() {
        System.out.println("La motocicleta está en marcha.");
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Tipo de motocicleta: " + tipo);
    }
}

    

