package clase_5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Escribir un programa que mientras el usuario ingrese un caracterletra minúscula, se quede con la
 *  menor y la mayor letra ingresada. Finalmente muestre por pantalla dichas letras.
 */

	public class ejercicio_9_clase_5 {
		public static void main (String[]args){
			
			final char  MIN= 'a';
			final char MAX = 'z';
			char caracter;
			char menor= MIN;
			char mayor = MAX;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("Ingrese un caracter letra: ");
				caracter = entrada.readLine().charAt(0);
					while((MIN < caracter)&&(caracter < MAX)){
							if(caracter<menor){
							menor=caracter;
					}
							else if(caracter>menor){
						mayor = caracter;
					}
				}
						System.out.println("Ingrese un caracter letra: ");
						caracter = entrada.readLine().charAt(0);
			}
			catch(Exception exc){
				System.out.println(exc);
			}
			
			
			if(menor != MAX){
				System.out.println("El menor ingresado es: " + menor);
			}
			else if (mayor !=MIN){
				System.out.println("El mayor ingresado es: " + mayor);
			}
		}

}
