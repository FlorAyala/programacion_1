package clase_5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive, 
 * lleve la suma de los números ingresados y la cantidad de sumas que realizó.
 *  Finalmente, cuando sale del ciclo muestre por pantalla el resultado del promedio de todo lo 
 *  ingresado.
 */

	public class ejercicio_7_clase_5 {
		public static void main(String[]args){
			int numero = 0;
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			while(numero <= 10){
				try{
					System.out.println("Ingrese un numero entero menor que 10: ");
					numero =Integer.valueOf(entrada.readLine());
	
				}
				catch(Exception exc){
					
				}
			
			
				int suma = numero;
				while(suma <= 1)
				suma= suma + 1;
				System.out.println("La suma es: " + suma);
			}
			
			
		}
		}


