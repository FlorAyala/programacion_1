package clase_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 4.Escribir un programa que mientras que el usuario ingrese un número entero distinto de 0, 
 * pida ingresar otro número entero y lo imprima
 */


	public class ejercicio_4_clase_5 {
		public static void main(String[]args){
			
			int entero = 0;
			int entero2;
			
				try{
					BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("ingrese un numero entero: ");
					entero = Integer.valueOf(entrada.readLine());
					while(entero != 0 ){
						System.out.println("ingrese nuevamente un numero entero: ");
						entero2 = Integer.valueOf(entrada.readLine());
					}
					
				}
				catch(Exception exc){
					System.out.println(exc);
				}
					
						
					
				
				
			}
		}
	
	
