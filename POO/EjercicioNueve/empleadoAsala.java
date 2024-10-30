package EjercicioNueve;
//asalariado// 

class EmpleadoAsala extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsala(String nombre, int id, double salarioSemanal) {
        super(nombre, id);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Tipo de empleado: Asalariado");
        System.out.println("Salario semanal: $" + salarioSemanal);
    }
}


