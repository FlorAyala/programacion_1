package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total).
 */

public class ejercicio_4_clase_2 {
	public static void main (String [] args){
		String nombre_y_apellido, producto1, producto2;
		char tipo_de_factura;
		int numero;
		double importe1, importe2;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Tipo de factura");
			tipo_de_factura = entrada.readLine().charAt(0);
			
			System.out.println("numero de factura");
			numero = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el nombre y apeliido");
			nombre_y_apellido =  entrada.readLine();
			
			System.out.println("ingrese primer producto");
			producto1 = entrada.readLine();
			System.out.println("ingrese el importe del primer producto");
			importe1 = Double.valueOf(entrada.readLine());
			
			System.out.println("ingrese segundo producto");
			producto2 = entrada.readLine();
			System.out.println("ingrese el importe del segundo producto");
			importe2 = Double.valueOf(entrada.readLine());			
			
			
			
			System.out.println("Factura \t"  + tipo_de_factura + "\t"  + numero);
			System.out.println("Nombre y apellido: \t" + nombre_y_apellido);
			System.out.println("Producto \t Importe ");
			System.out.println( producto1  + "\t" + importe1);
			System.out.println( producto2  + "\t" + importe2);
			System.out.println( "Importe total \t" + (importe1 + importe2));
			
			
			
		}
		catch (Exception exc){
			
		}
		
	}

}
