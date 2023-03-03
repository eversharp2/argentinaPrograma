package ejerciciosAP;

import java.util.Arrays;

public class Ej_2 {
	public static void main(String[] args) {
		int arreglo[] = new int[] {5, 10, 8, 3, 2};
;		contarLetras("banana", 'n');
		ordenar(8, 1, 3, 'd');
		suma(arreglo, 4);
	}
	
	public static void contarLetras(String cadena, char letra) {
		int j = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == letra) {
				j++;
			}
			
		}
		System.out.println(j);
	}
	
	public static void ordenar(int a, int b, int c, char ordenar) {
		boolean cambios = false;
		int aux;
		int numeros[] = new int[3];

		while(true) {
			cambios = false;
			if(b < a) {
				aux = b;
				b = a;
				a = aux;
				cambios = true;
			}
		
			if(c < b) {
				aux = c;
				c = b;
				b = aux;
				cambios = true;
			}
			
			if(cambios == false) {
				break;
			}
		}
		
		if(ordenar == 'a') {
			numeros[0] = a;
			numeros[1] = b;
			numeros[2] = c;
		}
		
		if(ordenar == 'd') {
			numeros[0] = c;
			numeros[1] = b;
			numeros[2] = a;
		}
		
		System.out.println(Arrays.toString(numeros));
		
	}
		
		
		
	public static void suma(int arreglo[], int numero) {
		int suma = 0;
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] > numero) {
				suma = suma + arreglo[i];
			}
		}
		System.out.println(suma);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int aux;
		boolean cambios = false;
		
			while(true) {
				cambios = false;
				for(int i = 1; i < numeros.length; i++) {
					if(numeros[i] > numeros[i-1]) {
						aux = numeros[i];
						numeros[i] = numeros[i-1];
						numeros[i-1] = aux;
						cambios = true;
						
						
					}
				}
				if(cambios == false) {
					break;
				
				
				}
		
		    
			
			}
			System.out.println(Arrays.toString(numeros));
	}*/
	
}
	

