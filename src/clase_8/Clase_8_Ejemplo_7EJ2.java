package clase_8;

/*
 * ORDENAR POR COLUMNA CON SELECCION DE MANERA CRECIENTE
 */


import java.util.Random;
public class Clase_8_Ejemplo_7EJ2 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [][] matint; 

		matint = new int[MAXFILA][MAXCOLUMNA];                  
		cargar_matriz_aleatorio_int(matint);
		imprimir_matriz_int(matint);
		ordenar_matriz_columna(matint);
		imprimir_matriz_int(matint);

	}
	public static void ordenar_matriz_columna( int [][]mat){
		for(int columna = 0; columna < MAXCOLUMNA; columna++){
			ordenar_matriz_columna_seleccion(mat, columna);
		}
	}
	public static void ordenar_matriz_columna_seleccion(int [][] mat, int columna) {
		int pos_menor, tmp;
		for (int i = 0; i < MAXFILA; i++) { 
			pos_menor = i; 		
			for (int j = i + 1; j < MAXFILA; j++){ 	
				if (mat[j][columna] < mat[pos_menor][columna]) { 	
					pos_menor = j;
				}
			}
			if (pos_menor != i){
				tmp = mat[i][columna];
				mat[i][columna] = mat[pos_menor][columna];
				mat[pos_menor][columna] = tmp;
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

		for (int i = 0 ; i < MAXFILA; i++){
			System.out.println("|");
			for (int j = 0 ; j < MAXCOLUMNA; j++)
				System.out.print(mat[i][j]+"|");
			System.out.println("");
		}
	}	
}

