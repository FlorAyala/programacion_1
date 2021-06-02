package arreglos;

/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, imprima por pantalla el promedio de la suma de sus valores.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase_7_Ejemplo_3 {
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int promedio;
		//cargar el arreglo con alguno de los metodos propuestos
		cargar_arreglo_int(arrenteros);
		promedio = promedio_arreglo(arrenteros);
		System.out.println("El promedio del arreglo es: "+promedio);
	}

	public static int promedio_arreglo(int [] arr){
		int suma = 0;
		for (int pos = 0; pos < MAX; pos++){
			suma+=arr[pos];
		}   
		return (suma/MAX);
	}
	
	public static void cargar_arreglo_int(int [] arr){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int pos = 0; pos < MAX; pos++){
				System.out.println("Ingrese un entero: ");
				//modifico arr[pos], entonces modifico arrenteros[pos]
				arr[pos] = Integer.valueOf(entrada.readLine());
			}   
		}
		catch(Exception exc){
			System.out.println(exc);  
		}
	}	
} 

