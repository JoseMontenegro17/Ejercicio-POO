package EjercicioCatorce;

public class chalet extends Vivienda {
    private boolean conPiscina;

    public chalet(String calle, int superficieEnMetros, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = calcularPrecio() * 0.05;
        if (conPiscina) {
            impuesto += 200;
        }
        return impuesto;
    }
}
