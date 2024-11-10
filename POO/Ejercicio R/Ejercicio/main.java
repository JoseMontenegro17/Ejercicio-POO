// Main.java
public class main {
    public static void main(String[] args) {
        // Crear objetos de tipo EmpleadoOficina y EmpleadoTemporal
        Empleado empleado1 = new EmpleadoOficina("José Alejandro", 101, 5000, "Recursos Humanos");
        Empleado empleado2 = new EmpleadoTemporal("María Fernanda", 102, 3000, 6);

        // Arreglo de Trabajadores para utilizar polimorfismo
        Trabajador[] trabajadores = { (Trabajador) empleado1, (Trabajador) empleado2 };

        // Iterar sobre los trabajadores para mostrar información y realizar tareas
        for (Trabajador trabajador : trabajadores) {
            // Mostrar información básica
            ((Empleado) trabajador).mostrarInfo();
            
            // Realizar tareas y reportar
            trabajador.trabajar();
            trabajador.reportar();
            ((Empleado) trabajador).realizarTrabajo();
            System.out.println();  // Separador entre trabajadores
        }
    }
}
