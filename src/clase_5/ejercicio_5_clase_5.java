package clase_5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 5.Escribir un programa que mientras que el usuario ingrese un caracterd�gito o caracterletra 
 * min�scula, imprima si es caracterd�gito o caracterletra min�scula, y si es letra min�scula 
 * imprimir si es vocal o consonante.
 */

	public class ejercicio_5_clase_5 {
		public static void main(String[]args){
			char caracter;
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un caracter: ");
				caracter = entrada.readLine().charAt(0);
				
				while ((caracter >='0')&&(caracter <='9')){
						System.out.println("Es caracter digito");
					}
					if ((caracter >='a')&&(caracter <='z')){
						System.out.println("Es caracter letra minuscula");
					if ((caracter =='a')||(caracter =='e')||(caracter =='i')||(caracter =='o')||(caracter =='u')){
						System.out.println(" vocal");
					}
					else{
						System.out.println(" consonante");
						}
					}
					}
			catch(Exception exc){
				System.out.println(exc);
			}
			
		}
}
