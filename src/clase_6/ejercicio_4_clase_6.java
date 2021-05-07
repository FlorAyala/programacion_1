package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Escribir un programa que mientras el usuario cargue desde teclado un numero entero distinto de 0,
 *  imprima por pantalla la suma que se obtiene de invocar un método que calcula la sumatoria de 
 *  los primeros 200 números naturales (son números enteros en 1 y 200).
 */

	public class ejercicio_4_clase_6 {
		public static void main(String[]args){
			int entero;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			try{
				System.out.println("ingrese un numero entero: ");
				entero = Integer.valueOf(entrada.readLine());
					while(entero != 0){	
						sumatoria();
						System.out.println("ingrese un numero entero: ");
						entero = Integer.valueOf(entrada.readLine());
					}
			}
			catch(Exception exc){
				System.out.println("");
			}
		}
		public static void sumatoria(){
			final int MAX= 200;
			int acumulador =0;
			for(int i = 1; i <= MAX; i++){
				acumulador += i;
			}
				
				System.out.println(" la suma es : "+ acumulador);
			
		}

}
