// Subclase EmpleadoOficina
// EmpleadoOficina.java
public class empleadoOficina extends Empleado implements Trabajador {
    private String departamento;

    public empleadoOficina(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println(getNombre() + " está realizando tareas administrativas en el departamento de " + departamento);
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está trabajando en la oficina.");
    }

    @Override
    public void reportar() {
        System.out.println(getNombre() + " ha reportado las tareas del día.");
    }
}
