package EjercicioEnClase;

public class garaje {
    private String matricula;
    private  String marca;
    private double precio;
   private  int cilindradad;
   private  double impuestoCirculacion;
   private double cuotaMesGaraje;
   public static final int CONSTANTE=100;
    public garaje(String marca, double precio, int cilindradad) {
        this.marca = marca;
        this.precio = precio;
        this.cilindradad = cilindradad;
        this.cuotaMesGaraje = cuotaMesGaraje;
        this.matricula =null;
        this.impuestoCirculacion= CONSTANTE;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCilindradad() {
        return cilindradad;
    }
    public void setCilindradad(int cilindradad) {
        this.cilindradad = cilindradad;
    }
    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }
    public void setImpuestoCirculacion(double impuestoCirculacion) {
       
        this.impuestoCirculacion = impuestoCirculacion;
    }
    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }
    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if(cuotaMesGaraje<0){
            
        this.cuotaMesGaraje = cuotaMesGaraje;
            }else System.out.println("Error, no puedes indicar una cuota negativa");
    }
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = 0.02 * precio;
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            this.matricula = matricula;
            return true;
        }
        return false;
    }
    public void calcularInpuesto(){
        this.impuestoCirculacion= 002* precio;

    }
    }
    
    
    

