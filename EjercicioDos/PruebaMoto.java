package EjercicioDos;

public class PruebaMoto {
    public static void main(String[] args) {
    
        Moto moto = new Moto();
        moto.acelerar(50);
        moto.acelerar(120);
        moto.frenar(30);
        moto.frenar(150);
    }
}

/*Implementar una clase Moto para que la guardamos la velocidad. Tendremos dos métodos uno para
acelerar (aumentamos su velocidad en una cantidad variable) y otro para frenar (disminuimos la
velocidad en una cantidad variable). Generar una clase con un main y crear una moto, y acelerarla y
frenarla para probar la clase.
MEJORA 1: Hay que controlar que la moto no puede tener una velocidad negativa ni tener una
velocidad superior a 150 */
