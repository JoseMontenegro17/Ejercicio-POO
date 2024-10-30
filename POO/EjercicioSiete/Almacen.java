package EjercicioSiete;


    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.nombre + ", Precio: " + producto.calcularPrecio());
        }
    }

    public void productosEnPeligro() {
        for (Producto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.println("Producto en peligro: " + carneFresca.nombre);
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total / productos.size();
    }

    public void eliminarBandejas() {
        productos.removeIf(producto -> 
            producto instanceof CarneCongeladaPiezaEntera && 
            ((CarneCongeladaPiezaEntera) producto).isEnBandeja());
    }
}


