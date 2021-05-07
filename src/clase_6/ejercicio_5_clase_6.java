package clase_6;
import java.io.BufferedReader;

import java.io.InputStreamReader;


/*
 * Escribir un programa que mientras el usuario ingresa un caracterdistinto del caracter‘*’, invoque a un método que imprima si es 
 * caracterdígito o caracterletra minúscula, y si es letra minúscula imprimir si es vocal o consonante.
 */
public class ejercicio_5_clase_6 {
	public static void main(String[]args){
	char caracter;
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	try{
		System.out.println("ingrese un caracter digito o letra ");
		caracter = entrada.readLine().charAt(0);
			while(caracter != '*'){
				caracter_digito_letra( caracter);
				System.out.println("ingrese un caracter digito o letra ");
				caracter = entrada.readLine().charAt(0);
			}
	}
	catch(Exception exc){
		System.out.println();
	}
	
	}public static void caracter_digito_letra(char caracter) {
		
		
		while ((caracter >='0') && (caracter <='9')||(caracter >='a')&&(caracter <='z')){
			if((caracter >='0') && (caracter <='9')){
				System.out.println("Es caracter digito");
			} 
			 if ((caracter >='a')&&(caracter <='z')){
				System.out.println("Es caracter letra minuscula");
			}
			  if ((caracter =='a')||(caracter =='e')||(caracter =='i')||(caracter =='o')||(caracter =='u')){
				System.out.println(" Es vocal");
			}
			else{
				System.out.println(" Es consonante");
			}
			
			
		}
		}
		
	}
	


