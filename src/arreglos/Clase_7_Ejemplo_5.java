package arreglos;

/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del corrimiento
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase_7_Ejemplo_5 {
	public static int MINVALOR = 1;
	public static int MAXVALOR = 10;
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			cargar_arreglo_aleatorio(arrenteros);
			imprimir_arreglo(arrenteros);
			System.out.println("Ingrese un numero entero :");
			pos = Integer.valueOf(entrada.readLine());
			corrimiento_der(arrenteros,pos);
			imprimir_arreglo(arrenteros);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

	public static void corrimiento_der(int[] arr,int pos) {
		int actual = MAX-1;
		while (pos<actual){
			arr[actual] = arr[actual-1];
			actual--;
		}
	}
	
	public static void cargar_arreglo_aleatorio(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(int)((MAXVALOR-MINVALOR)*Math.random() + MINVALOR);  
		}
	}

	public static void imprimir_arreglo(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}   
	}  	
} 
