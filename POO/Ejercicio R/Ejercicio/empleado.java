 // Empleado.java
public abstract class empleado {
    private String nombre;
    private int id;
    private double salario;

    public empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto
    public abstract void realizarTrabajo();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", ID: " + id + ", Salario: " + salario);
    }
}
