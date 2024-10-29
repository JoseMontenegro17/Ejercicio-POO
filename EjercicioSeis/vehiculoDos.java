package EjercicioSeis;

public class vehiculoDos {
    public class Vehiculo {
        private String matricula;
        private int velocidadMaxima;
        private int velocidadActual;
        private double peso;
        private boolean marchaAtras;
    
        
        public Vehiculo(String matricula, int velocidadMaxima, int velocidadActual, double peso, boolean marchaAtras) {
            this.matricula = matricula;
            this.velocidadMaxima = velocidadMaxima;
            this.velocidadActual = velocidadActual;
            this.peso = peso;
            this.marchaAtras = marchaAtras;
        }
    

        public String getMatricula() {
            return matricula;
        }
    
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    
        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }
    
        public void setVelocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }
    
        public int getVelocidadActual() {
            return velocidadActual;
        }
    
        public void setVelocidadActual(int velocidadActual) {
            this.velocidadActual = velocidadActual;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public void setPeso(double peso) {
            this.peso = peso;
        }
    
        public boolean isMarchaAtras() {
            return marchaAtras;
        }
    
        public void setMarchaAtras(boolean marchaAtras) {
            this.marchaAtras = marchaAtras;
        }
    
        
        public void cambioSentido() {
            if (velocidadActual == 0) {
                marchaAtras = !marchaAtras;
            } else {
                System.out.println("No se puede cambiar el sentido si el coche no está parado.");
            }
        }
    
        
        public void acelerar(int cuanto) {
            if (!marchaAtras) {
                velocidadActual += cuanto;
                if (velocidadActual > velocidadMaxima) {
                    velocidadActual = velocidadMaxima;
                }
            } else {
                velocidadActual -= cuanto;
                if (velocidadActual < -60) {
                    velocidadActual = -60;
                }
            }
        }
    
    
        public void frenar(int cuanto) {
            if (!marchaAtras) {
                velocidadActual -= cuanto;
                if (velocidadActual < 0) {
                    velocidadActual = 0;
                }
            } else {
                velocidadActual += cuanto;
                if (velocidadActual > 0) {
                    velocidadActual = 0;
                }
            }
        }
    
        public int multar() {
            if (velocidadActual > 120) {
                return (int) (peso * 2);
            }
            return 0;
        }
    
        
        public boolean esIgual(Vehiculo vehiculo) {
            return this.matricula.equals(vehiculo.matricula) &&
                   this.velocidadMaxima == vehiculo.velocidadMaxima &&
                   this.velocidadActual == vehiculo.velocidadActual &&
                   this.peso == vehiculo.peso &&
                   this.marchaAtras == vehiculo.marchaAtras;
        }
    
        
        public void copia(Vehiculo vehiculo) {
            this.matricula = vehiculo.matricula;
            this.velocidadMaxima = vehiculo.velocidadMaxima;
            this.velocidadActual = vehiculo.velocidadActual;
            this.peso = vehiculo.peso;
            this.marchaAtras = vehiculo.marchaAtras;
        }
    
        @Override
        public String toString() {
            return "Vehiculo [Matricula=" + matricula + ", VelocidadMaxima=" + velocidadMaxima + 
                   ", VelocidadActual=" + velocidadActual + ", Peso=" + peso + 
                   ", MarchaAtras=" + marchaAtras + "]";
        }
    }
    
}
