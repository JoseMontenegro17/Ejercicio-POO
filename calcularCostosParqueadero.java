
package app;

/**
 * @author Jose Alejandro Montenegro Lizcano u20241222690
 */

/*En central de abastos de (bodegas donde se almacena al por mayor) se ha establecido un
protocolo para el ingreso de vehículos que permite el cobro de parqueadero según las siguientes
condiciones:
- Al centro de abastos entran vehículos con dos propósitos, algunos entran a descargar
productos y otros entran a cargar (estos son los dos tipos de servicio que presta el centro de
abastos 1. Cargue y 2. Descargue).
- A los vehículos que entran a descargar se les cobra de acuerdo con la siguiente tabla:
Tipo de producto Peso transportado

Menos de 8 toneladas 8 o más toneladas
1. Perecedero $15.000 por tonelada $9.000 por tonelada
2. No perecedero $60.000 por todo el producto

transportado

$60.000 por las primeras 10
toneladas y a $7.000 cada
tonelada que exceda de 10
- A los vehículos que entran a cargar se les cobra por el tiempo que permanecen dentro del
centro de abastos así: Las primeras dos horas son gratis para todos los vehículos que entran a
cargar. Las horas extras que permanecen dentro del parqueadero se cobran a $4.000 pesos la
hora (siempre se cobra la hora completa) y tendrá un incremento del 25% si el camión mide
más de 4 metros de largo.
Elabore un programa en programa que ayude al portero del centro de abastos para calcular el
costo de parqueadero de todos los camiones que hacen uso de estos servicios durante una
jornada.
Se estima que en una jornada se manejan máximo cien (100) vehículos.
Los datos se deben guardar en una matriz con la siguiente estructura (datos tipo double):
Tipo de
Servicio

Tipo de
Producto

Peso
transportado

Tiempo
permanencia

Largo
Camión

Costo
Parqueadero

*Cada columna de la matriz guarda un dato diferente*/

import java.util.Scanner;

public class calcularCostosParqueadero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int cantCamiones;
        double tipoServicio;
        System.out.print("Ingrese la cantidad de camiones: ");
        cantCamiones=sc.nextInt();
        double [][] datosCamiones = new double[cantCamiones][6];
        for(int c=0;c<cantCamiones;c++){
            System.out.print("Ingrese el tipo de servicio: (1 - Carga 2 - Descarga)");
            tipoServicio=sc.nextDouble();
            datosCamiones[c][0]=tipoServicio;
            //Validar que la variable sea 1 o 2
            switch((int)tipoServicio){
                case 2:
                System.out.println("Ingrese el tipo de producto: 1-Per 2 -No Per ");
                datosCamiones[c][1]=sc.nextDouble();
                System.out.println("Ingrese el peso trasportado:  ");
                datosCamiones[c][2]=sc.nextDouble();
                if(datosCamiones[c][1]==1){
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=datosCamiones[c][2]*15000;                        
                    }
                    else{
                        datosCamiones[c][5]=datosCamiones[c][2]*9000;
                    }
                }else {
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=60000;                        
                    }
                    else{
                        datosCamiones[c][5]=60000+(datosCamiones[c][2]-10)*7000;

                    }
                break;
                }
                
                case 1:
                System.out.println("Ingrese el tiempo de permanencia ");
                datosCamiones[c][3]=sc.nextDouble();
                System.out.println("Ingrese el larg del camion");
                datosCamiones[c][4]=sc.nextDouble();


            }

        }
        System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   valor");
        for(int c=0;c<cantCamiones;c++){
            System.out.println("");
            for(int d=0;d<6;d++){
                System.out.print(datosCamiones[c][d]+"  ");
           
            System.out.print("Ingrese la longitud del camión en metros: ");
            
             }
           
               }
            }
       

    }


            
         
                    
                    
            
            
       
   
   /*String tipoServicio;
          String cargue;
          String descargue; 
           while (númeroVeiculos<=100){
            System.out.println("Ingrese por favor el tipo de servicio: ");
            System.out.println("1. Cargue");
            System.out.println("2. Descargue");*/
          
