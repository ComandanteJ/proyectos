
public class TrianguloInverso {

	public static void main(String[] args) {

		int n = PedirDatos.leerEntero("Introduce n: "),cont=0;
		
		for(int i = 0; i <= n; i++) {
			
			cont++;
			
			for(int j=0; j <= n-cont;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			for(int l = 0; l < cont; l++) {
				
				System.out.print(" ");
				
			}
		}
		
	}

}
