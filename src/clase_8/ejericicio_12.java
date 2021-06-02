package clase_8;

import java.util.Random;
/*
 * Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, permita encontrar por cada fila la posici�n de inicio y fin de la
ante�ltima secuencia (considerar comenzar a buscarla a partir de la ultima
posici�n de la fila).
 */

public class ejericicio_12 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main(String[]args){
		int [][] matint = new int[MAXFILA][MAXCOLUMNA];
		
		cargar_matriz_aleatorio_int	(matint);
		imprimir_matriz_int(matint);
	}
	
	public static void posisicion (int [] matint, arr){
	int inicio = 0;
	int fin=0;
	cantidad = cantidad_sec_arreglo();
	while((inicio < MAXCOLUMNA) && (canitdad > 2)){
		inicio = buscar_pos_inicio(arr, fin+1);
		if (inicio <MAXCOLUMNA){
			fin = buscar_pos_final(arr, inicio);
			cantidad--;	
	}
	
	
		}
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

	public static void cantidad_sec_arr(int []){
		
	}
	   public static int buscar_pos_inicio(int[]arr, int num){
	        int pos = 0;
	        while ((pos < MAXCOLUMNA) && (arr[pos] != num)){
	            pos++;
	            }
	        System.out.println(pos);
	        return pos;
	    }
	   public static int buscar_pos_final(int[]arr, int num){
	        int pos = MAXCOLUMNA-1;
	        while ((pos >= 0) && (arr[pos] != num)){
	            pos--;
	            }
	        System.out.println(pos);
	        return pos;
	    }
}
