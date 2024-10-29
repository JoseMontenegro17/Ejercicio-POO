package EjercicioOcho;

public class principalvehi {
    
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota", "Corolla", 2020, 4);
        Vehiculo miMoto = new Motocicleta("Yamaha", "MT-07", 2022, "Deportiva");

        miCoche.detalles();
        miCoche.iniciar();

        System.out.println(); 

        miMoto.detalles();
        miMoto.iniciar();
    }
}

    

