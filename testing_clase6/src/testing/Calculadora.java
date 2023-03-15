package testing;

public class Calculadora {
	
	public static double sumar(double numero, double numero2) {
		return numero + numero2;
	}
	
	public static double restar(double numero, double numero2) {
		return numero - numero2;
	}
	
	public static double multiplicar(double numero, double numero2) {
		return numero * numero2;
	}
	
	public static double dividir(double numero, double numero2) {
		if(numero2 == 0) {
			return -1;
		}
		return numero / numero2;
	}

}
