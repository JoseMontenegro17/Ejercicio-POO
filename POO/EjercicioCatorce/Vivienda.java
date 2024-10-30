package EjercicioCatorce;
/*Ejercicio multiviviendas
Crear las siguientes clases y métodos, y una clase Principal que vaya probando la creación de las clases
y los métodos:
• Crear clase Vivienda con atributos String calle, double precio, int superficieEnMetros
• Crear clase Piso (que hereda de Vivienda) con atributos int planta, int puerta
• Crear clase Adosado (que hereda de Vivienda) con atributos int numPlantas
• Crear clase Chalet (que hereda de Vivienda) con atributos int numParcela, boolean conPiscina.
• Poner public, private o protected a los atributos segun corresponda
• Crear constructores para cada clase, que no incluyen el precio, pues el precio se calcula solo con
métodos que vienen explicados después.
• Crear en Vivienda el método calcularPrecio(), que es el valor de superficieEnMetros*1000,
válido para todos los hijos menos para el Chalet, que es superficieEnMetros*1300
• Crear la una clase principal donde crear objetos de las clases previamente indicadas.
MEJORA 1:
• Crear en Vivienda un método abstracto double impuestoMunicipal(), que para las clases
heredadas devolverá el importe del impuesto, que será el 5% del precio la vivienda, menos en el
caso de los chalets, que ademas de ese 5%, sera de 200 euros mas si el chalet tiene piscina
• Crear la interfaz IViviendas, con el método abstracto void aumentarPrecio(int aumento) y
hacer que todos los hijos de Vivienda implementen dicha interfaz.
MEJORA 2:
• Crear la clase Urbanizacion, que contiene una colección (a elegir por el alumno, un array o lo
que se quiera) de Viviendas.
• Meter en la colección objetos de piso, chalet y adosado,
• Posteriormente, crear en la clase Urbanizacion un método que calcule el precio de todas las
viviendas que existan en la urbanizacion
• Posteriormente, crear en la clase Urbanizacion un método que calcule el precio de todos los
chalets que existan en la urbanizacion
MEJORA 3:
• Guardar la colección de viviendas en un fichero binario, y posteriormente, leer el fichero y
mostrar su contenido */
public class Vivienda {
    private String calle ; 
    private double precio;
    protected int superficieEnMetros;
    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
    }

    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    public double impuestoMunicipal() {
        return 0;
    }
}
    

