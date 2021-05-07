package clase_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 //EJERCICIO 4 DE LA SEGUNDA PARTE DEL PRACTICO DE SELECTIVA Y CONDICIONALES

	public class ejercicio_7_clase_4 {
		public static void main (String [] args){
			int num_Dia, numMes, anio;
			boolean num_aureo;
			//int   epacta;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el Día");
			num_Dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el mes (en números)");
			numMes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el año");
			anio = Integer.valueOf(entrada.readLine());
			
			
			num_aureo= ((anio -= 1) % 19 == 0); 
			
	
			System.out.println("numero aureo " + anio );
			
			
			
			
			//parte B
			
			boolean epacta = (((anio -= 1 ) * 11) % 30 ==0);
				//System
			
			
			
		}
		catch(Exception exc){}
		
		}
}
