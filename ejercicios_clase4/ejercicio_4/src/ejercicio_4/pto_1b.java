package ejercicio_4;

import java.util.Arrays;
import java.util.Scanner;

public class pto_1b {
	public static void main(String[] args) {
		
			
		
		if(args.length  == 0 && args.length < 4) {
			Scanner scn = new Scanner(System.in);
		
			System.out.println("Ingrese el primer valor: ");
			int num1 = Integer.parseInt(scn.nextLine());
			System.out.println("Ingrese el segundo valor: ");
			int num2 = Integer.parseInt(scn.nextLine());
			System.out.println("Ingrese el tercero valor: ");
			int num3 = Integer.parseInt(scn.nextLine());
		
			System.out.println("Ingrese el como se va a ordenar (a: ascendente y d: descendente");
			char ordenar = scn.nextLine().charAt(0);
			ordenar(num1, num2, num3, ordenar);
			
		}else {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			char ordenar = args[3].charAt(0);
			ordenar(num1, num2, num3, ordenar);
			
		}
		
		
	
	
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
