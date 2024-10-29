package EjercicioOcho;
/*se va a crear  un sistema que gestione diferentes tipos de vehículos (motos,coche). 
Deberás definir una clase abstracta Vehiculo, de la cual heredarán 
clases específicas como Coche y Motocicleta. Cada clase
 debe implementar sus propios métodos y propiedades. */
public class newVehiculo {
 
 abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    
    public abstract void iniciar();

    
    public void detalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

}
