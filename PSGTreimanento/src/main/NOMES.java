package main;

import java.util.Scanner;

public class NOMES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String tempNome;
		String[] nomes = new String[n];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.next();
		}

		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < (nomes.length - 1); j++) {
				if (nomes[j].compareTo(nomes[j + 1]) > 0) {
					tempNome = nomes[j];
					nomes[j] = nomes[j + 1];
					nomes[j + 1] = tempNome;
				}
			}
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}
}
