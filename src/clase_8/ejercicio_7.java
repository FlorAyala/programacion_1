package clase_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 * Hacer un programa que dado una matriz ordenada creciente por filas de
enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
numero entero y una fila, y luego inserte el numero en la matriz en la fila
indicada manteniendo su orden.
 */


public class ejercicio_7 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	
	public static void main (String[]args){
		int [][] matint = new int[MAXFILA][MAXCOLUMNA];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		cargar_matriz_ord_int(matint);
		imprimir_matriz_int(matint);
		
		try{
			  System.out.println("Ingrese una fila (entre 0 y 3):");
	            int fila = Integer.valueOf(entrada.readLine());
	            System.out.println("Ingrese el numero entero cuya primera ocurrencia desea eliminar:");
	            int numero = Integer.valueOf(entrada.readLine());
	            buscar_posicion_numero(matint,fila,numero);
			

		}
		catch(Exception exc){
			System.out.println("exc");
		}

	}
	 public static void cargar_matriz_ord_int(int[][] matint) {
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            int valor = 0;
	            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
	            	matint[fila][columna] = valor;
	                valor += 2;
	            }
	        }
	    }
	public static void imprimir_matriz_int(int[][] mat) {
		System.out.println("-------------------");
		for (int fila = 0 ;fila < MAXFILA; fila++){
			System.out.println("|");
			for (int columna = 0 ; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}

	public static void eliminarNumeroMatriz(int[][] matint, int fila, int posicion) {
        for (int columna = posicion; columna < MAXCOLUMNA - 1; columna++) {
        	matint[fila][columna] = matint[fila][columna + 1];
        }
        imprimir_matriz_int(matint);
    }

	

public static void buscar_posicion_numero(int[][] matint, int fila, int numero) {
	 boolean existeNumero = existeNumeroFila(matint,fila,numero);
     if (existeNumero == true) {
         int posicion = 0;
         for (int columna = 0; columna < MAXCOLUMNA; columna++) {
             if (numero == matint[fila][columna]) {
                 posicion = columna;
                 break;
             }
         }
         eliminarNumeroMatriz(matint,fila,posicion);

     } else {
         System.out.println("El numero ingresado no existe.");
         }
     }

public static boolean existeNumeroFila(int[][] matint, int fila, int numero) {
    boolean existeNumero = false;
    for (int columna = 0; columna < MAXCOLUMNA; columna++) {
        if (numero == matint[fila][columna]) {
            existeNumero = true;
            break;
        }
    }
    return existeNumero;
}

}
