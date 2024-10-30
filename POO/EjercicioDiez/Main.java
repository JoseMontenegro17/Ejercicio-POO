package EjercicioDiez;
public class Main {
    public static void main(String[] args) {
      
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.5, 2015);
        coche1.setDniTitular("12345678A");
        coche1.setMatricula("ABC123");

        CocheMatriculado cocheMatriculado1 = new CocheMatriculado("Ford", "Azul", 25000, 0.6, 2010,
                "XYZ789", "87654321B", 2010, 5);

        
        System.out.println("Marca del coche: " + coche1.getMarca());
        System.out.println("Color del coche: " + coche1.getColor());
        coche1.setColor("Verde");
        System.out.println("Color del coche después de cambiar: " + coche1.getColor());
        coche1.incrementarKm(100);
        System.out.println("Kilómetros del coche: " + coche1.km);

      
        Coche coche2 = new Coche("Honda", "Blanco", 30000, 0.7, 2018);
        coche2.setDniTitular("98765432C");
        coche1.comprarCoche(coche2);
        System.out.println("Titular del coche después de comprar: " + coche1.getDniTitular());

        
        System.out.println("Impuesto de matriculación: " + cocheMatriculado1.getImpuestoMatriculacion());
        cocheMatriculado1.setImpuestoMatriculacion(500); // Recalcula el impuesto
        System.out.println("Impuesto de matriculación después de cambiar: " + cocheMatriculado1.getImpuestoMatriculacion());
    }
}