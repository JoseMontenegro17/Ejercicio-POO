// Camioneta.java
public class camioneta extends vehiculo {
    private String tipoServicio; // SUV, Pickup, Carga, u Otro
    private int numeroPasajeros;
    private boolean tieneRemolque;

    public camioneta(String marca, String modelo, double precio, String matricula, String tipoServicio, int numeroPasajeros, boolean tieneRemolque) {
        super(marca, modelo, precio, matricula);
        this.tipoServicio = tipoServicio;
        this.tieneRemolque = tieneRemolque;

        // Validación de número de pasajeros
        if ((tipoServicio.equalsIgnoreCase("Pickup") || tipoServicio.equalsIgnoreCase("Carga")) && numeroPasajeros > 2) {
            System.out.println("Número de pasajeros no válido para Camioneta tipo Pickup o Carga. Se establece a 2.");
            this.numeroPasajeros = 2;
        } else if (numeroPasajeros > 5) {
            System.out.println("Número de pasajeros excede el límite de 5. Se establece a 5.");
            this.numeroPasajeros = 5;
        } else {
            this.numeroPasajeros = numeroPasajeros;
        }
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    @Override
    public double calcularImpuesto() {
        return this.getPrecio() * 0.05; // Impuesto de circulación
    }

    // Calcular aumento en la cuota mensual del garaje
    public double calcularAumentoCuota() {
        double aumento = 1.0;

        // Aumento basado en el tipo de servicio
        if (tipoServicio.equalsIgnoreCase("SUV")) {
            aumento += 0.10; // 10%
        } else if (tipoServicio.equalsIgnoreCase("Pickup") || tipoServicio.equalsIgnoreCase("Carga") || tipoServicio.equalsIgnoreCase("Otro")) {
            aumento += 0.45; // 45%
        }

        // Aumento basado en el número de pasajeros
        if (numeroPasajeros == 2) {
            aumento += 0.50; // 50%
        } else if (numeroPasajeros > 2) {
            aumento += 0.60; // 60%
        }

        // Aumento adicional si tiene remolque
        if (tieneRemolque) {
            aumento += 0.10; // 10%
        }

        return aumento;
    }
}