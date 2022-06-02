import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 1;
		for (int i = 0; i < N; i++) {
			ans *= 2;
		}
		System.out.println(ans);
		
		scan.close();
	}

}