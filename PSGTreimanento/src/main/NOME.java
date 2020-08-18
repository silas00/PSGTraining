package main;

import java.util.Scanner;

public class NOME {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomes1 = sc.nextLine();
		String nomes2 = sc.nextLine();
		String nomes3 = sc.nextLine();
		String maiornome;
		String a;
		String b;
		String tempNome;

		if (nomes1.compareTo(nomes2) > 0) {
			maiornome = nomes1;
			a = nomes2;
		} else {
			maiornome = nomes2;
			a = nomes1;
		}

		if (nomes3.compareTo(maiornome) > 0) {
			b = maiornome;
			maiornome = nomes3;
		} else {
			b = nomes3;
		}

		if (b.compareTo(a) < 0) {
			tempNome = a;
			a = b;
			b = tempNome;
		}

		System.out.println("==========================");
		System.out.println("Nomes por ordem alfabetica: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(maiornome);
		System.out.println("==========================");
	}

}
