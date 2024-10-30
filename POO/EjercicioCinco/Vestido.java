package EjercicioCinco;

    public class Vestido {
        private String nombre;
        private int talla;
        private String marca;
        private double precio;
        private boolean temporadaRebajas;
        private int unidadesEnAlmacen;
        private double precioOriginal;
    
        
        public Vestido(String nombre, int talla, String marca, double precio, boolean temporadaRebajas, int unidadesEnAlmacen) {
            this.nombre = nombre;
            this.talla = talla;
            this.marca = marca;
            this.precio = precio;
            this.precioOriginal = precio;
            this.temporadaRebajas = temporadaRebajas;
            this.unidadesEnAlmacen = unidadesEnAlmacen;
            if (temporadaRebajas) {
                this.precio = precio * 0.4;
            }
        }
    
        
        public Vestido(String nombre, int talla, String marca, boolean temporadaRebajas, int unidadesEnAlmacen) {
            this(nombre, talla, marca, 0, temporadaRebajas, unidadesEnAlmacen);
        }
    
        public Vestido() {
            this("", 0, "", 0, false, 0);
        }
    
        
        public Vestido(Vestido otro) {
            this(otro.nombre, otro.talla, otro.marca, otro.precio, otro.temporadaRebajas, otro.unidadesEnAlmacen);
        }
    
        
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getTalla() {
            return talla;
        }
    
        public void setTalla(int talla) {
            this.talla = talla;
        }
    
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        public int getUnidadesEnAlmacen() {
            return unidadesEnAlmacen;
        }
    
        
        @Override
        public String toString() {
            return "Vestido [Nombre=" + nombre + ", Talla=" + talla + ", Marca=" + marca + ", Precio=" + precio + ", Temporada de Rebajas=" + temporadaRebajas + ", Unidades en Almacen=" + unidadesEnAlmacen + "]";
        }
    
       
        public void cambiarTemporada() {
            temporadaRebajas = !temporadaRebajas;
            if (temporadaRebajas) {
                precio = precioOriginal * 0.4;
            } else {
                precio = precioOriginal;
            }
        }
    
       
        public double precioEnRebajas() {
            return temporadaRebajas ? precio : precioOriginal * 0.4;
        }
    
        public boolean retirarUnidades(int unidades) {
            if (unidadesEnAlmacen >= unidades) {
                unidadesEnAlmacen -= unidades;
                return true;
            }
            return false;
        }
    
     
        public double importeEnAlmacen() {
            return unidadesEnAlmacen * precio;
        }
    
        
        public double importeEnAlmacen(boolean estandoEnRebajas) {
            return unidadesEnAlmacen * (estandoEnRebajas ? precioOriginal * 0.4 : precioOriginal);
        }
    
        public void aumentarPrecio(int porcentaje) {
            precioOriginal += precioOriginal * porcentaje / 100.0;
            if (!temporadaRebajas) {
                precio = precioOriginal;
            }
        }
    
        
        public Vestido copiar() {
            return new Vestido(this);
        }
    
        
        public int compareTo(Vestido otro) {
            return Double.compare(this.precio, otro.precio);
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Vestido otro = (Vestido) obj;
            return talla == otro.talla && nombre.equals(otro.nombre) && marca.equals(otro.marca);
        }
    }
    

