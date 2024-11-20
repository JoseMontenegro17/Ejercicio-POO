package EjericioSimilarPar3;

// Garaje.java
import java.util.ArrayList;

public class garaje {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidadTotal;

    public garaje(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.vehiculos = new ArrayList<>();
    }

    // a) Buscar vehículo por matrícula
    public int buscarVehiculo(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                return i;
            }
        }
        return -99; // No encontrado
    }

    // b) Retornar la cantidad de vehículos de un tipo específico
    public int contarVehiculosPorTipo(Class<? extends Vehiculo> tipoClase) {
        int contador = 0;
        for (vehiculo vehiculo : vehiculos) {
            if (tipoClase.isInstance(vehiculo)) {
                contador++;
            }
        }
        return contador;
    }

    // c) Alquilar espacio considerando el 20% para camionetas y 30% para motos
    public boolean alquilarEspacio(camioneta vehiculo) {
        int maxEspaciosCamionetas = (int) (capacidadTotal * 0.2);
        int maxEspaciosMotos = (int) (capacidadTotal * 0.3);

        int camionetasEnGaraje = contarVehiculosPorTipo(Camioneta.class);
        int motosEnGaraje = contarVehiculosPorTipo(Moto.class);

        if (vehiculos.size() < capacidadTotal) {
            if (vehiculo instanceof Camioneta && camionetasEnGaraje >= maxEspaciosCamionetas) {
                System.out.println("Espacios para camionetas llenos.");
                return false;
            }
            if (moto instanceof Moto && motosEnGaraje >= maxEspaciosMotos) {
                System.out.println("Espacios para motos llenos.");
                return false;
            }
            vehiculos.add(auto);
            return true;
        }
        System.out.println("Garaje lleno.");
        return false;
    }

    // d) Calcular proporción Auto / Moto / Camioneta
    public void calcularProporcion() {
        int autos = contarVehiculosPorTipo(Auto.class);
        int motos = contarVehiculosPorTipo(Moto.class);
        int camionetas = contarVehiculosPorTipo(Camioneta.class);

        System.out.println("Proporción - Autos: " + autos + ", Motos: " + motos + ", Camionetas: " + camionetas);
    }

    // e) Contar camionetas por tipo de servicio
    public void contarCamionetasPorTipo() {
        int suv = 0, pickup = 0, carga = 0, otro = 0;
        for (vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                switch (camioneta.getTipoServicio().toLowerCase()) {
                    case "suv": suv++; break;
                    case "pickup": pickup++; break;
                    case "carga": carga++; break;
                    default: otro++; break;
                }
            }
        }
        System.out.println("Camionetas por tipo - SUV: " + suv + ", Pickup: " + pickup + ", Carga: " + carga + ", Otro: " + otro);
    }
}