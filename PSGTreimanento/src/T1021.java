import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class T1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double [] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
		double [] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		int Cnotas, Cmoedas;
		
		double N = sc.nextDouble();
		
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			Cnotas = (int) (N  / notas[i]);
			N = new BigDecimal(N % notas[i]).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf(Cnotas + " nota(s) de R$ %.2f\n", notas[i]);
		}
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			Cmoedas = (int) (N  / moedas[i]);
			N = new BigDecimal(N % moedas[i]).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf(Cmoedas + " moeda(s) de R$ %.2f\n", moedas[i]);
		}
		
		sc.close();

	}

}
