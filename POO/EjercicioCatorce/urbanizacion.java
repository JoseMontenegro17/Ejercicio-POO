package EjercicioCatorce;
import java.util.ArrayList;
import java.util.List;

public class urbanizacion {
    private List<Vivienda> viviendas = new ArrayList<>();

    public void agregarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            total += vivienda.calcularPrecio();
        }
        return total;
    }

    public double calcularPrecioChalets() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            if (vivienda instanceof chalet) {
                total += vivienda.calcularPrecio();
            }
        }
        return total;
    }
}


