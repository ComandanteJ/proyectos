
public class Adivinanza {

	public static void main(String[] args) {

		double adivinanza = 1,num=0;
		int intentos = 0;
		boolean terminado = false;
		
		
		
		for(int i = 0; i < 9; i++) {
			
			adivinanza = adivinanza + Math.round(Math.random());
			
		}
		
		System.out.println("Numero aleatorio: "+adivinanza);
		System.out.println();
		
		while(terminado == false) {
			
			intentos++;
			num = PedirDatos.leerDouble("Introduce un numero: ");
			
			if(num == adivinanza) {
				
				System.out.println();
				System.out.println("Es correcto.");
				System.out.println("Intentos totales: "+intentos);
				terminado = true;
				
			}else {
				
				System.out.println();
				System.out.println("No es correcto.");
			}
			
		}
		
	}
	
}
