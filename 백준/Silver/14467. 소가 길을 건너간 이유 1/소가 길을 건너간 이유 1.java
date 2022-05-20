import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int cnt = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int num = scan.nextInt();
			int move = scan.nextInt();
			
			if(hm.containsKey(num)) { //나온 소를 움직였는지 체크
				if(hm.get(num) != move) cnt++;
			}
			hm.put(num, move); //움직이던 말던 마지막 소의 위치 기록
		}
		System.out.println(cnt);
		
		scan.close();
	}

}