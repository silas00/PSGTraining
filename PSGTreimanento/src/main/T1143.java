package main;
import java.util.Scanner;

public class T1143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = 0;
		int c = 0;

		for (int i = 1; i <= n; i++) {
			
			q = (int) Math.pow(i,2);
			c = (int) Math.pow(i,3);
			
			System.out.print(i + " ");
			System.out.print(q + " ");
			System.out.println(c);

		}

		sc.close();
	}
}
