package clase_8;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, obtenga la cantidad de números pares que tiene y la imprima.
 */

import java.util.Random;
public class ejercicio_2 {
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int [][] matint; 
		matint = new int[MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_int(matint);
		imprimir_matriz_int(matint);
		buscar_numeros_pares(matint);
		
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
	   public static void buscar_numeros_pares(int [][] intMatriz) {
	        int contador = 0;
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
	               if (intMatriz[fila][columna] % 2 == 0) {
	                   contador++;
	               }
	            }
	        }
	        System.out.println("Cantidad de numeros pares en la matriz: " + contador);
	    }
}
