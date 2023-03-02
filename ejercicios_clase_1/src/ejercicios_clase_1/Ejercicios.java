package ejercicios_clase_1;

public class Ejercicios {
public static void main(String[] args) {
		
		
		
		int numeroInicio = 5;
		int numeroFin = 14;
		boolean par = true;
		float ingMensuales = 500000;
		int vehiculos = 2;
		float antiguedad = 6;
		int inmueble = 2;
		boolean embarcacion = false;
		boolean aeronave = false;
		boolean activos = false;
		
		
		
		System.out.println("Ej. 1 a.");
		System.out.println("--------------");
		// Se deberían mostrar los números:
		// 5,6,7,8,9,10,11,12,13,14
		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		System.out.println("--------------");
		System.out.println("Ej. 1 b.");
		System.out.println("--------------");
		
		numeroInicio = 5;
		
		// Se deberían mostrar los números pares del intervalo
		// 6,8,10,12,14
		while (numeroInicio <= numeroFin) {
			if(numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}
			numeroInicio++;
		}
		System.out.println("--------------");
		System.out.println("Ej. 1 c.");
		System.out.println("--------------");
		
		numeroInicio = 5;
		
		while (numeroInicio <= numeroFin) {
			if(par == true) {
				if(numeroInicio % 2 == 0) {
					System.out.println(numeroInicio);
				}
			}else {
				if(numeroInicio % 2 != 0) {
					System.out.println(numeroInicio);
				}
			}
			
			numeroInicio++;
		}
		
		System.out.println("--------------");
		System.out.println("Ej. 1 d.");
		System.out.println("--------------");
		for(int i = 14; i >= 5; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("--------------");
		System.out.println("--------------");
		System.out.println("Ej. 2 d.");
		System.out.println("--------------");
		
		
		if((ingMensuales >= 489083) || (vehiculos >= 3 && antiguedad <= 5) || inmueble >= 3 || (embarcacion == true || aeronave == true || activos == true)) {
			System.out.println("El sujeto pertenece al segmento de ingresos altos");
		}else {
			System.out.println("El sujeto no pertenece al segmento de ingresos altos");
		}
	}	
}
