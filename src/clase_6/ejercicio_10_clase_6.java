package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 *Escribir un programa que mientras el usuario ingrese un n�mero entero entre 1 y 10, pida ingresar un caracter, y por cada
 * caracteringresado imprima:
��letra min�scula� si el caracteres una letra del abecedario en min�scula;
��letra may�scula� si el caracteres una letra del abecedario en may�scula;
��d�gito� si el caractercorresponde a un car�cter n�mero;
��otro� para los restantes casos de caracteres.
 */

public class ejercicio_10_clase_6 {
	public static void main(String[]args){
		int entero = pedir_entero();
		int MAX = 10;
		int MIN = 1;
		char caracter = pedir_caracter(caracter);
		

		pedir_entero();
		if((entero >= MIN) && (entero <= MAX)){
			
			pedir_caracter(caracter);
			tipo_caracter();

		}

	}
	public static int pedir_entero(){
		int entero = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero entero (Entre 1 y 10):");
			entero = Integer.valueOf(entrada.readLine());
		}


		catch(Exception exc){
			System.out.println("");
		}
		return entero;


	}
	public static char pedir_caracter(char caracter){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("Ingrese una letra: ");
			caracter = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println("");
		}
		return caracter;
	}


	public static void tipo_caracter(){
		int entero= 0;
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
	}}
