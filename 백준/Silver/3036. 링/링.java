import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //링의 개수
		int[] ring = new int[N];
		for (int i = 0; i < N; i++) {
			ring[i] = scan.nextInt();
		}
		int comp = ring[0];
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < N; i++) {
			int r = 0;
			int a = comp;
			int b = ring[i];
			
			while(b != 0) {
				r = a % b;
				a = b;
				b = r;
			}
			sb.append(comp/a + "/" + ring[i]/a + "\n");
		}
		
		System.out.println(sb);
		
		scan.close();
	}

}