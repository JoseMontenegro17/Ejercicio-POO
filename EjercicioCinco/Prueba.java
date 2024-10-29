package EjercicioCinco;


    import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
       
        Vestido vestido1 = new Vestido("Vestido Elegante", 38, "Zara", 100, false, 10);
        Vestido vestido2 = new Vestido("Vestido Casual", 40, "H&M", 60, true, 5);
        Vestido vestido3 = new Vestido("Vestido de Fiesta", 36, "Mango", 150, false, 8);
        Vestido vestido4 = new Vestido("Vestido de Verano", 42, "Uniqlo", 75, true, 15);
        Vestido vestido5 = new Vestido("Vestido Deportivo", 34, "Nike", 90, false, 20);

        
        Vestido[] vestidos = {vestido1, vestido2, vestido3, vestido4, vestido5};

       
        for (Vestido vestido : vestidos) {
            System.out.println(vestido);
            System.out.println("Precio en rebajas: " + vestido.precioEnRebajas());
            System.out.println("Importe en almacén: " + vestido.importeEnAlmacen());
            System.out.println("Importe en almacén (en rebajas): " + vestido.importeEnAlmacen(true));
            System.out.println();
        }

       
        vestido1.cambiarTemporada();
        System.out.println("Después de cambiar temporada: " + vestido1);

        vestido3.aumentarPrecio(10);
        System.out.println("Después de aumentar el precio en un 10%: " + vestido3);

       
        double sumaPrecios = Arrays.stream(vestidos).mapToDouble(Vestido::getPrecio).sum();
        double precioPromedio = sumaPrecios / vestidos.length;
        System.out.println("Precio total de los vestidos: " + sumaPrecios);
        System.out.println("Precio promedio de los vestidos: " + precioPromedio);

        
        Vestido vestidoMasCaro = Arrays.stream(vestidos).max((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio())).orElse(null);
        System.out.println("Vestido más caro: " + (vestidoMasCaro != null ? vestidoMasCaro.getNombre() : "N/A"));

       
        Vestido vestido6 = vestido1.copiar();
        System.out.println("¿Vestido 1 es igual a su copia?: " + vestido1.equals(vestido6));
        System.out.println("Comparación de precios entre vestido1 y vestido3: " + vestido1.compareTo(vestido3));
    }
}


/*7.a.15.Ejercicio Vestido para rebajas.
Crear la Clase Vestido: tiene estos atributos (todos privados)
- String nombre
- int talla
- String marca
- double precio
- boolean temporadaRebajas (indica si estamos en rebajas o no)
- int unidadesEnAlmacen (numero de unidades de ese vestido que hay en el almacén)
Métodos a escribir:
- constructor con todos los atributos
- constructor con todos los atributos menos precio, que por defecto es 0
- constructor vacío
- getters y setters, de todo menos setter de temporadaRebajas y de unidadesEnAlmacen
- String toString(), para poder "escribir" como es un vestido (a gusto del alumno)
- void cambiarTemporada() cambia el valor de temporadaRebajas, de true a false, o de false a true. Si se
activa temporada de rebajas, el precio baja al 40%, si se acaba la temporada de rebajas, el precio
vuelve al precio original
- double precioEnRebajas() Devuelve el precio que tiene el vestido (si esta en rebajas) o el que tendría
en rebajas (si no se esta en rebajas)
- boolean retirarUnidades(int unidades) Quita las unidades indicadas por parámetro. Si no hay
unidades disponibles, no hace nada y devuelve false, si no, elimina y devuelve true
- double importeEnAlmacen() devuelve el importe de todas las unidades del vestido en el almacén,
según el precio del momento (considerando si se esta en rebajas o no)

ASCENSOR 1
10 -
9 -
8 -
7 -
6 #
5 -
4 -
3 -
2 -
1 -
0 -
capacidad: 4
ocupación: 2
consumo: 15

ASCENSOR 2
10 -
9 -
8 -
7 -
6 -
5 -
4 -
3 -
2 -
1 -
0 #
capacidad: 6
ocupación: 0
consumo: 10

JYOC - JAVA - EJERCICIOS 50

- double importeEnAlmacen(boolean estandoEnRebajas) devuelve el importe de todas las unidades del
vestido en el almacén, pero no teniendo en cuenta su precio del momento, sino considerando que el
parametro estandoEnRebajajas nos indica si hemos de hacer el cálculo como si estuviéramos en rebajas o
no
- void aumentarPrecio(int porcentaje) aumenta el precio en el porcentaje indicado por parámetro
Realizar otra clase Prueba que cree vestidos y pruebe todos los métodos
MEJORA1: en la clase Prueba hacer un array de 5 Vestidos, rellenarlo, y calcular y escribir por
pantalla el precio de los cinco vestido juntos, la media de los cinco y el nombre del vestido más caro
MEJORA2: escribir los métodos compareTo() e equals() . Para comparar dos vestidos se hace por el
precio, y dos vestidos son iguales si son del mismo nombre, marca y talla.
MEJORA3: Hacer un constructor copia (que valga para crear un vestido recibiendo como parámetro
otro vestido) y un método Vestido copiar(), que devuelve un duplicado del vestido actual. Ambas son
duplicados, no copias, esto es, las copias han de ser "profundas" (deep copy) */