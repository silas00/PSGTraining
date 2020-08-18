package main;

import java.util.Arrays;
import java.util.Scanner;

public class NOMES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nomes = new String[n];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.next();
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}
}
