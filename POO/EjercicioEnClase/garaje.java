package EjercicioEnClase;

public class garaje implements iGarage {
    public static final int NUMERO_ESPACIOS = 10; // Número total de espacios en el garaje
    vehiculo[] espacios; // Arreglo para almacenar los vehículos

    public garaje() {
        this.espacios = new vehiculo[NUMERO_ESPACIOS];
    }

    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] != null) {
                ingresos += espacios[i].getCuotaMesGaraje();
            }
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(vehiculo v) {
        int contador = 0;
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] != null && espacios[i].getClass().equals(v.getClass())) {
                contador++;
            }
        }
        return contador;
    }

    public boolean alquilarEspacio(vehiculo vehiculo) {
        if (vehiculo.getPlaca() == null || vehiculo.getPlaca().isEmpty()) {
            System.out.println("No se puede alquilar un vehículo sin matrícula.");
            return false;
        }

        // Verificar si el garaje está lleno
        boolean espacioDisponible = false;
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] == null) {
                espacioDisponible = true;
                if (vehiculo instanceof moto) {
                    int ocupacionMotos = calcularOcupacionPorTipoVehiculo(new moto("", 0, 0, false));
                    if (ocupacionMotos >= NUMERO_ESPACIOS * 0.8) {
                        System.out.println("No se puede alquilar más del 80% de los espacios a motos.");
                        return false;
                    }
                }
                for (int j = 0; j < NUMERO_ESPACIOS; j++) {
                    if (espacios[j] == null) {
                        espacios[j] = vehiculo;
                        System.out.println("Vehículo alquilado exitosamente.");
                        return true;
                    }
                }
            }
        }

        if (!espacioDisponible) {
            System.out.println("No hay espacio disponible.");
            return false;
        }
        return true;
    }

    public boolean retirarVehiculo(String matricula) {
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(matricula)) {
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }
}
