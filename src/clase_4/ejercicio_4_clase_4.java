package clase_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que solicite la carga desde consola de un numero entero y realice:
_si el numero es positivo,imprima “grande” si es mayor a 100 o “chico “ si es menor. 
	Además deberá imprimir que el valor es positivo.
_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o ninguna de las opciones anteriores.
 */

	public class ejercicio_4_clase_4 {
		public static void main (String [] args){
		
			int numero;
			try{
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un número entero");
				numero = Integer.valueOf(entrada.readLine());
				if(numero > 0){
					if(numero > 100){
						System.out.println("Grande");
					}
					else {
						System.out.println("Chico");
					}
					System.out.println("El valor ingresado es positivo");	
				}
				 if( (numero % 2) == 0){
					System.out.println("El numero es par");
				}
				 if((numero % 3) == 0){
					System.out.println("El numero es multiplo de 3");	
					
				} else {
					System.out.println("Ninguna de las opciones anteriores ");
				}					
				
				
				
			}
			catch(Exception exc){
				
			}
		
		}
}
