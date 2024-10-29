package EjercicioCuatro;


    class Ascensor {
        private int capacidad;
        private int ocupacion;
        private int consumo;
        private int pisoActual;
    
        // Constructor
        public Ascensor(int capacidad, int pisoActual) {
            this.capacidad = capacidad;
            this.ocupacion = 0;
            this.consumo = 0;
            this.pisoActual = pisoActual;
        }
    
        // Getters y Setters
        public int getCapacidad() {
            return capacidad;
        }
    
        public int getOcupacion() {
            return ocupacion;
        }
    
        public int getConsumo() {
            return consumo;
        }
    
        public int getPisoActual() {
            return pisoActual;
        }
    
        public void setPisoActual(int pisoActual) {
            this.pisoActual = pisoActual;
        }
    
        // Método para añadir un ocupante
        public boolean añadirOcupante() {
            if (ocupacion < capacidad) {
                ocupacion++;
                return true;
            } else {
                System.out.println("Ascensor lleno. No se pueden añadir más ocupantes.");
                return false;
            }
        }
    
        // Método para quitar un ocupante
        public boolean quitarOcupante() {
            if (ocupacion > 0) {
                ocupacion--;
                return true;
            } else {
                System.out.println("El ascensor está vacío. No se pueden quitar ocupantes.");
                return false;
            }
        }
    
        // Método para mover el ascensor a un piso específico
        public boolean mover(int pisoDestino) {
            if (pisoDestino < 0 || pisoDestino > 10) {
                System.out.println("Piso inválido. Debe ser entre 0 y 10.");
                return false;
            } else if (pisoActual == pisoDestino) {
                System.out.println("El ascensor ya está en el piso " + pisoDestino + ".");
                return false;
            }
    
            // Calcular consumo y mover el ascensor
            int desplazamiento = Math.abs(pisoDestino - pisoActual);
            consumo += desplazamiento * ocupacion;
            pisoActual = pisoDestino;
    
            // Si se mueve a la planta 0, vaciar ocupantes
            if (pisoActual == 0) {
                ocupacion = 0;
            }
    
            return true;
        }
    }
    

