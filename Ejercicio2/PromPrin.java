public class PromPrin {
    /*Crear una clase Mascara. Atributos públicos String personaje,
     boolean tienePelo. Hacer programa Principal,
 con un método main donde se creen objetos de la clase,
  con constructor por defecto, dar valor a los
  atributos y consultarlos por consola */
    public static void main(String[] args) {
        Mascara mascara1 = new Mascara();
        mascara1.personaje = "Batman";
        mascara1.tienePelo = false;
        Mascara mascara2 = new Mascara();
        mascara2.personaje= "Flash";
        mascara2.tienePelo = true;
        System.out.println("El Personaje tiene la mascara:"+" "+ mascara1.personaje+" " +"y tiene pelo:"+" "+ mascara1.tienePelo);
        System.out.println("el personaje tiene la mascara:"+" "+ mascara2.personaje+" "+ "y tiene pelo:"+" "+mascara2.tienePelo);
    }
}
