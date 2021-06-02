package clase_8;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y elimine la primer ocurrencia de numero
en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda y no continuar buscando.
 */


public class ejercicio_5 {
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
			pos = buscar_posicion_numero(matint,numero,pos);
			if (pos != null) {
				corrimiento_izquierda(matint,pos);
				imprimir_matriz_int(matint);
			} else {
				System.out.println("El número ingresado no se encuentra en la matriz.");
			}
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
	public static void corrimiento_izquierda(int [][]matint, int[] pos) {
		int i = pos[1];
		while (i < MAXCOLUMNA - 1) {
			matint[pos[0]][i] = matint[pos[0]][i + 1];
			i++;
		}
	}
	public static int[] buscar_posicion_numero(int [][] matint, int numero, int [] pos) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int columna = 0; columna < MAXCOLUMNA; columna++) {
				if (matint[fila][columna] == numero) {
					pos[0] = fila;
					pos[1] = columna;
					return pos;
				}
			}
		}
		return null;
	}
}
