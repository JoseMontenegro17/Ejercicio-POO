package EjercicioNueve;

public class mainPt {
    
    public static void main(String[] args) {
        Empleado empleadoAsalariado = new EmpleadoAsala("Laura Gómez", 101, 800.0);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Carlos Díaz", 102, 40, 15.5);

        System.out.println("Detalles del empleado asalariado:");
        empleadoAsalariado.detalles();
        System.out.println("Salario: $" + empleadoAsalariado.calcularSalario());

        System.out.println();

        System.out.println("Detalles del empleado por horas:");
        empleadoPorHoras.detalles();
    }
}


