package EjericioSimilarPar3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjercicioSimilarPar3 {
    public static void main(String[] args) {
        // Colecciones
        List <String> cadenas = new  ArrayList<>();
        cadenas.add("Saludos");
        cadenas.add("Buen");
        cadenas.add("Hombre");
       
        for (String st : cadenas) {
            System.out.println(st);
             
            
        }
        
        //add con posicion
        System.out.println("-------------------------");
        cadenas.add(2, "Good");
        for (String st : cadenas) {
            System.out.println(st);
            
        }

        System.out.println("--------------------------");
        //metodo set
        cadenas.set(0, "Hello");
     for (String st : cadenas) {
        System.out.println(st);

        System.out.println("----------------------------");

        //metodo remove
        /*Forma correcta de remover objectos de una coleccion */
        //el it es abreviatura de iterator
        Iterator<String> it = cadenas.iterator();
        /*hasNet es un metodo que devuelve true si el objeto esta en la coleccion */
          while (it.hasNext()) {
            String s = it.next();
           if (s.startsWith("B")){
            it.remove();
           }
                System.out.println("--------------------");

                for (String st : cadenas) {
                    System.out.println(st);
            
          }
     }
     }
    }
}
    