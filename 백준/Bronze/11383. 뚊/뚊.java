import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		char[][] input = new char[N][M];
		int flag = 0;
		String[] temp = new String[N];
		String[] comp = new String[N];
		for (int i = 0; i < N; i++) {
			temp[i] = scan.next();
			input[i] = temp[i].toCharArray();
			comp[i] = "";
			
			for (int j = 0; j < M; j++) {
				comp[i] += input[i][j];
				comp[i] += input[i][j];
			}
		}
		for (int i = 0; i < N; i++) {
			String x = scan.next();
			if(x.equals(comp[i])) flag++;
			else continue;
			
		}
		if(flag == N) System.out.println("Eyfa");
		else System.out.println("Not Eyfa");
		
		scan.close();
	}

}