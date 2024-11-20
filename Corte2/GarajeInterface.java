package Corte2;

public interface GarajeInterface {
    /**
     * Busca un vehículo por su matrícula.
     * 
     * @param matricula La matrícula del vehículo a buscar.
     * @return La posición del vehículo en el garaje o -1 si no se encuentra.
     */
    int buscarVehiculo(String matricula);

    /**
     * Alquila un espacio para un vehículo en el garaje.
     * 
     * @param vehiculo El vehículo que desea alquilar un espacio.
     * @return true si se pudo alquilar, false si no hay espacio disponible o no se puede alquilar.
     */
    boolean alquilarEspacio(Vehiculo vehiculo);

    /**
     * Calcula y muestra la proporción de autos, motos y camiones en el garaje.
     */
    void calcularProporcion();

    /**
     * Muestra cuántos camiones hay en el garaje por cada tipo (sencillo/doble).
     */
    void camionesPorTipo();

    /**
     * Determina la cantidad de plazas disponibles en el garaje.
     * 
     * @return El número de plazas disponibles.
     */
    int plazasDisponibles();
}
