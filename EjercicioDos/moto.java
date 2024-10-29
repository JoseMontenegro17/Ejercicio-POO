package EjercicioDos;
        class Moto {
        
        private int velocidad;
    
        public Moto() {
            this.velocidad = 0; 
        }
    
        // Método para acelerar
        public void acelerar(int incremento) {
            if (incremento < 0) {
                System.out.println("El incremento debe ser positivo.");
                return;
            }
            velocidad += incremento;
            if (velocidad > 150) {
                velocidad = 150; 
            }
            System.out.println("Velocidad actual después de acelerar: " + velocidad + " km/h");
        }
    
        // Método para frenar
        public void frenar(int decremento) {
            if (decremento < 0) {
                System.out.println("El decremento debe ser positivo.");
                return;
            }
            velocidad -= decremento;
            if (velocidad < 0) {
                velocidad = 0; 
            }
            System.out.println("Velocidad actual después de frenar: " + velocidad + " km/h");
        }
    
       
        public int getVelocidad() {
            return velocidad;
        }
    }
    

