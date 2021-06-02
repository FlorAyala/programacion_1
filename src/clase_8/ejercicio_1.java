package clase_8;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
 */
import java.util.Random;

public class ejercicio_1 {
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int [][] matint; 
		matint = new int[MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_int(matint);
		imprimir_matriz_int(matint);
		invertir_orden_filas(matint);
		imprimir_matriz_int(matint);
	}
	public static void cargar_matriz_aleatorio_int(int [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}
	public static void imprimir_matriz_int(int[][] mat) {
		System.out.println("-------------------");
		for (int fila = 0 ;fila < MAXFILA; fila++){
			System.out.println("|");
			for (int columna = 0 ; columna < MAXCOLUMNA; columna++)
			System.out.print(mat[fila][columna]+"|");
			System.out.println("");
		}
	}
	 public static void invertir_orden_filas(int [][] intMatriz) {
	        int aux = 0;
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            for (int columna = 0; columna < MAXCOLUMNA / 2; columna++) {
	                aux = intMatriz[fila][columna];
	                intMatriz[fila][columna] = intMatriz[fila][MAXCOLUMNA - 1 - columna];
	                intMatriz[fila][MAXCOLUMNA - 1 - columna] = aux;
	            }
	        }
	    }
}

