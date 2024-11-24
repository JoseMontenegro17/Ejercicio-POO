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

   
//nuevas modificaciones con arrayList
//*import java.util.ArrayList;
//import java.util.List;

// Clase Garaje que implementa la interfaz IGaraje
/*class garaje implements IGaraje {
    //private List<Vehiculo> vehiculos;    // Lista de vehículos
    private int totalPlazas;             // Total de plazas en el garaje
    private int espaciosCamiones;        // Espacios reservados para camiones

    public garaje(int totalPlazas) {
        this.totalPlazas = totalPlazas;
        this.espaciosCamiones = (int) (totalPlazas * 0.1); // 10% de las plazas para camiones
        this.vehiculos = new ArrayList<>();  // Inicializa la lista de vehículos
    }

    //@Override
    //public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculos.size() < totalPlazas) {
      //      if (vehiculo instanceof Camion) {
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

    //@Override
    public void calcularProporcionVehiculos() {
        int countAuto = 0;
        int countMoto = 0;
        int countCamion = 0;

        // Recorre la lista para contar los vehículos
      //  for (Vehiculo vehiculo : vehiculos) {
        //    if (vehiculo instanceof Auto) {
                countAuto++;
          /  } else if (vehiculo instanceof Moto) {
                countMoto++;
           / } else if (vehiculo instanceof Camion) {
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
        /for (Vehiculo vehiculo : vehiculos) {
         /   if (vehiculo instanceof Camion) {
          /      Camion camion = (Camion) vehiculo;
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

    //@Override
    public int plazasDisponibles() {
        return totalPlazas - vehiculos.size();  // Devuelve las plazas disponibles
    }

    public void mostrarPlazasDisponibles() {
        // Muestra las plazas disponibles
        System.out.println("Plazas disponibles en el garaje: " + plazasDisponibles());
    }
}
