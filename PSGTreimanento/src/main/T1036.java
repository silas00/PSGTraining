package main;
import java.util.Locale;
import java.util.Scanner;

public class T1036 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, R1, R2;
		int delta;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a == 0)
			System.out.println("Impossivel calcular");

		else {

			delta = (int) (Math.pow(b, 2.0) - 4 * a * c);

			if (delta < 0)
				System.out.println("Impossivel calcular");

			if (delta == 0) {

				R1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				R2 = (-b - Math.sqrt(delta)) / (2.0 * a);

				System.out.printf("R1 = %.5f%n", R1);
				System.out.printf("R2 = %.5f%n", R2);

			}

			sc.close();
		}
	}

}