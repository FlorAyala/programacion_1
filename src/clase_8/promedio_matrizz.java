package clase_8;
import java.util.Random;

/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra precargada, 
imprima por pantalla el promedio de cada una de sus columnas.

	 0 1 2
0	|1|3|5|
1	|2|4|4|

 */
public class promedio_matrizz {
	public static final int MAXFILA = 4;	
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [][] matint;
		matint = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_aleatorio_int(matint);
		imprimir_matriz_int(matint);
		imprimir_por_pantalla_promedios_matriz(matint);
	}

	public static void imprimir_por_pantalla_promedios_matriz(int [][] mat){
		int promedio;
		for (int columna = 0; columna < MAXCOLUMNA; columna++){
			promedio = obtener_promedio_columna(mat,columna);
			System.out.println("el promedio de la columna "+columna+" es "+promedio);
		}
	}

	public static int obtener_promedio_columna(int [][] mat, int columna){
		int promedio,suma;
		suma = 0;
		for (int fila = 0; fila < MAXFILA; fila++){
			suma+=mat[fila][columna];
		}
		promedio=suma/MAXFILA;
		return promedio;
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
		for (int i = 0 ; i < MAXFILA; i++){
			for (int j = 0 ; j < MAXCOLUMNA; j++)
				System.out.print(" "+mat[i][j]);
			System.out.println("");
		}
	}
}
