package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	/*
	 Escribir un programa que solicite los siguientes datos de una persona (nombre,
apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.
	 */
	public class ejercicio_3_clase_2 {
		public static void main (String[] args){
			
			int edad;
			String  nombre_y_apellido, ocupacion, direccion;
			double altura;
			
			try{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese el nombre y apellido:");
				nombre_y_apellido =  entrada.readLine();
				
				System.out.println("Ingrese la edad: ");
				edad = Integer.valueOf(entrada.readLine());
				
				System.out.println("Ingrese la altura: ");
				altura =Double.valueOf(entrada.readLine());
				
				System.out.println("Ingrese la ocupacion:");
				ocupacion = entrada.readLine();
				
				System.out.println("Ingrese la direccion: ");
				direccion = entrada.readLine();
				

				
				System.out.println("Nombre y apellido:" + nombre_y_apellido);
				System.out.println("Edad:" + edad);
				System.out.println("Altura: " + altura);
				System.out.println("Ocupacion:" + ocupacion);
				System.out.println("Direccion: " + direccion);
			}
			catch (Exception exc){
				
			}
		}
}
