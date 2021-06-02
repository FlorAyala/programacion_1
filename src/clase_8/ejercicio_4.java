package clase_8;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*
 * Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario un numero entero y una posición fila, columna. Con estos
datos tendrá que realizar un corrimiento a derecha (se pierde el último valor en dicha fila)
y colocar el numero en la matriz en la posición fila, columna indicada.
 */

public class ejercicio_4 {
	public static final int MAXFILA = 5;
	public static final int MAXCOLUMNA = 10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static void main (String[]args){
		int [][] matint; 
		matint = new int[MAXFILA][MAXCOLUMNA];



		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			cargar_matriz_aleatorio_int(matint);
			imprimir_matriz_int(matint);

			
			System.out.println("Ingrese una posicion de fila: ");
			int numeroFila = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese una posicion de columna: ");
			int numeroColumna= Integer.valueOf(entrada.readLine());
			corrimiento_derecha(matint,numeroFila,numeroColumna);
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

	 public static void corrimiento_derecha(int [][] matint, int numeroFila, int numeroColumna) {
	        if ((numeroFila >= 0) && (numeroFila < MAXFILA) && (numeroColumna >= 0) && (numeroColumna < MAXCOLUMNA)) {
	        	   int i = MAXCOLUMNA - 1;
	               int aux;
	               aux = matint[numeroFila][i];

	            while (i < numeroColumna) {
	            	matint[numeroFila][i] = matint[numeroFila][i - 1];
	                i--;
	            }
	            matint[numeroFila][numeroColumna] = aux;
	            imprimir_matriz_int(matint);
	        } else {
	            System.out.println("Los valores ingresados exceden las dimensiones de la matriz.");
	        }
	    }
}
