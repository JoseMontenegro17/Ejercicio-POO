package EjercicioDiez;

class Coche {
    private  String marca;
    private String color;
    int km;
    private double precio;
    private  double factorContaminacion;
    private  int anio;
    private String matricula;
    private String dniTitular;

    // Constructor
    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
        this.km = 0; 
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void incrementarKm(int km) {
        this.km += km;
    }

    public String getMarca() {
        return marca;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (this.matricula == null) {
            this.matricula = matricula;
        }
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        } else {
            System.out.println("No se puede realizar el cambio de titularidad.");
        }
    }
}


class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    // Constructor
    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    // Método
    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20; 
        if (2023 - getAnio() > 10) { 
            impuestoMatriculacion += 100;
        }
    }

    // Getter y setter 
    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion;
        calculaImpuestoMatriculacion(); 
    }
}
/*Proyecto coches Matriculados.
Crear la clase Coche con :
• Atributos:
- String marca: se inicializa en el constructor y no se modifica nunca
- String color: se inicializa en el constructor y se puede modificar
- int km: al principio vale 0, y se puede incrementar
- double precio: se inicializa en el constructor y se puede modificar
- double factor_contaminación: se inicializa en el constructor y no se puede modificar
- int anio : se inicializa en el constructor y no se puede modificar
- String matricula: no se inicializa con el constructor, y una vez que se le ha dado un valor, no
se puede cambiar.
- String dniTitular: no se inicializa con el constructor, se puede cambiar después.
• Métodos:
- comprarCoche(Coche otroCoche), que cambia el atributo dniTitular por el dniTitular del
parámetro otroCoche. Sólo se puede hacer el cambio si ambos coches (el propio objeto y el
parámetro del método) tienen valor en el campo dniTitular
Crear la clase Cochematriculado que hereda de coche, con :
• Atributos:
- int aniomatriculacion
- int mesmatriculacion
- double impuestoMatriculacion, no se crea con el coche, se puede cambiar después.
• Métodos
- método calculaImpuestoMatriculacion(), que calcula y asigna al atributo correspondiente
el impuesto de matriculación (que será la vigésima parte del precio del coche), y aplica un
recargo de 100 euros si el coche tiene más de 10 años
- constructor: recibe valor para asignar a los atributos matricula y dniTitular, y calcula con el
método calculaImpuestoMatriculacion() el atributo correspondiente
- Métodos getter y setter. El setter de impuestoMatriculacion debe usar el método
calculaImpuestoMatriculacion() para calcular el atributo correspondiente, por lo que no
tiene parámetros
Crear una clase con un main y probar a crear objetos de ambas clases y probar sus métodos. */


