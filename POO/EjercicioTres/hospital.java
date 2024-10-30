package EjercicioTres;


    class Hospital {
        
        private int codHospital;
        private String nombreHospital;
        private String direccion;
        private String telefono;
        private int habitacionesTotales;
        private int habitacionesOcupadas;
    
       
        public Hospital(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales) {
            this.codHospital = codHospital;
            this.nombreHospital = nombreHospital;
            this.direccion = direccion;
            this.telefono = telefono;
            this.habitacionesTotales = habitacionesTotales;
            this.habitacionesOcupadas = 0; 
        }
    
        // Getters y Setters
        public int getCodHospital() {
            return codHospital;
        }
    
        public void setCodHospital(int codHospital) {
            this.codHospital = codHospital;
        }
    
        public String getNombreHospital() {
            return nombreHospital;
        }
    
        public void setNombreHospital(String nombreHospital) {
            this.nombreHospital = nombreHospital;
        }
    
        public String getDireccion() {
            return direccion;
        }
    
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    
        public String getTelefono() {
            return telefono;
        }
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    
        public int getHabitacionesTotales() {
            return habitacionesTotales;
        }
    
        public void setHabitacionesTotales(int habitacionesTotales) {
            this.habitacionesTotales = habitacionesTotales;
        }
    
        public int getHabitacionesOcupadas() {
            return habitacionesOcupadas;
        }
    
        public boolean ingreso() {
            if (habitacionesOcupadas < habitacionesTotales) {
                habitacionesOcupadas++;
                return true;
            } else {
                System.out.println("No hay habitaciones disponibles para el ingreso.");
                return false;
            }
        }
    
        
        public boolean alta() {
            if (habitacionesOcupadas > 0) {
                habitacionesOcupadas--;
                return true;
            } else {
                System.out.println("No hay pacientes para dar de alta.");
                return false;
            }
        }
    

        @Override
        public String toString() {
            return "Hospital{" +
                    "codHospital=" + codHospital +
                    ", nombreHospital='" + nombreHospital + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", habitacionesTotales=" + habitacionesTotales +
                    ", habitacionesOcupadas=" + habitacionesOcupadas +
                    '}';
        }
    }
    

