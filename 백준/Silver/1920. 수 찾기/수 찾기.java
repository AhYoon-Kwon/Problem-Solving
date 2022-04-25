import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] arr;
	static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		//이분탐색은 정렬이 반드시 정렬되어있어야 한다.
		Arrays.sort(arr);
		
		int M = scan.nextInt();
		int[] find = new int[M];
		for (int i = 0; i < M; i++) {
			find[i] = scan.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			if(Arrays.binarySearch(arr, find[i]) >= 0)
				System.out.println(1);
			else System.out.println(0);
		}
		
		scan.close();
	}
}