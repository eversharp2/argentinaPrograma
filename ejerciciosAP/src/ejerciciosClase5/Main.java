package ejerciciosClase5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		Carrito carrito = new Carrito();
		
		//String archivo = "E:\\AP4.0\\argentinaPrograma\\ejerciciosAP\\src\\ejerciciosClase5\\stock.txt";
		String archivo = "..\\src\\ejerciciosClase5\\stock.txt";
		int i = 1;
		try {
			for(String linea : Files.readAllLines(Paths.get(archivo))){
				String[] split = linea.split(",");
				if(i == 1) {
					p1.setNombre(split[1]);
					p1.setPrecio(Float.parseFloat(split[0]));
					p1.setCodigo(split[2]);
					carrito.setProducto1(p1);
					i++;
					
				}else if(i == 2) {
					p2.setNombre(split[1]);
					p2.setPrecio(Float.parseFloat(split[0]));
					p2.setCodigo(split[2]);
					carrito.setProducto2(p2);
					i++;
					
				}else if(i == 3) {
					p3.setNombre(split[1]);
					p3.setPrecio(Float.parseFloat(split[0]));
					p3.setCodigo(split[2]);
					carrito.setProducto3(p3);
					
				}
				System.out.println(Arrays.toString(split));
				
			}
			System.out.println(carrito.costoFinal());
			
			
			
				
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
		}

	}


