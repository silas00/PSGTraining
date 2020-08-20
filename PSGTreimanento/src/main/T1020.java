package main;

import java.util.Scanner;

public class T1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int ano = 0, mes = 0, dia = 0;
		
		while(idade >= 30) {
			if (idade >= 365) {
				ano = idade/365;
				idade = idade % 365;			
			} else {
				mes = idade/30;
				idade = idade % 30;
				dia = idade;
			}
		}
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	
		sc.close();
	}

}
