package clase_4;

/*
Hacer un programa que solicite la carga desde consola de
un caracter y realice: imprima si es digito, o letra minuscula, o
es cualquier otro caracter. Si es letra minuscula indicar si es
vocal o consonante.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP_3_P2_E2 {
	public static void main (String[]args) {
		char caracter;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			if ((caracter >='0')&&(caracter <='9')){
				System.out.println("Es caracter digito");
			}
			else if ((caracter >='a')&&(caracter <='z')){
				System.out.println("Es caracter letra minuscula");
				if ((caracter =='a')||(caracter =='e')||(caracter =='i')||(caracter =='o')||(caracter =='u')){
					System.out.println(" vocal");
				}
				else{
					System.out.println(" consonante");
				}
			}
		}catch (Exception exc) {
			System.out.println("Ingrese un valor valido");
		}
	}
}