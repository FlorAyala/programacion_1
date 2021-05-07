package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Escribir un programa que mientras que el usuario ingrese un número entero natural, llame a un método que calcule la sumatoria entre 1
 *  y dicho numero y se lo retorne como resultado.
 */
	public class ejercicio_6_clase_6 {
		public static void main(String[]args){
			int entero;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("Ingrese un numero entero natural");
				entero = Integer.valueOf(entrada.readLine());
					while(entero != 0){
						sumatoria();
						System.out.println("Ingrese un numero entero natural");
						entero = Integer.valueOf(entrada.readLine());
				}
			}
			catch(Exception exc){
				System.out.println();
			}

		}
		public static void sumatoria(){
			
		}
	}
