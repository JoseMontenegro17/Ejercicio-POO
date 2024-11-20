package EjericioSimilarPar3;

// Main.java
public class main {
    public static void main(String[] args) {
        garaje garaje = new garaje(50);

        garaje.alquilarEspacio(new auto("Toyota", "Corolla", 20000, "ABC123"));
        garaje.alquilarEspacio(new Moto("Honda", "CBR", 5000, "DEF456"));
        garaje.alquilarEspacio(new camioneta("Ford", "Ranger", 30000, "GHI789", "Pickup", 2, true));

        System.out.println("Buscar vehículo matrícula 'ABC123': " + garaje.buscarVehiculo("ABC123"));

        garaje.calcularProporcion();
        garaje.contarCamionetasPorTipo();
    }
}
