package main;

import java.util.Arrays;
import java.util.Scanner;

public class NOMES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nomes = new int[3];

		nomes[1] = sc.nextInt();
		nomes[2] = sc.nextInt();
		nomes[3] = sc.nextInt();
		
		Arrays.sort(nomes);
		
	    for(int i = 0; i < nomes.length; i ++){
	        System.out.println(nomes[i]);

	}

}
}
