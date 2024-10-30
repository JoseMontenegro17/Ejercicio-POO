package EjercicioSiete;

    abstract class BaseCarne implements Producto {
        protected String nombre;
        protected double peso;
        protected double precioKilo;
        protected String origen;
    
        public BaseCarne(String nombre, double peso, double precioKilo, String origen) {
            this.nombre = nombre;
            this.peso = peso;
            this.precioKilo = precioKilo;
            this.origen = origen;
        }
    
        @Override
        public double calcularPrecio() {
            return peso * precioKilo;
        }
    }
    
    class CarneFresca extends BaseCarne {
        private int diasCaducidad;
    
        public CarneFresca(String nombre, double peso, double precioKilo, String origen, int diasCaducidad) {
            super(nombre, peso, precioKilo, origen);
            this.diasCaducidad = diasCaducidad;
        }
    
        public int getDiasCaducidad() {
            return diasCaducidad;
        }
    }
    
    class CarneCongelada extends BaseCarne {
        protected String empresaDistribuidora;
    
        public CarneCongelada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora) {
            super(nombre, peso, precioKilo, origen);
            this.empresaDistribuidora = empresaDistribuidora;
        }
    }
    
    class CarneCongeladaPiezaEntera extends CarneCongelada {
        private boolean enBandeja;
    
        public CarneCongeladaPiezaEntera(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, boolean enBandeja) {
            super(nombre, peso, precioKilo, origen, empresaDistribuidora);
            this.enBandeja = enBandeja;
        }
    
        public boolean isEnBandeja() {
            return enBandeja;
        }
    }
    
    class CarneCongeladaPiezaTroceada extends CarneCongelada {
        private int numeroPiezas;
    
        public CarneCongeladaPiezaTroceada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, int numeroPiezas) {
            super(nombre, peso, precioKilo, origen, empresaDistribuidora);
            this.numeroPiezas = numeroPiezas;
        }
    
        public int getNumeroPiezas() {
            return numeroPiezas;
        }
    }
    
    class Pescado implements Producto {
        private String nombre;
        private double peso;
        private double precioKilo;
    
        public Pescado(String nombre, double peso, double precioKilo) {
            this.nombre = nombre;
            this.peso = peso;
            this.precioKilo = precioKilo;
        }
    
        @Override
        public double calcularPrecio() {
            return peso * precioKilo;
        }
    }
    

