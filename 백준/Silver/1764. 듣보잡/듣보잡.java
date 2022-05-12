import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //듣도 못한 사람
		int M = scan.nextInt(); //보도 못한 사람
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < N; i++) {
			set.add(scan.next());
		}
		
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			String comp = scan.next();
			
			//set에 중복되어 있으면 출력
			if(set.contains(comp)) {
				ans.add(comp);
			}
		}
		
		Collections.sort(ans);
		
		System.out.println(ans.size());
		for (String s : ans) {
			System.out.println(s);
		}
		
		scan.close();
	}

}