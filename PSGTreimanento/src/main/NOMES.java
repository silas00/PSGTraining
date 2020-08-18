package main;

import java.util.Arrays;
import java.util.Scanner;

public class NOMES {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[3];

		nomes[0] = sc.nextLine();
		nomes[1] = sc.nextLine();
		nomes[2] = sc.nextLine();
		
		Arrays.sort(nomes);
		
	    for(int i = 0; i < nomes.length; i ++){
	        System.out.println(nomes[i]);

	}

}
}
