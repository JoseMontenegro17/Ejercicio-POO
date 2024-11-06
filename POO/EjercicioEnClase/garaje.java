package EjercicioEnClase;

import java.util.ArrayList;

public class garaje implements iGarage {
    public static final int NUMERO_ESPACIOS = 10;
    ArrayList<vehiculo> vehiculos = new ArrayList<>();

    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (vehiculo v : vehiculos) {
            ingresos += v.getCuotaMesGaraje();
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(vehiculo v) {
        int count = 0;
        for (vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass().equals(v.getClass())) {
                count++;
            }
        }
        return count;
    }

    public boolean alquilarEspacio(vehiculo vehiculo) {
        if (vehiculos.size() >= NUMERO_ESPACIOS) {
            return false; 
        }
        if (vehiculo.getPlaca() == null) {
            return false; 
        }
        if (vehiculo instanceof moto && calcularOcupacionPorTipoVehiculo(new moto("", 0, 0, false)) >= NUMERO_ESPACIOS * 0.8) {
            return false; 
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public boolean retirarVehiculo(vehiculo vehiculo) {
        return vehiculos.remove(vehiculo);
    }

    public void listarVehiculos() {
        for (vehiculo v : vehiculos) {
            System.out.println("Placa: " + v.getPlaca() + ", Cuota: " + v.getCuotaMesGaraje() + ", Tipo: " + v.getClass().getSimpleName());
        }
    }
}
