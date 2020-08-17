package main;
import java.util.Scanner;

public class T1116 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i= 0; i < N; i++) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			
			if (N2 == 0) {
				System.out.println("divisao impossivel");
			} 
			else {
				double resultado = (double) N1/N2;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}
	
}
