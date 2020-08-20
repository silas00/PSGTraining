package main;

import java.util.Scanner;

public class T1266_Tornado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n != 0) {
			int[] x = new int[n];
			int poste = 0;

			for (int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
			}

			if (x[0] == 0 && x[n - 2] == 1 && x[n -1] == 0) {
				x[0] = 1;
				poste++;
			}

			for (int i = 0; i < (x.length - 1); i++) {
				if (x[i] == 0 && x[i + 1] == 0) {
					poste++;
					x[i + 1] = 1;
				}
			}

			System.out.println(poste);

			n = sc.nextInt();
		}

		sc.close();
	}

}
