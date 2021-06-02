package clase_8;

/*
Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, permita encontrar por cada fila
la posici�n de inicio y fin de la ante�ltima secuencia (considerar comenzar a buscarla a partir de la ultima posici�n de la fila).
*/


import java.util.Random;

public class Tp8_Ej12 {
    public static final int MAXFILAS = 4;
    public static final int MAXCOLUMNAS = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilityNumber = 0.4;

    public static void main(String[] args) {
        int [][] intMatriz = new int[MAXFILAS][MAXCOLUMNAS];

        cargarMatrizSecuenciasEnteros(intMatriz);
        imprimirMatrizEnteros(intMatriz);
        buscarAnteultimaSecuenciaMatriz(intMatriz);
    }

    public static void cargarMatrizSecuenciasEnteros(int [][] intMatriz) {
        for (int fila = 0; fila < MAXFILAS; fila++) {
            cargarArregloSecuenciasEnteros(intMatriz[fila]);
        }
        System.out.println("");
    }

    public static void cargarArregloSecuenciasEnteros(int [] array) {
        Random r = new Random();
        array[0] = 0;
        array[MAXCOLUMNAS - 1] = 0;
        for (int i = 1; i < MAXCOLUMNAS - 1; i++) {
            if (r.nextDouble() > probabilityNumber) {
                array[i] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                array[i] = 0;
            }
        }
        array [MAXCOLUMNAS - 2] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR); // Evito que el ante�ltimo n�mero sea un 0 y me de error al buscar la �ltima secuencia
    }

    public static void imprimirMatrizEnteros(int [][] intMatriz) {
        for (int fila = 0; fila < MAXFILAS; fila++) {
            for (int columna = 0; columna < MAXCOLUMNAS; columna++) {
                System.out.print("[" + intMatriz[fila][columna] + "]");
            }
            System.out.println("");
        }
    }

    public static int buscarPosicionInicioSecuencia(int[][] intMatriz, int fila, int posicionFin) {
        while (intMatriz[fila][posicionFin] != 0) {
            posicionFin--;
        }
        int posicionInicio = posicionFin + 1;
        return posicionInicio;
    }

    public static int buscarPosicionFinSecuencia(int[][] intMatriz, int fila) {
        int posicion = MAXCOLUMNAS - 1;
        while (intMatriz[fila][posicion] == 0) {
            posicion--;
        }
        return posicion;
    }

    public static void buscarAnteultimaSecuenciaMatriz(int[][] intMatriz) {
        for (int fila = 0; fila < MAXFILAS; fila++) {
            int posicionFin = buscarPosicionFinSecuencia(intMatriz, fila);
            int posicionInicio = buscarPosicionInicioSecuencia(intMatriz, fila, posicionFin);
            int ultimaPosicionAnteultimaSecuencia = posicionInicio - 1;
            while (intMatriz[fila][ultimaPosicionAnteultimaSecuencia] == 0) {
                ultimaPosicionAnteultimaSecuencia--;
            }
            int primerPosicionAnteultimaSecuencia = buscarPosicionInicioSecuencia(intMatriz, fila, ultimaPosicionAnteultimaSecuencia);
            System.out.println("La ante�ltima secuencia de la fila " + fila + " empieza en la posici�n " + primerPosicionAnteultimaSecuencia + " y termina en la posici�n " + ultimaPosicionAnteultimaSecuencia);
        }
    }
}