

// EmpleadoTemporal.java
public class EmpleadoTemporal extends Empleado implements Trabajador {
    private int duracionContrato;  // en meses

    public EmpleadoTemporal(String nombre, int id, double salario, int duracionContrato) {
        super(nombre, id, salario);
        this.duracionContrato = duracionContrato;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println(getNombre() + " está trabajando temporalmente con un contrato de " + duracionContrato + " meses.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está trabajando de manera temporal.");
    }

    @Override
    public void reportar() {
        System.out.println(getNombre() + " ha reportado las actividades del contrato temporal.");
    }
}

