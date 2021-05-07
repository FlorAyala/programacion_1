package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras el usuario ingresa un caracter distinto del caracter‘*’,
 *  muestre por pantalla si es caracterdigito, o si es caractervocal minúscula.
 */

	public class ejercicio_3_clase_5 {
		public static void main(String[] args){
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			char caracter = 0;
			while(caracter != '*'){
				try{
				System.out.println("Ingrse un caracter: ");
				caracter = entrada.readLine().charAt(0);
				
					if ((caracter >='0')&&(caracter <='9')){
						System.out.println("Es caracter digito");
					}
					else if ((caracter >='a')&&(caracter <='z')){
						System.out.println("Es caracter letra minuscula");
						if ((caracter =='a')||(caracter =='e')||(caracter =='i')||(caracter =='o')||(caracter =='u')){
							System.out.println(" vocal");
						}}
					else{
						System.out.println(" consonante");
					}
					
					
				}
				
			
			catch(Exception exc){
				System.out.println(exc);
			}
		}
		}}


