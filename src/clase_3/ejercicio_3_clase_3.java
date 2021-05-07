package clase_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 *Escribir un programa que permita el ingreso de dos números enteros por teclado e imprima el resultado de comparar:
 el primero mayor al segundo.
 ambos son múltiplos de 2.
 */
	public class ejercicio_3_clase_3 {
		public static void main(String[]args){
			int numero1, numero2;
			boolean resultado;
			
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				//ingreso de numeros enteros
				System.out.println("Ingrese el primer numero entero");
				numero1 = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el segundo numero entero");
				numero2 =Integer.valueOf(entrada.readLine());
				
				//operaciones
				resultado = (numero1 < numero2 );
				System.out.println("El primero es mayor al segundo: " + resultado);
				
				resultado = (((numero1 % 2) == 0)&& ((numero2 % 2) == 0));
				System.out.println("El primer y segundo numero son multiplo de 2: " + resultado);
			
			}
			
			
			
			catch(Exception exc){
				
			}
		}
}
