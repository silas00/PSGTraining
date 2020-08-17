package main;
public class TABUADA {

	public static void main (String[] args) {
		
		// CONJUNTO DE REPETIÇÃO //
		for (int i = 1; i<=10; i++){
			System.out.println();
			System.out.println(" -- TABUADA DE " + i + " -- ");
			System.out.println();
			
			// CONJUNTO DE REPETIÇÃO DO MULTIPLICADOR //
			for (int j = 1; j<=10; j++){
			
				// OPERAÇÃO DE SOMA + PRODUTO //
				System.out.println (i+" x "+ j + " = " + i*j);
			}
		}
	}

}