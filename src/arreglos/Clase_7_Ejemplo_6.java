package arreglos;

/*Hacer un programa que dado un arreglo de enteros ordenado creciente de tamano 10 que se encuentra precargado, encuentre la posicion donde se encuentra un numero entero ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase_7_Ejemplo_6 {
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int pos,numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			//CARGAR EL ARREGLO CON ALGUNO DE POR CONSOLA DE MANERA ORDENADA CRECIENTE
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos = buscar_pos_arreglo_ord_crec(arrenteros,numero);
			if ((pos<MAX)&&(arrenteros[pos]==numero)){
				System.out.println("La posicion de "+numero+" es: "+pos);
			}
			else{
				System.out.println(numero + " no existe en el arreglo");	
			}			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	//La posicion que retorna no significa que este ahí, es donde deberia estar
	public static int buscar_pos_arreglo_ord_crec(int[] arr,int numero) {
		int pos = 0;
		while ((pos<MAX)&&(arr[pos]<numero)){
			pos++;
		}
		return pos;
	}
} 
