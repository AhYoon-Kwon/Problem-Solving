import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i) - '0');
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		scan.close();
	}

}