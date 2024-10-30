package EjercicioOnce;
/*Eva necesita gestionar una empresa agroalimentaria que trabaja con tres tipos de productos: productos frescos, productos refrigerados 
y productos congelados. Todos los productos llevan esta información común: fecha de caducidad y número de lote. A su vez, cada tipo de producto
 lleva alguna información específica. Los productos frescos deben llevar la fecha de envasado y el país de origen. Los productos refrigerados deben
  llevar el código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada y el país de origen.
   Los productos congelados deben llevar la fecha de envasado, el país de origen y la temperatura de mantenimiento recomendada. Hay tres tipos de 
   productos congelados: congelados por aire, congelados por agua y congelados por nitrógeno. Los productos congelados por aire deben llevar la 
   información de la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de vapor de agua).
    Los productos congelados por agua deben llevar la información de la salinidad del agua con que se realizó la congelación en gramos de sal 
    por litro de agua. Los productos congelados por nitrógeno deben llevar la información del método de congelación empleado y del tiempo de 
    exposición al nitrógeno expresada en segundos. Crear de las clases necesarias, cada una de ellas ademas debe disponer de constructor y
     permitir establecer y recuperar el valor de sus atributos y tener un método que permita mostrar la información del objeto cuando sea 
     procedente. Crear una clase de prueba donde se creen: dos productos frescos, tres productos refrigerados y cinco productos congelados 
     (2 de ellos congelados por agua, otros 2 por aire y 1 por nitrógeno). Mostrar la información de cada producto por pantalla. */

    class Producto {
        protected String fechaCaducidad;
        protected String numeroLote;
    
        public Producto(String fechaCaducidad, String numeroLote) {
            this.fechaCaducidad = fechaCaducidad;
            this.numeroLote = numeroLote;
        }
    
        public String mostrarInfo() {
            return "Fecha de caducidad: " + fechaCaducidad + ", Número de lote: " + numeroLote;
        }
    }
    
    class ProductoFresco extends Producto {
        private String fechaEnvasado;
        private String paisOrigen;
    
        public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
            super(fechaCaducidad, numeroLote);
            this.fechaEnvasado = fechaEnvasado;
            this.paisOrigen = paisOrigen;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Fecha de envasado: " + fechaEnvasado + ", País de origen: " + paisOrigen;
        }
    }
    
    class ProductoRefrigerado extends Producto {
        private String codigoSupervision;
        private String fechaEnvasado;
        private String temperaturaMantenimiento;
        private String paisOrigen;
    
        public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoSupervision, 
                                   String fechaEnvasado, String temperaturaMantenimiento, String paisOrigen) {
            super(fechaCaducidad, numeroLote);
            this.codigoSupervision = codigoSupervision;
            this.fechaEnvasado = fechaEnvasado;
            this.temperaturaMantenimiento = temperaturaMantenimiento;
            this.paisOrigen = paisOrigen;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Código de supervisión: " + codigoSupervision + 
                   ", Fecha de envasado: " + fechaEnvasado + 
                   ", Temperatura de mantenimiento: " + temperaturaMantenimiento + 
                   ", País de origen: " + paisOrigen;
        }
    }
    
    class ProductoCongelado extends Producto {
        private String fechaEnvasado;
        private String paisOrigen;
        private String temperaturaMantenimiento;
    
        public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado, 
                                 String paisOrigen, String temperaturaMantenimiento) {
            super(fechaCaducidad, numeroLote);
            this.fechaEnvasado = fechaEnvasado;
            this.paisOrigen = paisOrigen;
            this.temperaturaMantenimiento = temperaturaMantenimiento;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Fecha de envasado: " + fechaEnvasado + 
                   ", País de origen: " + paisOrigen + 
                   ", Temperatura de mantenimiento: " + temperaturaMantenimiento;
        }
    }
    
    class ProductoCongeladoPorAire extends ProductoCongelado {
        private String composicionAire;
    
        public ProductoCongeladoPorAire(String fechaCaducidad, String numeroLote, String fechaEnvasado, 
                                         String paisOrigen, String temperaturaMantenimiento, String composicionAire) {
            super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
            this.composicionAire = composicionAire;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Composición del aire: " + composicionAire;
        }
    }
    
    class ProductoCongeladoPorAgua extends ProductoCongelado {
        private double salinidad;
    
        public ProductoCongeladoPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, 
                                         String paisOrigen, String temperaturaMantenimiento, double salinidad) {
            super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
            this.salinidad = salinidad;
        }
    
        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + ", Salinidad: " + salinidad + " g/L";
        }
    }
    
    class ProductoCongeladoPorNitrogeno extends ProductoCongelado {
        private static String temperatura;
        private String metodoCongelacion;
        private int tiempoExposicion;
    
        public ProductoCongeladoPorNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado, 
        String paisOrigen, String temperaturaMantenimiento, 
        String metodoCongelacion, int tiempoExposicion) {
super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
this.metodoCongelacion = metodoCongelacion;
this.tiempoExposicion = tiempoExposicion;
}

@Override
public String mostrarInfo() {
return super.mostrarInfo() + ", Método de congelación: " + metodoCongelacion + 
", Tiempo de exposición: " + tiempoExposicion + " segundos";
}
    }