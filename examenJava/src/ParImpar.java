public class ParImpar {

	public static void main(String[] args) {

		int num=0,pares=0,impares=0;
		boolean seguir = true,error=false;
		
		if(args.length == 0) {
			
			System.out.println("No hay argumentos");
			return;
			
		}
		
		while(seguir == true) {
		
			for(int i = 0;i < args.length; i++) {
							
				try {
					
					num = Integer.parseInt(args[i]);
					
				} catch (NumberFormatException e) {

					System.out.println("ERROR: "+args[i]+" no es un numero.");
					error = true;
					
				}
				
				if(error == false) {
					
					if(num%2 == 0) {
						
						pares ++;
						
					}else {
						
						impares ++;
										
					}
					
				}
				
				if(i == (args.length-1)) {
					
					seguir = false;
					
				}
				
				error = false;
			
		}
			
							
		}
		
		System.out.println();
		System.out.println("Total de numeros: "+(pares+impares));
		System.out.println();
		System.out.println("Numeros pares: "+pares);
		System.out.println("Numeros impares: "+impares);
		
	}

}
