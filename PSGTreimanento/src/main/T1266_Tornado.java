package main;

import java.util.Scanner;

public class T1266_Tornado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] x = new int[n];
		int poste = 0;
		
		for ( int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		
		for ( int i = 0; i < (x.length - 1); i++) {
			if (x[i] == 0 && x[i + 1] == 0) {
				poste += 1;
				}
		}

		System.out.println(poste);
		
		sc.close();
	}

}
