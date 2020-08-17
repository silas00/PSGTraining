package main;
import java.util.Locale;
import java.util.Scanner;

public class T1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double media = 0;

		for (int i = 0; i < N; i++) {

			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();

			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

			System.out.printf("%.1f", media);
		}

		sc.close();
	}

}
