package Control;

import Logica.Cuadrado;
import Logica.Rectangulo;

public class Principal {

	public static void main(String[] args) {
		
		Cuadrado cuandrado = new Cuadrado(20);
		System.out.println("El �rea del cuadrado es: "+cuandrado.calcularArea());
		
		Rectangulo rt = new Rectangulo(60, 30);
		System.out.println("EL �rea del rectangulo es: "+rt.calcularArea());
		
		//Con ello podemos extender el calcular �rea a otras clases sin modificar el comportamiento
		

	}

}
