package EjercicioSeis;

import EjercicioSeis.vehiculoDos.Vehiculo;

    public class Main {
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("ABC123", 180, 0, 1200.5, false);
        Vehiculo vehiculo2 = new Vehiculo("XYZ987", 200, 0, 1500.3,false);

       
        System.out.println("Estado inicial del vehículo 1: " + vehiculo1);
        System.out.println("Estado inicial del vehículo 2: " + vehiculo2);

       
        vehiculo1.cambioSentido();
        System.out.println("Después de cambiar el sentido del vehículo 1: " + vehiculo1);


        vehiculo1.acelerar(50);
        System.out.println("Después de acelerar el vehículo 1 a 50 km/h: " + vehiculo1);

       
        vehiculo1.frenar(30);
        System.out.println("Después de frenar el vehículo 1 en 30 km/h: " + vehiculo1);


        vehiculo1.acelerar(150);
        int multa = vehiculo1.multar();
        if (multa > 0) {
            System.out.println("Vehículo 1 multado con: $" + multa);
        } else {
            System.out.println("Vehículo 1 no ha sido multado.");
        }

        
        System.out.println("¿Vehículo 1 es igual a Vehículo 2?: " + vehiculo1.esIgual(vehiculo2));


        vehiculo2.copia(vehiculo1);
        System.out.println("Estado de vehículo 2 después de copiar atributos de vehículo 1: " + vehiculo2);

        System.out.println("¿Vehículo 1 es igual a Vehículo 2 después de copiar?: " + vehiculo1.esIgual(vehiculo2));
    }
}


