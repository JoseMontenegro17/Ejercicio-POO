package Corte2;
import java.util.ArrayList;
import java.util.List;

public class garaje {
    private List<Vehiculo> vehiculos; 
    private int capacidadTotal;
    private int espaciosOcupados;

    // Constructor
    public garaje(int capacidadTotal) {
        this.vehiculos = new ArrayList<>(); this.capacidadTotal = capacidadTotal;
        this.espaciosOcupados = 0;
    }

    // Método para agregar un vehículo
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (espaciosOcupados < capacidadTotal) {
            vehiculos.add(vehiculo);
            espaciosOcupados++;
            return true; // Vehículo agregado exitosamente
        }
        return false; // No hay espacio disponible
    }

    // Método para obtener la lista de vehículos
    public List<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    // Método para obtener el número de espacios ocupados
    public int getEspaciosOcupados() {
        return espaciosOcupados;
    }

}