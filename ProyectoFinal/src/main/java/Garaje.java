/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejo
 */
import java.util.ArrayList;

public class Garaje implements IGaraje {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidad;

    // Constructor que inicializa el garaje con una capacidad máxima de vehículos
    public Garaje(int capacidad) {
        this.capacidad = capacidad;
        this.vehiculos = new ArrayList<>();
    }

    // Implementación del método para alquilar un espacio en el garaje
    @Override
    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculos.size() < capacidad) {
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    // Implementación del método para calcular la proporción de vehículos por tipo
    @Override
    public void calcularProporcionVehiculos() {
        int autos = 0, motos = 0, camiones = 0;
        for (Vehiculo v : vehiculos) {
            switch (v.getTipoVehiculo()) {
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
        System.out.println("Proporción de vehículos en el garaje:");
        System.out.println("Autos: " + autos);
        System.out.println("Motos: " + motos);
        System.out.println("Camiones: " + camiones);
    }

    // Implementación del método para contar los camiones por tipo
    @Override
    public void contarCamionesPorTipo() {
        int sencillo = 0, doble = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                Camion camion = (Camion) v;
                if ("Sencillo".equalsIgnoreCase(camion.getTipoCamion())) {
                    sencillo++;
                } else {
                    doble++;
                }
            }
        }
        System.out.println("Camiones Sencillos: " + sencillo);
        System.out.println("Camiones Dobles: " + doble);
    }

    // Implementación del método para obtener las plazas disponibles en el garaje
    @Override
    public int plazasDisponibles() {
        return capacidad - vehiculos.size();
    }
}
