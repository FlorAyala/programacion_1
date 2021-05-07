package clase_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Construir un programa que solicite desde teclado un número de mes y posteriormente notifique por pantalla la 
 * cantidad de días de ese mes. En el caso de que ingrese 2 como número de mes (febrero), 
 * para imprimir la cantidad de días deberá solicitar ingresar un número de anio(no usar ñ), 
 * para determinar si es bisiesto o no con la siguiente sentencia:
_si ((anio% 4 == 0) && ((anio% 100 != 0) || (anio% 400 == 0))) es verdadero, entonces es bisiesto.

 */
	


	public class ejercicio_6_clase_4 {

		public static void main (String [] args){
		
			int mes, anio = 2000, numDias = 0;
	      

			
			
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el numero del mes");
			mes= Integer.valueOf(entrada.readLine());
			switch(mes)
		     
		       {
		           case 1: System.out.println("Enero");
		           numDias = 31;
		           break;
		         
		           case 2: System.out.println("Febrero");
			           System.out.println("ingrese el año:");
			           	anio = Integer.valueOf(entrada.readLine());
				           if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio% 400 == 0)))
				        	   numDias = 29;
			                else 
			                    numDias = 28;
				           
				    break;
			         
		           case 3: System.out.println("Marzo");
		           numDias = 31;
		           break;
		         
		           case 4: System.out.println("Abril");
		           numDias = 30;
		           break;
		         
		           case 5: System.out.println("Mayo");
		           numDias = 31;
		           break;
		         
		           case 6: System.out.println("Junio");
		           numDias = 30;
		           break;
		         
		           case 7: System.out.println("Julio");
		           numDias = 31;
		           break;
		         
		           case 8: System.out.println("Agosto");
		           numDias = 31;
		           break;
		         
		           case 9: System.out.println("Septiembre");
		           numDias = 30;
		           break;
		         
		           case 10: System.out.println("Octubre");
		           numDias = 31;
		           break;
		         
		           case 11: System.out.println("Noviembre");
		           numDias = 30;
		           break;
		         
		           case 12: System.out.println("Diciembre");
		           numDias = 31;
		           break;
		      
		         }

			System.out.println("Numero de dias del mes:  = "  + numDias);
		
		}
		
		catch(Exception exc){
			
		}
		}
		
}
