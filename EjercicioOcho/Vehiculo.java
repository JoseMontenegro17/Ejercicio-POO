package EjercicioOcho;



class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void iniciar() {
        System.out.println("El coche está en marcha.");
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}