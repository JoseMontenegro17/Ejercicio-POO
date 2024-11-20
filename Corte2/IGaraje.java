package Corte2;

// Interfaz que define las operaciones básicas para un garaje
public interface IGaraje {
    /**
     * Alquila un espacio en el garaje para un vehículo.
     * 
     * @param vehiculo El vehículo que desea alquilar el espacio.
     * @return true si el espacio se pudo alquilar, false en caso contrario.
     */
    boolean alquilarEspacio(Vehiculo vehiculo);

    /**
     * Calcula la proporción de cada tipo de vehículo en el garaje.
     */
    void calcularProporcionVehiculos();

    /**
     * Cuenta los camiones por tipo (Sencillo/Doble).
     */
    void contarCamionesPorTipo();

    /**
     * Obtiene la cantidad de plazas disponibles en el garaje.
     * 
     * @return El número de plazas disponibles.
     */
    int plazasDisponibles();
}
