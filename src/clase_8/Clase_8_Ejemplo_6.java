package clase_8;

/*Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra precargada,
solicite al usuario una posicion fila, columna, y realice un corrimiento a derecha. 
Ademas imprima la matriz antes y despues del corrimiento
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Clase_8_Ejemplo_6 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		int [][] matint; 
		int fila, columna;
		matint = new int[MAXFILA][MAXCOLUMNA];                  
		cargar_matriz_aleatorio_int(matint);
		imprimir_matriz_int(matint);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));      
		try{
			System.out.println("Ingrese una fila :");
			fila = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese una columna :");
			columna = Integer.valueOf(entrada.readLine());
			if ((0<=fila)&&(fila < MAXFILA)&&(0<=columna)&&(columna < MAXCOLUMNA)){
				corrimiento_der_fila_columna(matint[fila],columna);
				imprimir_matriz_int(matint);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

	public static void corrimiento_der_fila_columna(int [] arrenteros, int pos){
		int indice = MAXCOLUMNA-1;
		while (indice > pos){
			arrenteros[indice] = arrenteros[indice-1];
			indice--;
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
			for (int j = 0 ; j < MAXCOLUMNA; j++)
				System.out.print("| "+mat[i][j]);
			System.out.println("");
		}
	}}
