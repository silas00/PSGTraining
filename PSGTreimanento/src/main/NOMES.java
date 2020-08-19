package main;

import java.util.Scanner;

public class NOMES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Parametros do vetor//
		int n = sc.nextInt();
		String tempNome;
		String[] nomes = new String[n];
		
		//Entrada de dados no vetor//
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = sc.next();
		}
		
		//Bubble sort para ordena��o de dados dentro do vetor//
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < (nomes.length - 1); j++) {
				//Swap se verdadeiro para troca de posi��o dentro do vetor//
				if (nomes[j].compareTo(nomes[j + 1]) > 0) {
					tempNome = nomes[j];
					nomes[j] = nomes[j + 1];
					nomes[j + 1] = tempNome;
				}
			}
		}

		//Saida dos dados j� ordenados no vetor//
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}
}
