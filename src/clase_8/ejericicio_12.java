package clase_8;

import java.util.Random;
/*
 * Hacer un programa que dada la matriz de secuencias de caracteres definida y
precargada, permita encontrar por cada fila la posición de inicio y fin de la
anteúltima secuencia (considerar comenzar a buscarla a partir de la ultima
posición de la fila).
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
	
	public static void posisicion (){
	inicio=0
	fin=0
	cantidad = cantidad_sec_arreglo()
	while((inicio < MAXCOLUMNAS) && (canitdad > 2)){
		inicio = buscar_pos_inicio(arr, fin+1);
		if (inicio <MAXCOLUMNAS){
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

	public static void cantidad_sec_arr(){
		
	}
	   public static int buscar_pos_inicio(int[]arr, int num){
	        int pos = 0;
	        while ((pos < MAXCOLUMNAS) && (arr[pos] != num)){
	            pos++;
	            }
	        System.out.println(pos);
	        return pos;
	    }
	   public static int buscar_pos_final(int[]arr, int num){
	        int pos = MAXCOLUMNAS-1;
	        while ((pos >= 0) && (arr[pos] != num)){
	            pos--;
	            }
	        System.out.println(pos);
	        return pos;
	    }
}
