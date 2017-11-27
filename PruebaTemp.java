package ejer1;

public class PruebaTemp {

	public static void main(String[] args) {
		
		Temperatura temp = new Temperatura(PedirDatos.leerEntero("Temperatura Minima: "), PedirDatos.leerEntero("Temperatura Maxima: "));
		
		System.out.println(temp.toString());

	}

}
