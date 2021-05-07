package clase_5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *Escribir un programa que solicite al usuario el ingreso de un número entero positivo, y muestre
 * por pantalla los valores entre el numero ingresado y 0 de manera decreciente.
 */

	public class ejercicio_2_clase_5 {
		public static void main(String[]args){
			
			int entero = 0;


			while(entero <=  0){
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero positivo");
				entero =Integer.valueOf(entrada.readLine());
				
				
			}
			catch(Exception exc){
				System.out.println(exc);
			}}
			for(int cuenta = entero; cuenta >= 0 ; cuenta--){
				System.out.println(cuenta);
			
		}
			}
		}

