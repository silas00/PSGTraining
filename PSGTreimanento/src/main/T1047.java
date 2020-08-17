package main;

import java.util.Scanner;

public class T1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Hi = sc.nextInt();
		int Mi = sc.nextInt();
		int Hf = sc.nextInt();
		int Mf = sc.nextInt();

		if (Hi == Hf && Mi == Mf) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");

		} else if (Mf < Mi) {
			Hf -= 1;
			Mf += 60;
			int x = Hf - Hi;
			int y = Mf - Mi;

			System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", x, y);
		} else if (Hi > Hf) {
			Hf += 24;
			int x = Hf - Hi;
			int y = Mf - Mi;

			System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", x, y);
		} else {
			int x = Hf - Hi;
			int y = Mf - Mi;

			System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)", x, y);
		}

		sc.close();
		
	}

}
