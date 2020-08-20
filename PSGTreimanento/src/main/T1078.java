package main;

import java.util.Scanner;

public class T1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int prod = 0;
		
		for ( int i = 1; i <=10; i++) {
			prod = i * N;
			System.out.println (i + " x " + N + " = " + prod);
		}

	}

}
