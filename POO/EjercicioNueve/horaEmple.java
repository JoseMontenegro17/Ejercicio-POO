package EjercicioNueve;


class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int id, int horasTrabajadas, double pagoPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoPorHora;
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Tipo de empleado: Por horas");
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: $" + pagoPorHora);
        System.out.println("Salario calculado: $" + calcularSalario());
    }
}


