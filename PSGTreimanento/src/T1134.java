import java.util.Scanner;

public class T1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alc = 0;
		int gas = 0;
		int dis = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alc = alc + 1;
			}
			else if (tipo == 2) {
				gas = gas + 1;
			}
			else if (tipo == 3) {
				dis = dis + 1;
			}
			
			tipo = sc.nextInt();
			
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + dis);
		
		sc.close();
		
	}

}
