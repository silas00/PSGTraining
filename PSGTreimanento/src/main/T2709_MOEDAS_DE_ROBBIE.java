package main;

import java.util.Scanner;

public class T2709_MOEDAS_DE_ROBBIE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados (Quantidade de moedas)//
		int N = sc.nextInt();
		
		//Vari�veis para saida de dados//
		String robbie = "Bad boy! I�ll hit you.";
		String gloria = "You�re a coastal aircraft, Robbie, a large silver aircraft.";
		
		//Vari�vel para contar moedas//
		int contadorMoedas = 0;
		
		//Vari�vel para declarar vencedor//
		String vencedor = "";

		//Vetor para captar valores das moedas//
		int valorMoeda[] = new int[N];
		for (int i = 0; i < valorMoeda.length; i++) {
			valorMoeda[i] = sc.nextInt();
		}

		//Vari�vel para saber o salto das moedas que seram somadas// 
		int salto = sc.nextInt();

		//Estrutura de repeti��o para somar moedas com o par�metro salto//
		for (int i = (valorMoeda.length - 1); i >= 0 ; i -= salto) {
			contadorMoedas += valorMoeda[i];
		}

		//Condi��o para saber se valor de soma de moedas � primo//
		if (contadorMoedas == 1) {
			vencedor = robbie;
		} else {
			for (int i = 2; i <= contadorMoedas; i++) {
				if (((contadorMoedas % i) == 0) && (i != contadorMoedas)) {
					vencedor = robbie;
					break;
				} else {
					vencedor = gloria;
				}
			}
		}
		
		//Imprimi vencedor//
		System.out.println(vencedor);
	}

}
