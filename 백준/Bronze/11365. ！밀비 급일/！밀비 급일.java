import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			String input = scan.nextLine();
			if(input.equals("END")) break;
			
			ArrayList<Character> list = new ArrayList<Character>();
			for (int i = 0; i < input.length(); i++) {
				list.add(input.charAt(i));
			}
			Collections.reverse(list);
			
			String ans = "";
			for (int i = 0; i < list.size(); i++) {
				ans += list.get(i);
			}
			System.out.println(ans);
		}
		
		scan.close();
	}

}