import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //포켓몬 개수
		int M = scan.nextInt(); //맞추는 문제 개수
		
		HashMap<Integer, String> find_str = new HashMap<Integer, String>();
		HashMap<String, Integer> find_num = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String input = scan.next();
			find_str.put(i+1, input);  //1번~
			find_num.put(input, i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String input = scan.next();
			char[] find = input.toCharArray();
			
			if(Character.isDigit(find[0])) {
				sb.append(find_str.get(Integer.parseInt(input)) + "\n");
			}
			else {
				sb.append(find_num.get(input) + "\n");
			}
		}
		System.out.println(sb);
		
		scan.close();
	}

}