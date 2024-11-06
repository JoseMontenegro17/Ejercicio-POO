package EjercicioEnClase;

public class garaje implements iGarage {
    vehiculo[] espacios;
    public static final int NUMERO_ESPACIOS = 10; //num espa garaje
    private int ocupacionMotos = 0;

    public garaje() {
        espacios = new vehiculo[NUMERO_ESPACIOS];
    }

    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (vehiculo v : espacios) {
            if (v != null) {
                ingresos += v.getCuotaMesGaraje();
            }
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(vehiculo v) {
        int count = 0;
        for (vehiculo vehiculo : espacios) {
            if (vehiculo != null && vehiculo.getClass().equals(v.getClass())) {
                count++;
            }
        }
        return count;
    }

    public boolean alquilarEspacio(vehiculo vehiculo) {
        // -80% moto
        if (vehiculo instanceof moto && ocupacionMotos >= NUMERO_ESPACIOS * 0.8) {
            System.out.println("No se pueden alquilar más plazas para motos.");
            return false;
        }

        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                if (vehiculo instanceof moto) {
                    ocupacionMotos++;
                }
                return true;
            }
        }
        System.out.println("No hay más espacios disponibles.");
        return false;
    }

    public boolean retirarVehiculo(String matricula) {
        for (int i = 0; i < NUMERO_ESPACIOS; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(matricula)) {
                if (espacios[i] instanceof moto) {
                    ocupacionMotos--;
                }
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(vehiculo v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularOcupacionPorTipoVehiculo'");
    }
}
