package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 * Escribir un programa que mientras que el usuario ingrese un caracterletra minúscula, pida ingresar un numero entero. 
 * Si el número ingresado está entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho numero.
 */
public class ejercicio_8_clase_6 {
	public static void main(String[]args){


			char caracter = pedir_caracter(caracter); 
			int entero =pedir_entero();
		try{
			pedir_caracter(caracter);
			
				while((caracter >= 'a') && (caracter <= 'z')){
				pedir_entero();
					while((entero>=1)&&(entero<=5)){
					Imprimir_Tabla(entero);
					pedir_entero();
				}

			}}
		catch(Exception exc){
			System.out.println("error1");
		}
	}
	public static int pedir_entero( ){
		int entero= 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("ingrese un numero entero");
			entero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println("error2");
		}
		return entero;

	}
	public static char pedir_caracter(char caracter){
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.println("Ingrese un letra minuscula");
			caracter = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println("error3");
		}
		return caracter;

	}



	public static void Imprimir_Tabla(int entero){
		for (int mult = 1;mult <= 10; mult++ ){
			System.out.println(entero+" * " + mult + " = " + (mult*entero));
		}
	}}
