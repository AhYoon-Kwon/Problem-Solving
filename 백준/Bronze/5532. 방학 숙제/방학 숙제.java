import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double D = scan.nextDouble();
		
		int ans = (int)Math.ceil(Math.max(A/C, B/D));
		System.out.println(L-ans);
		
		scan.close();
	}

}