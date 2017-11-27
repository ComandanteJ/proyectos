
public class MostrarDigitosInverso {

	public static void main(String[] args) {

		char caracter = PedirDatos.leerCaracter("Introduzca caracter separador: ");
		String num = String.valueOf(PedirDatos.leerEntero("Introduce un numero: "));
		
		//No es necesario controlar que sea numero o no, ya que pedirDatos ya lo comprueba.
		
		for(int i = num.length()-1; i >=0 ; i--) {
			
			System.out.print(num.charAt(i));
			
			if(i != 0) {
				
				System.out.print(caracter);
				
			}
			
		}
		
	}

}
