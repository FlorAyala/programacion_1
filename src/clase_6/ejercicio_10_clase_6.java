package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 *Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10, pida ingresar un caracter, y por cada
 * caracteringresado imprima:
–“letra minúscula” si el caracteres una letra del abecedario en minúscula;
–“letra mayúscula” si el caracteres una letra del abecedario en mayúscula;
–“dígito” si el caractercorresponde a un carácter número;
–“otro” para los restantes casos de caracteres.
 */

public class ejercicio_10_clase_6 {
		public static void main(String[]args){
			int entero;
			int MAX = 10;
			int MIN = 1;
			char caracter;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			try{
				System.out.println("Ingrese un numero entero (Entre 1 y 10):");
				entero = Integer.valueOf(entrada.readLine());
					while((entero >= MIN) &&(entero <= MAX)){
						System.out.println("Ingrese una letra: ");
						caracter = entrada.readLine().charAt(0);
							if((entero >='a')&&(entero <='z')){
								System.out.println("letra minuscula");
							}
								else if((entero >='A') && (entero <='Z')){
								System.out.println("letra mayuscula");
								}
							else if((entero >= 0 ) && (entero <= 9)){
								System.out.println("digito");
							}	
							else{
								System.out.println("otro");
							}
								
							}
					}
				
				
			
			catch(Exception exc){
				System.out.println("");
			}
		}

}
