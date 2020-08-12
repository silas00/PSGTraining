import java.util.Locale;
import java.util.Scanner;
 
public class T1016 {
 
    public static void main(String[] args) {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int xSpeed = 60;
        int ySpeed = 90;
        int time = sc.nextInt();
        
        ySpeed = time * 2;
        
        System.out.println(ySpeed + " " + "minutos");
 
    }
 
}