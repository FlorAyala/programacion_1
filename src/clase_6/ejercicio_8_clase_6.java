package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 * Escribir un programa que mientras que el usuario ingrese un caracterletra min�scula, pida ingresar un numero entero. 
 * Si el n�mero ingresado est� entre 1 y 5 inclusive deber� imprimir la tabla de multiplicar de dicho numero.
 */
	public class ejercicio_8_clase_6 {
		public static void main(String[]args){
			int entero;
			char caracter;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			try{
				System.out.println("Ingrese un letra minuscula");
				caracter = entrada.readLine().charAt(0);
				while((caracter >= 'a') && (caracter <= 'z')){
					System.out.println("ingrese un numero entero");
					entero = Integer.valueOf(entrada.readLine());
					while((entero>=1)&&(entero<=5)){
						Imprimir_Tabla(entero);
						System.out.println("ingrese un numero entero");
						entero = Integer.valueOf(entrada.readLine());
						
					}System.out.println("Ingrese una may�scula o d�gito, otro para salir:");
		      		caracter = entrada.readLine().charAt(0);  
				}
				
			}
			catch(Exception exc){
				System.out.println();
			}
		}
		public static void Imprimir_Tabla(int entero){
		    for (int mult = 1;mult <= 10; mult++ ){
		    	System.out.println(entero+" * " + mult + " = " + (mult*entero));
		    }
	}}
