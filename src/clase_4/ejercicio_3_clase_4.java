package clase_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que ingrese un n�mero entero por teclado y realice:
		_ imprima es m�ltiplo de 6 y de 7 si cumple con esa condici�n,
		_ o imprima es mayor a 30 y m�ltiplo de 2 si cumple con esa condici�n,
		_ imprima si el cociente de la divisi�n de dicho n�mero con 5 es mayor a 10 sin importar las condiciones previas
 */
	public class ejercicio_3_clase_4 {
		public static void main (String[] args){
		 
			int numero;
			boolean numero2;
			
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero entero: ");
				numero= Integer.valueOf(entrada.readLine());
				
				if ((numero % 6 == 0) && (numero % 7 == 0)){
					System.out.println("Es multiplo de 6 y de 7");
				}
				else if((numero > 30) && (numero % 2 == 0)){
					System.out.println("Es mayor a 30 y multiplo de 2");
				}
				
				numero2 = (((numero % 5) == 0 ) && (numero > 10)); 
					System.out.println("El cociente de la divisi�n de dicho n�mero con 5 es mayor a 10" + numero2);
				
			
			
			}
			
			catch(Exception exc){}
		}
}
