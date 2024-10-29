package EjercicioTres;

public class PruebaHospital {
    public static void main(String[] args) {
       
        Hospital miQueridoHospital = new Hospital(1, "Hospital Central", "123 Calle Salud", "555-1234", 100);

        miQueridoHospital.setHabitacionesTotales(120);
        System.out.println("Número de habitaciones totales: " + miQueridoHospital.getHabitacionesTotales());

        if (miQueridoHospital.ingreso()) {
            System.out.println("Ingreso realizado correctamente.");
        }

        System.out.println("Habitaciones ocupadas: " + miQueridoHospital.getHabitacionesOcupadas());

    
        if (miQueridoHospital.alta()) {
            System.out.println("Alta realizada correctamente.");
        }
        System.out.println("Habitaciones ocupadas después del alta: " + miQueridoHospital.getHabitacionesOcupadas());
        System.out.println(miQueridoHospital);
    }
}

