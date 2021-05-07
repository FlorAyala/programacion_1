package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar.
 */

	public class ejercicio_5_clase_2 {
		public static void main(String[]args){
			//variables del circulo 
			double radio, base, altura, pi=3.14;
			
			
			
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				//CIRCULO
				System.out.println("Ingrese el radio del circulo");
				radio = Double.valueOf(entrada.readLine());
				System.out.println("el radio es:" + radio + ",mas el pi" + pi);
			
			
			
				//TRIANGULO
				
				System.out.println("Ingrese la base del triangulo");
				base = Double.valueOf(entrada.readLine());
				System.out.println("Ingrese la altura del triangulo");
				altura =Double.valueOf(entrada.readLine());
				System.out.println("La base del triangulo es: " + base + "\t" + "y su altura es: " + altura);
			}
			catch(Exception exc){
				
			}
		}

}
