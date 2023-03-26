package ejercicio_4;

import java.util.Arrays;

public class Pto_1a {
	public static void main(String[] args) {
		
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		char ordenar = args[3].charAt(0);
		
		ordenar(num1, num2, num3, ordenar);
		
	
	
	
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
		
		
}
	

