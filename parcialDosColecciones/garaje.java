package parcialDosColecciones;



import java.util.ArrayList;

public class garaje {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidad;
    private int espaciosParaCamiones;

    public garaje(int capacidad) {
        this.capacidad = capacidad;
        this.espaciosParaCamiones = (int) (capacidad * 0.10);
        this.vehiculos = new ArrayList<>();
    }

    public boolean alquilarEspacio(vehiculo vehiculo) {
        if (vehiculos.size() >= capacidad) {
            System.out.println("El garaje está lleno.");
            return false;
        }

        if (contarTipo("Camion") >= espaciosParaCamiones) {
            System.out.println("No hay espacios disponibles para camiones.");
            return false;
        }

        vehiculos.add(vehiculo);
        System.out.println("Vehículo con matrícula " + vehiculo.getMatricula() + " agregado al garaje.");
        return true;
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (vehiculo instanceof Camion) {
            return alquilarEspacio((Camion) vehiculo);
        } else {
            if (vehiculos.size() >= capacidad) {
                System.out.println("El garaje está lleno.");
                return false;
            }

            vehiculos.add(vehiculo);
            System.out.println("Vehículo con matrícula " + vehiculo.getMatricula() + " agregado al garaje.");
            return true;
        }
    }

    private int contarTipo(String tipo) {
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (tipo.equals("Camion") && vehiculo instanceof Camion) {
                count++;
            } else if (tipo.equals("Auto") && vehiculo instanceof Auto) {
                count++;
            } else if (tipo.equals("Moto") && vehiculo instanceof Moto) {
                count++;
            }
        }
        return count;
    }

    public int buscarVehiculo(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    public void calcularProporciones() {
        int autos = contarTipo("Auto");
        int motos = contarTipo("Moto");
        int camiones = contarTipo("Camion");

        System.out.println("Proporciones:");
        System.out.println("Autos: " + autos);
        System.out.println("Motos: " + motos);
        System.out.println("Camiones: " + camiones);
    }

    public int plazasDisponibles() {
        return capacidad - vehiculos.size();
    }

    public int contarCamiones() {
        return contarTipo("Camion");
    }
}


class Vehiculo {
    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

class Camion extends Vehiculo {
    public Camion(String matricula) {
        super(matricula);
    }
}

class Auto extends Vehiculo {
    public Auto(String matricula) {
        super(matricula);
    }
}

class Moto extends Vehiculo {
    public Moto(String matricula) {
        super(matricula);
    }
}
}
