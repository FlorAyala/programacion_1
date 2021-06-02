package arreglos;

/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posición donde se encuentra un numero entero ingresado por el usuario. Si existe muestre esa posicion por pantalla.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase_7_Ejemplo_4 {
	
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int pos,numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos = buscar_pos_des(arrenteros,numero);
			System.out.println("El promedio del arreglo es: "+pos);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
		//cargar el arreglo con alguno de los metodos propuestos
	}

	public static int buscar_pos_des(int[] arr,int valor) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]!=valor)){
			pos++;
		}
		return pos;
	}
} 
