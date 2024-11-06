package garaje2;

import java.util.ArrayList;
import java.util.List;

public class garaje implements iGarage {
    public static final int NUM_PLACAS = 10;
    private List<vehiculo> vehiculos = new ArrayList<>();

    public boolean alquilarPlaza(vehiculo v)  {
        if (v.getMatricula() == null) {
           setCuotaMesGarage= ("El vehículo no tiene matrícula.");
        }

        if (vehiculos.size() >= NUM_PLACAS) {
            return false;  
        }
        
        int motosCount = calcularOcupacionPorTipoVehiculo(new moto("", 0, 0, false));
        if (motosCount >= NUM_PLACAS * 0.8) {
            return false;  
        }

        vehiculos.add(v);
        return true;
    }

    public boolean retirarPlaza(vehiculo v) {
        return vehiculos.remove(v);
    }

    public double calcularIngresos() throws VamosALaQuiebraException {
        double ingresos = 0;
        for (vehiculo v : vehiculos) {
            ingresos += v.getCuotaMesGarage();
        }
        
        if (ingresos < 400) {
            throw new VamosALaQuiebraException("Los ingresos son insuficientes.");
        }
        
        return ingresos;
    }

    public int calcularOcupacionPorTipoVehiculo(vehiculo v) {
        int count = 0;
        for (vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass() == v.getClass()) {
                count++;
            }
        }
        return count;
    }

    public List<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void ordenarVehiculos() {
        vehiculos.sort((v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula()));
    }
}
