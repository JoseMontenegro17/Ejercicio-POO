package EjercicioCatorce;

public class Principal {
    public static void main(String[] args) {
        urbanizacion urbanizacion = new urbanizacion();

        piso piso = new piso("Calle A", 50, 2, 5);
        Adosado adosado = new Adosado("Calle B", 80, 2);
        chalet chaletConPiscina = new chalet("Calle C", 120, true);
        chalet chaletSinPiscina = new chalet("Calle D", 100, false);

        urbanizacion.agregarVivienda(piso);
        urbanizacion.agregarVivienda(adosado);
        urbanizacion.agregarVivienda(chaletConPiscina);
        urbanizacion.agregarVivienda(chaletSinPiscina);

        System.out.println("Precio total de todas las viviendas: " + urbanizacion.calcularPrecioTotal());
        System.out.println("Precio total de todos los chalets: " + urbanizacion.calcularPrecioChalets());
    }
}
