package clase_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 /*
  * Escribir un programa que permita el ingreso de un car�cter y realice:
	_ imprima es car�cter d�gito si el car�cter ingresado es car�cter d�gito,
	_ o imprima no es car�cter d�gito
  */

	public class ejercicio_1_clase_4 {
		public static void main (String [] args){
			char letra;
			//int digito;
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un caracter: ");
				letra = entrada.readLine().charAt(0);
				
				//digito =Integer.valueOf(entrada.readLine());
				
				
				if ((0 >=letra) &&(letra <=9) ){
					System.out.println("Es un carater digito" );
				}
				else{
					
					System.out.println("No es un caracter digito");
					
				}
					
			}
			catch (Exception exc){
				
			}
		}
}
