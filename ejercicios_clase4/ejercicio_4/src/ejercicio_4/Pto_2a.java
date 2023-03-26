package ejercicio_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pto_2a {
	public static void main(String[] args) {
//		
		
		try {
			String temp = null;
			int suma = 0;
			int multiplicacion = 1;
			for(String linea : Files.readAllLines(Paths.get(args[0]))) {
				temp = linea;
			}
			
			String[] lineaAOperar = temp.split(",");
			if(args[1].equals("s")) {
				for (int i = 0; i < lineaAOperar.length; i++) {
					suma = Integer.parseInt(lineaAOperar[i]) + suma;
				}
				System.out.println("La suma de los valores ingresados por archivo es: " + suma);
			}
			
			
			if(args[1].equals("m")) {
				for (int i = 0; i < lineaAOperar.length; i++) {
					
					multiplicacion = Integer.parseInt(lineaAOperar[i]) * multiplicacion;
					
				}
				System.out.println("La multiplicacion de los valores ingresados por archivo es: " + multiplicacion);

			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
