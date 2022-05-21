import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String input = scan.next();
			if(map.containsKey(input)) {
				map.put(input, map.get(input)+1);
			} else {
				map.put(input, 1);
			}
		}
		
		int max = 0;
		for (String s : map.keySet()) {
			max = Math.max(max, map.get(s));
		}
		
		//사전순 정렬을 위한 key 리스트
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);
		for (String s : list) {
			//최대값과 value 값이 동일하면 그게 제일 많이 빌린 책
			if(map.get(s) == max) {
				System.out.println(s);
				break;
			}
		}
		
		scan.close();
	}

}