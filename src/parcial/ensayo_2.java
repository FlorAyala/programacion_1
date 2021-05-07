package parcial;
/*
Hacer un programa completo que mientras el usuario ingrese un caracter letra mayuscula o minuscula realice lo siguiente:
_cuente cuantas veces el caracter ingresado fue letra vocal minuscula.
Finalmente cuando sale de la iteracion imprima por pantalla la cantidad acumulada.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ensayo_2 {
	public static void main(String[]args){
		char caracter;
		char cuentachar = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese una letra en mayuscula o miniscula: ");
			caracter =entrada.readLine().charAt(0); 
			while(((caracter >= 'a') && (caracter <= 'z')) || ((caracter <= 'A') && (caracter <= 'Z'))){
				switch (caracter) {
	                case 'A': case 'E': case 'I': case 'O': case 'U':  case 'a': case 'e': case 'i': case 'o': case 'u':{
	                 	cuentachar++;
	                  break;
	                }
	                default:{
	                	System.out.println("Es consonante, ingresa una vocal.");
	                }
				}System.out.println("Ingrese una letra en mayuscula o miniscula: ");
				caracter =entrada.readLine().charAt(0); 
			}}
		catch(Exception exc){
			System.out.println("exc");
		}System.out.println("Cantidad de vocales: " + cuentachar);

	}
}
