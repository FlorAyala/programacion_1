package clase_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que solicite la carga desde consola de un carácter y realice: imprima si es dígito,
 *  o letra minúscula, o es cualquier otro carácter. Si es letra minúscula indicar si es vocal o consonante.
 */


	public class ejercicio_5_clase_4 {
		public static void main (String [] args){
		
		char letra;
		char MENOR_DIGITO=0;
		char MAYOR_DIGITO =9;
		char MENOR_LETRA= 'a';
		char MAYOR_LETRA= 'z';
			
		
	
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un carácter: ");
			letra = entrada.readLine().charAt(0);
			
			if ((letra >=MENOR_DIGITO)&&(letra <=MAYOR_DIGITO)){
				System.out.println("Es caracter digito");
			}
			else if ((letra >=MENOR_LETRA)&&(letra <=MAYOR_LETRA)){
				System.out.println("Es caracter letra minuscula");
			 
				 switch(letra){
					 case 'a':
					 case 'e' :
					 case 'i':
				 	 case 'o' :
				 	 case 'u' :
				 		System.out.println("Es la vocal");
					 		break;
					 	
				 	default:
				 		
				 			System.out.println("Es una consonante");
				 		
				 }
			} else{
					 System.out.println("Es cualquier otro caracter");
				 }
	
		}
		
		
		catch(Exception exc){
			
		
		}
	}
}
