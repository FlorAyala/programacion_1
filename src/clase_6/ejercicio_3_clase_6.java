package clase_6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que mientras el usuario cargue desde teclado un caracterletra minúscula, 
 * llame a un método que imprime por pantalla la tabla de multiplicar de 9.
 */
	public class ejercicio_3_clase_6 {
		public static void main(String[]args){
			char caracter;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			try{
				System.out.println("Ingrese un caracter letra minuscula: ");
				caracter = entrada.readLine().charAt(0);
					while((caracter >= 'a') && (caracter <= 'z')){
						imprimir_tabla_9 ();
							System.out.println("Ingrese un caracter letra: ");
							caracter = entrada.readLine().charAt(0);
						
					}
				
			}
			catch(Exception exc){
				System.out.println("LA letra ingresada no es minuscula");
			}
		}
		
		public static void imprimir_tabla_9(){
			final int MAX= 10;
			int numero = 9;
			for (int multiplicador=1; multiplicador <=MAX; multiplicador++) {
				System.out.println(multiplicador +" * "+numero+" = "+(multiplicador *numero));
				}

		}

		
}
