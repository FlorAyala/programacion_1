package clase_8;
import java.util.Random;
/*
 * Dada una matriz MAT de enteros precargada, se pide cargar un arreglo ARR_SUMAS_FILAS_ORD los indices de las dilas de MAT y 
 * ordenarlo de forma tal que perimita mantener un orden creciente de MAt por la suma de sus filas.
 */

public class ejermplo_10 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int [][] matint = new int[MAXFILA][MAXCOLUMNA];
		int [] arr_suma_filas_ord = new int[MAXFILA];
		cargar_matriz_aleatorio_int	(matint);
		imprimir_matriz_int(matint);	
		cargar_indices_filas_arreglos(arr_suma_filas_ord);
		System.out.println("");
		ordenar_arreglo_indice_seleccion(matint,arr_suma_filas_ord );
		imprimir_arreglo_int(arr_suma_filas_ord);



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
				System.out.print("| "+mat[i][j]);
			System.out.println("");
		}
	}

	public static void cargar_indices_filas_arreglos(int [] arr){
		for (int fila = 0; fila < MAXFILA; fila++){
			arr[fila]=fila;
		}
	}

	public static int obtener_suma_fila(int[] arr){
		int suma = 0;
		for( int columna= 0; columna < MAXCOLUMNA; columna++){
			suma += arr[columna];
		}

		return suma;
	}

	public static void ordenar_arreglo_indice_seleccion(int[][] original, int arr[]) {
		int pos_menor, temp;
		int i, j;
		i = 0;
		while(i< MAXFILA){
			pos_menor = i;
			j = i + 1;
			while(j <MAXFILA){
				if((obtener_suma_fila(original[arr[j]])) < obtener_suma_fila(original[arr[pos_menor]])){
					pos_menor = j;
				}
				j++;
			}
			if(pos_menor !=i){
				temp =arr[i];
				arr[i]=arr[pos_menor];
				arr[pos_menor]=temp;
			}
			i++;
		}
	}

	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAXFILA; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
	
}

