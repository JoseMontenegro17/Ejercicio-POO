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
/*7.a.10.CrearCrear un objeto llamado Hospital con las siguientes propiedades y métodos:

Atributos:
int codHospital
String nombreHospital
String dirección
String telefono

JYOC - JAVA - EJERCICIOS 47

int habitacionestotales
int habitacionesocupadas
Métodos:
• Constructor que permite crear una instancia con los datos de un hospital.
• Métodos getter y setter
• Método ingreso() que incrementa las habitaciones ocupadas. No puede realizarse el
ingreso si las habitaciones ocupadas son iguales a las habitaciones totales del hospital.
Devuelve true si se ha podido realizar el ingreso.
• Método alta() que decrementa las habitaciones ocupadas. No puede realizarse el alta
las habitaciones ocupadas son 0. Devuelve true si se ha podido realizar el alta.
• Método toString(), que muestre todos los datos del hospital.
Crear una clase principal main ejecutable que:
• Cree una instancia del objeto Hospital llamado miQueridoHospital.
• Cambie el número de habitaciones de la instancia miQueridoHospital.
• Muestre el número de habitaciones de la instancia miQueridoHospital.
• Realiza un ingreso en la instancia miQueridoHospital.
• Muestra las habitaciones ocupadas de la instancia miQueridoHospital.
• Realiza un alta de la instancia miQueridoHospital.
• Muestra las habitaciones ocupadas de la instancia miQueridoHospital.
• Muestre todos los datos de la instancia miQueridoHospital. */

