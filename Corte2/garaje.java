package Corte2;

import java.util.ArrayList;
import java.util.List;

// Clase Garaje
public class garaje {
    private List<Vehiculo> vehiculos; 
    private int capacidadTotal;
    private int espaciosOcupados;

    // Constructor
    public garaje(int capacidadTotal) {
        this.vehiculos = new ArrayList<>(); 
        this.capacidadTotal = capacidadTotal;
        this.espaciosOcupados = 0;
    }

    // Método para agregar un vehículo
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (espaciosOcupados < capacidadTotal) {
            vehiculos.add(vehiculo);
            espaciosOcupados++;
            return true;
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

    // Método para contar la cantidad de vehículos por tipo
    public void contarVehiculosPorTipo() {
        int autos = 0, motos = 0, camiones = 0;
        for (Vehiculo vehiculo : vehiculos) {
            switch (vehiculo.getTipo()) {
                case "Auto":
                    autos++;
                    break;
                case "Moto":
                    motos++;
                    break;
                case "Camion":
                    camiones++;
                    break;
            }
        }
        System.out.println("Autos: " + autos);
        System.out.println("Motos: " + motos);
        System.out.println("Camiones: " + camiones);
    }

    // Método para determinar las plazas disponibles en el garaje
    public int plazasDisponibles() {
        return capacidadTotal - espaciosOcupados;
    }
}