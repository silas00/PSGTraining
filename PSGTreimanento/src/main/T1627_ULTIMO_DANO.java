package main;

import java.util.Scanner;

public abstract class T1627_ULTIMO_DANO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Parametro para quantidade de teste//
		int t = sc.nextInt();
		int T[] = new int[t];
		
		//Repetição de caso de teste//
		for (int i = 0; i < T.length; i++) {
			
			//Parametros para entrada de dados de Andre e Beto//
			int A1 = sc.nextInt();
			int T1 = sc.nextInt();
			int A2 = sc.nextInt();
			int T2 = sc.nextInt();
			int HP = sc.nextInt();
			String vencedor;
			String p1 = "Andre";
			String p2 = "Beto";

			int time1 = T1;
			int time2 = T2;
			
			//Inicio do jogo aonde ambos atacam//
			HP -= A1;
			vencedor = p1;
			if (HP > 0) {
				HP -= A2;
				vencedor = p2;
			}
			
			//Enquanto a vida do mostro estiver > 0 o jogo continua//
			while (HP > 0) {
				//Sequencia para verificar quem joga//
				if (time1 == time2 && HP > 0) {
					HP -= A1;
					vencedor = p1;
					time1 += T1;
					if (HP > 0) {
						HP -= A2;
						vencedor = p2;
						time2 += T2;
					}
				} else if (time1 < time2 && HP > 0) {
					HP -= A1;
					vencedor = p1;
					time1 += T1;
				} else if (time1 > time2 && HP > 0) {
					HP -= A2;
					vencedor = p2;
					time2 += T2;
				}

			}

			//Impressão do vencedor//
			System.out.println(vencedor);
		}

		sc.close();
	}
}
