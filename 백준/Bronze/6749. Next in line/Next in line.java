import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int y = scan.nextInt();
        int m = scan.nextInt();
        
        System.out.println(m+(m-y));
        
        scan.close();
    }

}
