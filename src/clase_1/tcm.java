package clase_1;
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	public class tcm {
		public static void main(String[] args){
			
			System.out.println ("Eliga la opcion que desea del trabajo (1 o 2) ");
			
			int operacion = seleccionOperacion ();
			
			if (operacion == 1) {
			
				operacion1 ();
			}
			else if (operacion == 2) {
				
				operacion2(); 
			}
			
			else {
				
				System.out.println("Terminado, vuelva a ingresar 1 o 2 si desea realizazarlo nuevamente.");
		
			}
		}
	//primera parte
		
		public static void operacion1 () {
			//ingresa parametros 
			System.out.println("Ingrese los parametros ");
			System.out.println();
			System.out.println("Ingrese el Area del tanque en metros cuadrados: ");
			double areaTanque  = cargarValor();
			System.out.println("Ingrese la altura del tanque en metros: ");
			double alturaTanque = cargarValor();
			System.out.println("Ingrese la entrada del agua en metros cubicos : ");
			double entradaAgua = cargarValor();
			System.out.println("Ingrese la salida del agua en metros cubicos: ");
			double salidaAgua = cargarValor();
			System.out.println("Ingrese la altura inicial: ");
			double altura =  cargarValor();
			System.out.println("Ingrese el tiempo: ");
			double deltaT = cargarValor();
			System.out.println();
			
			llenadoVaciadoTanque( areaTanque, alturaTanque , entradaAgua , salidaAgua , deltaT, altura);
			
		}
		

		public static void llenadoVaciadoTanque (double areaTanque, double alturaTanque , double entradaAgua , double  salidaAgua , double  deltaT, double altura) {
					
		double h = altura;
		int iteraciones = 0;
		boolean medioTanque = false;
		boolean menorCero = false;
					
		while ((h < alturaTanque) && (iteraciones < 100000) && (menorCero == false)) {
							
			if (h < alturaTanque) {
				iteraciones++;
			}
			h = h + (entradaAgua - salidaAgua) * deltaT/ areaTanque;
											
			if (h >= (alturaTanque / 2) && medioTanque == false) {
				medioTanque = true;
				System.out.println("La columna de agua llego al medio en: " + (iteraciones*deltaT) + " segundos \n " + iteraciones + " iteraciones");
			}
							
			if (h < 0) {
				System.out.println("La entrada de agua fue mayor a la salida, tardo en vaciarse: "+ (iteraciones * deltaT) + " segundos \n  en "+ iteraciones + " iteraciones");
				menorCero = true;
			}
							
			if (h >= alturaTanque) {
			System.out.println("El tanque tardo en llenarse "+ (iteraciones * deltaT) + " segundos \n "+ iteraciones + " iteraciones");
							
			}
		}
			
		while (h > 0) {
		h = h - (salidaAgua * deltaT / areaTanque);
						
			if ( h < 0) {
				System.out.println("El tanque tardo en vaciarse: "+ (iteraciones * deltaT) + " segundos\n en "+ iteraciones + " iteraciones");			
			}
				iteraciones++;
			}
			System.out.println("Iteraciones en total: "+ iteraciones);
		  			
		}
		//segunda parte
		  		
		public static void operacion2 () {
			System.out.println("Ingrese los parametros ");
		  	System.out.println();
		  	System.out.println("Ingrese el Area del tanque en metros cuadrados: ");
		  	double areaTanque  = cargarValor();
		  	System.out.println("Ingrese la altura del tanque en metros: ");
		  	double alturaTanque = cargarValor();
		  	System.out.println("Ingrese la entrada del agua en metros cubicos : ");
		  	double entradaAgua = cargarValor();
		  	System.out.println("Ingrese la altura inicial: ");
		 	double altura =  cargarValor();
		  	System.out.println("Ingrese el tiempo: ");
		  	double deltaT = cargarValor();
		  	System.out.println("Ingrese los parametros K, W y G");
		  	System.out.println();
		  	System.out.println("Ingrese K: ");
		  	double K = cargarValor();
		  	System.out.println("Ingrese W: ");
		  	double W = cargarValor();
		  	System.out.println("Ingrese G: ");
		  	double G = cargarValor();
		  	System.out.println();
		  			
		  	llenadoVaciadoTanque (areaTanque, altura, entradaAgua, K, W, G, alturaTanque, deltaT);
			}
		  		
		public static void llenadoVaciadoTanque (double areaTanque, double altura, double entradaAgua, double K, double W, double G, double  alturaTanque, double  deltaT) {
		  			
		int iteraciones = 0;
		double h = altura;
		boolean medioTanque = false;
		double tiempo;
		double S = 0;
		boolean menorCero = false;
		  			
			while ((h < alturaTanque) && (iteraciones < 100000) && (menorCero == false)) {
		  		if (h < alturaTanque) {
		  			iteraciones++;
		  		}
		  					
		  		tiempo = deltaT * iteraciones;
		  		S = (K * tiempo) + (W * (tiempo * tiempo)) + (G/areaTanque * h);
		  		h = h + ((entradaAgua - S) * deltaT/ areaTanque);
		  			if (h >= alturaTanque) {
		  				System.out.println("El tanque tardo en llenarse: "+ (iteraciones * deltaT) + " segundos \n en "+ iteraciones + " iteraciones");
		  			}
		  	
		  			if (h > (alturaTanque / 2 )  && medioTanque == false) {
		  				medioTanque = true;
		  				System.out.println("La columna de agua llego al medio en: " + (iteraciones * deltaT) + " segundos \n  " + iteraciones + " iteraciones");
		  			}
		  				
		  			if (h < 0) {
		  				System.out.println("La entrada de agua fue mayor a la salida y tardo en vaciarse: " + (iteraciones*deltaT) + " segundos \n " + iteraciones + " iteraciones");
		  				menorCero = true;
		  			}
		  				
		  	}
		  		iteraciones++;
		  			
		  			
		  	while ((h > 0) && (h > 0.000000001)) {
		  		tiempo = deltaT * iteraciones;
		  		S = (K * tiempo) + (W * (tiempo * tiempo)) + (G/areaTanque * h);
		  		h = h - (S * deltaT / areaTanque);
		  		
		  		if (h < 0 || h < 0.000000001) {
		  			System.out.println("El tanque tardo en vaciarse : "+ (iteraciones * deltaT) + " segundos \n en "+ iteraciones + " iteraciones");			
		  		}
		  			iteraciones++;
		  		}
		  			System.out.println("Iteraciones en total: "+ iteraciones);
		  	}
		  

		public static double cargarValor () {
			double valor = 0;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		  	try {
				valor =  Double.valueOf(entrada.readLine());
			}
		  		catch(Exception exc) {
		  				System.out.println (exc);
		  		}
		  						
		  		return (valor);
		  					
		  		}
		  		
		public static int seleccionOperacion () {
			 int valor = 0;
			 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			  	try {
			  		valor = Integer.valueOf(entrada.readLine());
		  			}
		  		catch(Exception exc) {
		  				System.out.println (exc);
		  			}
		  		return (valor);
		  		}
		  			
		  	}	
		  
		  		