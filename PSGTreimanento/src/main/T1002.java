package main;
import java.util.Locale;
import java.util.Scanner;

public class T1002 {
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

		double  area, raio, n = 3.14159;
		
		raio = sc.nextDouble();
		
		area = n * raio * raio;
				
		System.out.printf("A = %.4f%n \n", area);
			
			sc.close();
	}
}