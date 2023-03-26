package ejercicio_4;

import java.util.Scanner;

public class Pto_1c {
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
			Pto_1a.ordenar(num1, num2, num3, ordenar);
			
		}else {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			char ordenar = args[3].charAt(0);
			Pto_1a.ordenar(num1, num2, num3, ordenar);
			
		}
		
		
	
	
	}
}
