import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //과일 개수
		int L = scan.nextInt(); //스네이크버드 초기길이
		int[] fruit = new int[N];
		
		for (int i = 0; i < N; i++) {
			fruit[i] = scan.nextInt();
		}
		Arrays.sort(fruit);
		
		for (int i = 0; i < N; i++) {
			if(fruit[i] <= L) L++;
			else break;
		}
		System.out.println(L);
		
		scan.close();
	}

}