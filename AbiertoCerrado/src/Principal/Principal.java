package Principal;

import Logica.Bart;
import Logica.Homero;
import Logica.ImprimirPersonaje;

public class Principal {

	public static void main(String[] args) {
		ImprimirPersonaje im = new ImprimirPersonaje();
        im.imprimirDibujo(new Bart("Roja ", "Az�l "));
        System.out.println("\t");
        im.imprimirDibujo(new Homero("Blanca ", "Az�l"));

	}

}
