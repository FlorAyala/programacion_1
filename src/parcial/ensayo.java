package parcial;

/*
Hacer un programa completo que mientras el usuario ingrese un numero entero mayor que 0 y menor que 50 realice lo siguiente:
_acumule en una variable suma el valor ingresado solo si el mismo es par.
Finalmente cuando sale de la iteracion imprima por pantalla la suma que fue acumulando.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class ensayo {
		public static void main(String[]args){
			
			int entero;
			int suma= 0;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			try{
				System.out.println("Ingrese un numero entero: ");
				entero = Integer.valueOf(entrada.readLine());
					while((entero > 0) && (entero < 50)){
						
					         if (entero % 2==0){
					             suma= suma + entero;
     
					         }
						System.out.println("Ingrese un numero entero (Mayor a 50 para salir): ");
						entero = Integer.valueOf(entrada.readLine());
				
					}
					
			}
			catch(Exception exc){
				System.out.println(exc);
			}
			System.out.println("la suma es:"+suma);

	
}
}
