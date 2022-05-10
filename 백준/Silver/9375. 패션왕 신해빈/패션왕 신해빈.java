import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt(); //의상 수
			
			//뒤의 의상 종류와, 그 개수만 알면 됨			
			HashMap<String, Integer> clothe = new HashMap<String, Integer>();
			for (int j = 0; j < n; j++) {
				scan.next();
				String input = scan.next();
				
				if(!clothe.containsKey(input)) {
					clothe.put(input, 1);
				}
				else {
					//input값인 key값을 찾아서 그 value값을 +1
					clothe.put(input, clothe.get(input)+1);
				}
			}
			
			//key값별로 조합을 구하고 그 모든 조합을 곱한다.
			//다만 1개씩만 고르면 되므로 굳이 조합을 안돌려도 됨
			//전체 개수에, 안고르는 경우의 수를 추가해서 곱하면 된다.
			int ans = 1;
			for (int value : clothe.values()) {
				ans *= (value+1);
			}
			
			System.out.println(ans-1); //알몸 제외
		}
		
		scan.close();
	}

}