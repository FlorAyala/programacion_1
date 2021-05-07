package clase_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 *Escribir un programa que permita el ingreso de un número entero por teclado e imprima el cociente de la división 
 *de dicho número con 2, 3, y 4.
 */
	public class ejercicio_1_clase_3 {
		public static void main(String[]args){
			
			int numero;
			boolean resultado;
			
				try{
			
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un numero entero: ");
				numero =  Integer.valueOf(entrada.readLine());
				//operaciones
				
				resultado = ((numero / 2 )==0);
				System.out.println("Resultado de la division con 2 es: " + resultado);
				
				resultado = ((numero / 3)==0);
				System.out.println("Resultado de la division con 3 es: " + resultado);
				
				resultado = ((numero / 4))==0;
				System.out.println("Resultado de la multiplicacion con 4 es: " + resultado);
			}
			
				catch(Exception exc){
				
			}
		}
}
