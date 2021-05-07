package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras el usuario ingrese un número entero menor que 10 y mayor a 1, 
 * muestre por pantalla si el número es múltiplo de 2 y múltiplo de 3 simultáneamente. 
 * (¿Los valores mencionados deberían ser constantes?. De a poco habría que definirlos como 
 * constantes).
 */

	public class ejercicio_1_clase_5 {
		public static void main ( String[]args){
			
			int numero ;
			final int MIN =1;
			final int MAX = 10;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			
			try{
				System.out.println("Ingrese un numero entre el 1 y 10");
				numero =Integer.valueOf(entrada.readLine());
				
				while((numero > MIN) && (numero < MAX)){
					if((numero % 2 == 0 ) && (numero % 3 ==0) ){
						System.out.println("multiplo de 2 " +numero);
						System.out.println("multiplo de 3" + numero);
					}
						
				
				System.out.println("Ingrese un numero entero (0 para salir):");
				numero = Integer.valueOf(entrada.readLine());
				
				}
				
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}
}
