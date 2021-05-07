
package clase_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que permita el ingreso de dos números enteros por teclado y realice:
		_ imprima A si el primero mayor al segundo,
		_ o imprima B si ambos son múltiplos de 2,
		_ o imprima C para ninguna de las opciones anteriores
 */

	public class ejercicio_2_clase_4 {
		public static void main (String[] args){
			
			int numero_1, numero_2;
			
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese el primer numero");
				numero_1=Integer.valueOf(entrada.readLine());
				
				System.out.println("Ingrese el segundo numero");
				numero_2 = Integer.valueOf(entrada.readLine());
				
				if(numero_1 > numero_2){
					System.out.println("A");
				}
				else if ((numero_1 % 2 == 0) && (numero_2 % 2 == 0)){
					
					System.out.println("B");
				}
				else{
					System.out.println("C");
				}
					

			}
			catch( Exception exc){
				
			}
		}

}
