package clase_6;


/*
 * Escribir un programa que llame un metodo que calcule el primedio de la suma de valores enteros entre 1 y 1000.
 * Finalmente, el promedio deve mostrarse por pantalla.
 */
public class promedio {
	public static final int MAX =1000;
	public static final int MIN =1;
	public static void main(String []args){
		int promedio;
		promedio = calcular_pormedio_MIN_MAX();
		System.out.println("El promedio de la suma es : " +promedio);
	}
	public static int calcular_pormedio_MIN_MAX(){
		int promedio;
		int suma = 0;
		for(int numero = MIN; numero <= MAX; numero++){
			suma+=numero;
		}
		 promedio = suma/(MAX -MIN +1);
		return promedio;
	} 

}
