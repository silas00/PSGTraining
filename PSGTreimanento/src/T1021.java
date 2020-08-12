import java.util.Locale;
import java.util.Scanner;

public class T1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m1, m050, m020, m010, m005, m002, n100 ,n50, n25, n10, n5, n1;
		double N = sc.nextDouble();
		
		m1 = (int) (N/100);
		N -= (m1*100);
		
		m050 = (int) (N/50);
		N -= (m050*50);
		
		m020 = (int) (N/20);
		N -= (m020*20);
		
		m010 = (int) (N/10);
		N -= (m010*10);		
		
		m005 = (int) (N/5);
		N -= (m005*5);
		
		m002 = (int) (N/2);
		N -= (m002*2);
		
		n100 = (int) (N/1);
		N -= (n100*1);
		
		n50 = (int) (N/0.50);
		N -= (n50*0.50);
		
		n25 = (int) (N/0.25);
		N -= (n25*0.25);
		
		n10 = (int) (N/0.10);
		N -= (n10*0.10);
		
		n5 = (int) (N/0.05);
		N -= (n5*0.05);
		
		n1 = (int) (N/0.01);
		N -= (n1*0.01);
		
		System.out.println("NOTAS:");
		System.out.println(m1 + " nota(s) de R$ 100.00");
		System.out.println(m050 + " nota(s) de R$ 50.00");
		System.out.println(m020 + " nota(s) de R$ 20.00");
		System.out.println(m010 + " nota(s) de R$ 10.00");
		System.out.println(m005 + " nota(s) de R$ 5.00");
		System.out.println(m002 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(n100 + " moeda(s) de R$ 1.00");
		System.out.println(n50 + " moeda(s) de R$ 0.50");
		System.out.println(n25 + " moeda(s) de R$ 0.25");
		System.out.println(n10 + " moeda(s) de R$ 0.10");
		System.out.println(n5 + " moeda(s) de R$ 0.05");
		System.out.println(n1 + " moeda(s) de R$ 0.01");
		
		sc.close();
		
	}

}
