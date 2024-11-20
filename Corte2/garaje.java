package Corte2;
/**
 * Clase que representa un garaje con capacidad limitada para vehículos.
 * Permite alquilar espacios, calcular proporciones de vehículos y contar camiones por tipo.
 */
/*public class garaje implements IGaraje {
    private Vehiculo[][] vehiculos; // Arreglo bidimensional para almacenar vehículos
    private int totalPlazas; // Total de plazas disponibles en el garaje
    private int espaciosCamiones; // Espacios reservados para camiones
    private int currentIndex; // Índice actual de ocupación del garaje

    // Constructor que inicializa las propiedades del garaje
    public garaje(int totalPlazas) {
        this.totalPlazas = totalPlazas;
        this.espaciosCamiones = (int) (totalPlazas * 0.1); // 10% de espacios para camiones
        this.vehiculos = new Vehiculo[totalPlazas][1];
        this.currentIndex = 0;
    }

    /**
     * Alquila un espacio en el garaje para un vehículo.
     * Si es un camión, verifica que haya espacio reservado para ellos.
     */
   /* @Override
    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (currentIndex < totalPlazas) {
            if (vehiculo.getTipoVehiculo().equals("Camion")) {
                if (espaciosCamiones > 0) {
                    vehiculos[currentIndex][0] = vehiculo;
                    espaciosCamiones--;
                    currentIndex++;
                    return true;
                } else {
                    System.out.println("No hay espacios disponibles para camiones.");
                    return false;
                }
            } else {
                vehiculos[currentIndex][0] = vehiculo;
                currentIndex++;
                return true;
            }
        } else {
            System.out.println("Garaje lleno. No se puede alquilar más espacios.");
            return false;
        }
    }

    /**
     * Calcula y muestra la proporción de vehículos por tipo.
     */
    /*@Override
    public void calcularProporcionVehiculos() {
        int countAuto = 0, countMoto = 0, countCamion = 0;

        for (int i = 0; i < currentIndex; i++) {
            String tipo = vehiculos[i][0].getTipoVehiculo();
            switch (tipo) {
                case "Auto" -> countAuto++;
                case "Moto" -> countMoto++;
                case "Camion" -> countCamion++;
            }
        }

        int totalVehiculos = currentIndex;
        if (totalVehiculos > 0) {
            System.out.println("Proporción de vehículos:");
            System.out.printf("Autos: %.2f%%%n", (countAuto * 100.0 / totalVehiculos));
            System.out.printf("Motos: %.2f%%%n", (countMoto * 100.0 / totalVehiculos));
            System.out.printf("Camiones: %.2f%%%n", (countCamion * 100.0 / totalVehiculos));
        } else {
            System.out.println("No hay vehículos en el garaje.");
        }
    }

    /**
     * Cuenta los camiones por tipo (Sencillo o Doble).
     */
   /* @Override
    public void contarCamionesPorTipo() {
        int countSencillo = 0, countDoble = 0;

        for (int i = 0; i < currentIndex; i++) {
            if (vehiculos[i][0] instanceof Camion camion) {
                if (camion.getTipoCamion().equals("Sencillo")) {
                    countSencillo++;
                } else if (camion.getTipoCamion().equals("Doble")) {
                    countDoble++;
                }
            }
        }

        System.out.println("Cantidad de camiones:");
        System.out.println("Sencillos: " + countSencillo);
        System.out.println("Dobles: " + countDoble);
    }

    /**
     * Devuelve el número de plazas disponibles en el garaje.
     */
    /*@Override
    public int plazasDisponibles() {
        return totalPlazas - currentIndex;
    }

    /**
     * Muestra las plazas disponibles en el garaje.
     */
  /*  public void mostrarPlazasDisponibles() {
        System.out.println("Plazas disponibles: " + plazasDisponibles());
    }
}
   */
//nuevas modificaciones con arrayList
import java.util.ArrayList;
import java.util.List;

// Clase Garaje que implementa la interfaz IGaraje
class garaje implements IGaraje {
    private List<Vehiculo> vehiculos;    // Lista de vehículos
    private int totalPlazas;             // Total de plazas en el garaje
    private int espaciosCamiones;        // Espacios reservados para camiones

    public garaje(int totalPlazas) {
        this.totalPlazas = totalPlazas;
        this.espaciosCamiones = (int) (totalPlazas * 0.1); // 10% de las plazas para camiones
        this.vehiculos = new ArrayList<>();  // Inicializa la lista de vehículos
    }

    @Override
    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculos.size() < totalPlazas) {
            if (vehiculo instanceof Camion) {
                if (espaciosCamiones > 0) {
                    vehiculos.add(vehiculo);    // Añade el camión a la lista
                    espaciosCamiones--;         // Reduce el espacio para camiones
                    return true;
                } else {
                    System.out.println("No hay espacios disponibles para camiones.");
                    return false;
                }
            } else {
                vehiculos.add(vehiculo);       // Añade cualquier otro vehículo
                return true;
            }
        } else {
            System.out.println("Garaje lleno. No se puede alquilar más espacios.");
            return false;
        }
    }

    @Override
    public void calcularProporcionVehiculos() {
        int countAuto = 0;
        int countMoto = 0;
        int countCamion = 0;

        // Recorre la lista para contar los vehículos
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Auto) {
                countAuto++;
            } else if (vehiculo instanceof Moto) {
                countMoto++;
            } else if (vehiculo instanceof Camion) {
                countCamion++;
            }
        }

        // Calcula la proporción
        int totalVehiculos = countAuto + countMoto + countCamion;
        if (totalVehiculos > 0) {
            System.out.println("Proporción de vehículos:");
            System.out.println("Autos: " + (countAuto * 100.0 / totalVehiculos) + "%");
            System.out.println("Motos: " + (countMoto * 100.0 / totalVehiculos) + "%");
            System.out.println("Camiones: " + (countCamion * 100.0 / totalVehiculos) + "%");
        } else {
            System.out.println("No hay vehículos en el garaje.");
        }
    }

    @Override
    public void contarCamionesPorTipo() {
        int countSencillo = 0;
        int countDoble = 0;

        // Recorre la lista para contar los camiones
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                if (camion.getTipoCamion().equals("Sencillo")) {
                    countSencillo++;
                } else if (camion.getTipoCamion().equals("Doble")) {
                    countDoble++;
                }
            }
        }

        // Muestra los resultados
        System.out.println("Cantidad de camiones en el garaje:");
        System.out.println("Camiones Sencillos: " + countSencillo);
        System.out.println("Camiones Dobles: " + countDoble);
    }

    @Override
    public int plazasDisponibles() {
        return totalPlazas - vehiculos.size();  // Devuelve las plazas disponibles
    }

    public void mostrarPlazasDisponibles() {
        // Muestra las plazas disponibles
        System.out.println("Plazas disponibles en el garaje: " + plazasDisponibles());
    }
}
