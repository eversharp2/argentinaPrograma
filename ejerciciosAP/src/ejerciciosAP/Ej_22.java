package ejerciciosAP;

public class Ej_22 {
	public static void main(String[] args) {
		deco("jqnc", 2, 'd');
	}
	public static void deco(String mensaje, int desplazamiento, char metodo) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		int aux;
		char deco;
		String cadena = "";
		if(metodo == 'd') {
			desplazamiento = desplazamiento - (desplazamiento * 2);
			System.out.println("Se va a decodificar");
			System.out.println("-------------------");
		}
		if(metodo == 'c') {
			
			System.out.println("Se va a codificar");
			System.out.println("-----------------");
		}
		for(int i = 0; i < mensaje.length(); i++) {
			aux = abecedario.indexOf(mensaje.charAt(i));
			aux = aux + desplazamiento;
			deco = abecedario.charAt(aux);
			cadena = cadena + deco;
			aux = 0;
			
		}
		System.out.println(cadena);
	}
}
