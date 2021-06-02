package arreglos;

import java.util.Random;
public class Clase_7_Ejemplo_ord {
	public static int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrint;                  
		arrint = new int[MAX];                  
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		ordenar_arreglo_seleccion(arrint);
		imprimir_arreglo_int(arrint);
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		ordenar_arreglo_insercion(arrint);
		imprimir_arreglo_int(arrint);
		cargar_arreglo_aleatorio_int(arrint);
		imprimir_arreglo_int(arrint);
		ordenar_arreglo_burbujeo(arrint);
		imprimir_arreglo_int(arrint);
	}
	
	public static void ordenar_arreglo_seleccion(int arr[]) {
		int pos_menor, tmp;
		for (int i = 0; i < MAX; i++) { 
			pos_menor = i; 		
			for (int j = i + 1; j < MAX; j++){ 	
				if (arr[j] < arr[pos_menor]) { 	
					pos_menor = j;
				}
			}
			if (pos_menor != i){
				tmp = arr[i];
				arr[i] = arr[pos_menor];
				arr[pos_menor] = tmp;
			}
		}
	}	

	public static void ordenar_arreglo_insercion(int arr[]) {
		int aux, j;
		for (int i = 1; i < MAX; i++) {  
			aux = arr[i];
			j = i - 1;
			while ((j >= 0) && (arr[j] > aux)){  
				arr[j+1] = arr[j];  
				j--;
			}  
			arr[j+1] = aux;  
		}  
	}	 

	public static void ordenar_arreglo_burbujeo(int[] arr){  
		int temp;  
		for(int i = 1;i < MAX;i++){  
			for (int j = 0 ; j < MAX - 1; j++){  
				if (arr[j] > arr[j+1]){  
					temp = arr[j];  
					arr[j] = arr[j+1];  
					arr[j+1] = temp;  
				}  
			}  
		}  
	} 

	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);  
		}
	}

	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}		
}




