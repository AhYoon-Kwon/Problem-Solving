import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		
		for (int i = 0; i < K; i++) {
			int input = scan.nextInt();
			if(input != 0) st.add(input);
			else st.pop();
		}
		
		int ans = 0;
		for (int i = 0; i < st.size(); i++) {
			ans += st.get(i);
		}
		System.out.println(ans);
		
		scan.close();
	}

}