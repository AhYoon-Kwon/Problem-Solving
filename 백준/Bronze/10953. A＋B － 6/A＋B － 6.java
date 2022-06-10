import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String input = scan.next();
			String[] spl = input.split(",");
			
			int sum = 0;
			for (int i = 0; i < spl.length; i++) {
				sum += Integer.parseInt(spl[i]);
			}
			System.out.println(sum);
		}
		
		scan.close();
	}

}