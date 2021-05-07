package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive,
 *  lleve la suma de los números ingresados. Finalmente, cuando sale del ciclo muestre por pantalla 
 *  el resultado de la suma.
 */
	public class ejercicio_6_clase_5 {
		public static void main(String[]args){
			int numero1 , numero2 , suma=0;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("Ingrese el primer numero");
				numero1=Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el segundo numero");
				numero2=Integer.valueOf(entrada.readLine());
				while(numero2 == -1 || numero1 == -1);
				   suma=numero1 + numero2;
		        
			System.out.println("La suma es  = " + suma);
			}
	
			catch(Exception exc){
				System.out.println(exc);
			}

			
		}
			}
