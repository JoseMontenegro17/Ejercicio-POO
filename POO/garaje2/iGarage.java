package garaje2;

public interface iGarage {
    double calcularIngresos() throws VamosALaQuiebraException;
    int calcularOcupacionPorTipoVehiculo(vehiculo v);
}

