package clase_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en la matriz si existe. Mientras exista (en cada iteración tiene que buscar la posición fila y
columna) tendrá que usar dicha posición para realizar un corrimiento a izquierda.
 */
import java.util.Random;

public class ejercicio_6 {
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int [][] matint; 
		matint = new int[MAXFILA][MAXCOLUMNA];
		int [] pos = new int[2];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			cargar_matriz_aleatorio_int(matint);
			imprimir_matriz_int(matint);
			System.out.println("Ingrese una numero entero: ");
			int numero = Integer.valueOf(entrada.readLine());
			 buscar_posicion_numero(matint,numero,pos);
			imprimir_matriz_int(matint);
			
		}
		catch(Exception exc){
			System.out.println("");
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
	
	public static void buscar_posicion_numero(int [][] matint, int numero, int [] pos) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int columna = 0; columna < MAXCOLUMNA; columna++) {
				if (matint[fila][columna] == numero) {
					pos[0] = fila;
					pos[1] = columna;
					corrimiento_izquierda(matint,pos);
	                    if (matint[fila][MAXCOLUMNA - 1] != numero) {
	                        columna--;
				}
			}
				}
		}
		
	}
	public static void corrimiento_izquierda(int [][]matint, int[] pos) {
		int i = pos[1];
		while (i < MAXCOLUMNA - 1) {
			matint[pos[0]][i] = matint[pos[0]][i + 1];
			i++;
		}
	}
}
