package main;
import java.util.Scanner;

public class T1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = 1;

		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				d = n / i;
				System.out.println(d);
			}
		}

		sc.close();
	}
}
