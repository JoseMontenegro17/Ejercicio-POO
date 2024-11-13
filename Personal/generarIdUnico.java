package Personal;
import java.util.Scanner;

import javax.print.attribute.standard.OrientationRequested;

import java.util.Random;
public class generarIdUnico {
    public static void main(String[] args) {
        System.out.println("****Sistema Generador de ID Unico****");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        System.out.print("Mi estimado usuario, por favor ingrese su nombre:"+" ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa tu apellido:"+ " ");
        var apellido = consola.nextLine();

        System.out.print("Ingresa tu fecha de nacimiento (yyyy):"+" ");
        var fecha = consola.nextLine();

        //dar formato

        var nametwo = nombre.trim().toLowerCase().substring(0, 2);
        
        var lastNameTwo = apellido.trim().toLowerCase().substring(0, 2);
        
        var anitwho = fecha.trim().toLowerCase().substring(0,2);

        //valor aleatorio
        var numAleatorio = new Random().nextInt(999999999)+1;

        //formato
        var numAleatorioFormat = String.format("%o4d", numAleatorio);

        //ID unico
        var generarIdUnico= nametwo+ anitwho + numAleatorioFormat;

        //imprimer ID unico
        System.out.printf("""
                "%Un gusto mi estimado %s,
                \tSu ID unico es: 
                \t%s
                \t Todo bien :v
                """, nombre
            );
    }
    
}
