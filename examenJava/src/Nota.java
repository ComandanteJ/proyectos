
public class Nota {

	public static void main(String[] args) {

		boolean correcto = false;
		double nota = 0;
		
		while(correcto == false) {
			
			nota = PedirDatos.leerDouble("Introduzca nota del examen: ");
			
			if(nota <=10) {
				
				correcto = true;
				
			}
			
			if(nota > 10) {
				
				System.out.println("La nota no puede ser superior a 10, introduce otra.");
				
			}
			
		}
		
		
		
		if(nota < 5) {
			
			System.out.println("El examen esta suspenso.");
			
		}
		
		if(nota >= 5 & nota <7) {
			
			System.out.println("El examen esta aprobado.");
			
		}
		
		if(nota >= 7 & nota <9) {
			
			System.out.println("El examen esta Notable.");
			
		}
		
		if(nota >= 9 & nota < 10) {
			
			System.out.println("El examen esta sobresaliente.");
			
		}
		
		if(nota == 10) {
			
			System.out.println("El examen esta perfecto, Madricula de honor.");
			
		}
		
	}

}
