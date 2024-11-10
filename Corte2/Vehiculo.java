package Corte2;
public class Vehiculo {
    /*comentar metodo si las tengo modificado, incluyendo las que tengo hechas y las modificadas, todas estas clases
     * se suben al classroom, ojo.
     */
    public class Camion extends Vehiculo {
        private String tipo; 
        private double capacidadCarga; 
    
        public Camion(String matricula, String tipo, double capacidadCarga) {
            super();
            this.tipo = tipo;
            this.capacidadCarga = capacidadCarga;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public double getCapacidadCarga() {
            return capacidadCarga;
        }
    
        public int calcularImpuesto() {
            double impuestoBase = 0.09; 
            double precioExtraPorTonelada = 10.0;
            double porcentajeIncremento = tipo.equals("Doble") ? 1.25 : 0.75;
    
            return (int) ((impuestoBase + precioExtraPorTonelada * capacidadCarga) * (1 + porcentajeIncremento));
        }
    
       
    }

    public Object getMatricula() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMatricula'");
    }
}