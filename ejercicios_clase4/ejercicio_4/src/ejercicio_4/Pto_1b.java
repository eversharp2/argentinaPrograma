package ejercicio_4;

import java.util.Scanner;

public class Pto_1b {
	public static void main(String[] args) {
		
			
		
		
			Scanner scn = new Scanner(System.in);
		
			System.out.println("Ingrese el primer valor: ");
			int num1 = Integer.parseInt(scn.nextLine());
			System.out.println("Ingrese el segundo valor: ");
			int num2 = Integer.parseInt(scn.nextLine());
			System.out.println("Ingrese el tercero valor: ");
			int num3 = Integer.parseInt(scn.nextLine());
		
			System.out.println("Ingrese como se va a ordenar (a: ascendente y d: descendente");
			char ordenar = scn.nextLine().charAt(0);
			Pto_1a.ordenar(num1, num2, num3, ordenar);
			
		
		
	
	
	}
}
