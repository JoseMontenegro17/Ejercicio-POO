package ejercicio16;

import java.util.HashSet;
import java.util.Random;

public class juegoDelBingo implements iCarton {
    private int[][] carton;
    private boolean[][] tachado;

    public juegoDelBingo(int[][] carton) {
        this.carton = carton;
        this.tachado = new boolean[3][9];
    }

    @Override
    public boolean tacharNumero(int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == numero) {
                    tachado[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hayLinea() {
        for (int i = 0; i < 3; i++) {
            boolean completa = true;
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] != 0 && !tachado[i][j]) {
                    completa = false;
                    break;
                }
            }
            if (completa) return true;
        }
        return false;
    }

    @Override
    public boolean hayBingo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] != 0 && !tachado[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean cartonValido(int[][] carton) {
        if (carton.length != 3 || carton[0].length != 9) return false;

        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int countNumeros = 0;
            for (int j = 0; j < 9; j++) {
                int num = carton[i][j];
                if (num != 0) {
                    if (num < 1 || num > 90 || numeros.contains(num)) return false;
                    numeros.add(num);
                    countNumeros++;
                }
            }
            if (countNumeros != 5) return false;
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 1; i < 3; i++) {
                if (carton[i][j] != 0 && carton[i - 1][j] != 0 && carton[i][j] < carton[i - 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] generarCartonAleatorio() {
        int[][] carton = new int[3][9];
        Random random = new Random();
        HashSet<Integer> usados = new HashSet<>();

        for (int j = 0; j < 9; j++) {
            int count = 0;
            while (count < 3) {
                int rangoInicio = j * 10 + 1;
                int rangoFin = Math.min((j + 1) * 10, 90);
                int numero = rangoInicio + random.nextInt(rangoFin - rangoInicio + 1);
                
                if (!usados.contains(numero)) {
                    carton[count][j] = numero;
                    usados.add(numero);
                    count++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int huecos = 4;
            while (huecos > 0) {
                int j = random.nextInt(9);
                if (carton[i][j] != 0) {
                    carton[i][j] = 0;
                    huecos--;
                }
            }
        }
        return carton;
    }
}
