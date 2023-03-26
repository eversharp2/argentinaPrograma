package ejercicio_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pto_2 {
	public static void main(String[] args) {

		
		try {
			String temp = null;
			for(String linea : Files.readAllLines(Paths.get(args[0]))) {
				temp = linea;
			}
			
			String[] lineaASumar = temp.split(",");
			int suma = 0;
			for (int i = 0; i < lineaASumar.length; i++) {
				suma = Integer.parseInt(lineaASumar[i]) + suma;
			}

			System.out.println("La suma de los valores ingresados por archivo es: " + suma);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
