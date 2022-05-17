import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		List<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B.add(scan.nextInt());
		}
		Arrays.sort(A); //A는 그대로 정렬
		Collections.sort(B); 
		Collections.reverse(B); //B는 정렬하고 거꾸로 뒤집기
		
		
		int S = 0; //최소값
		for (int i = 0; i < N; i++) {
			S += A[i] * B.get(i);
		}
		System.out.println(S);
		
		scan.close();
	}

}