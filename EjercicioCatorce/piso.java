package EjercicioCatorce;


    public class piso extends Vivienda {
        private int planta;
        private int puerta;
    
        public piso(String calle, int superficieEnMetros, int planta, int puerta) {
            super(calle, superficieEnMetros);
            this.planta = planta;
            this.puerta = puerta;
        }
    
        @Override
        public double impuestoMunicipal() {
            return calcularPrecio() * 0.05;
        }
    }
    

