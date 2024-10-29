package EjercicioNueve;

abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    
    public abstract double calcularSalario();

    
    public void detalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }
}


