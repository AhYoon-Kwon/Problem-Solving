import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String find = scan.next();
		
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			Character temp = input.charAt(i);
			//숫자 제외하고 list 추가
			if(!Character.isDigit(temp)) list.add(temp);
		}
		
		String comp = "";
		for (int i = 0; i < list.size(); i++) {
			comp += list.get(i);
		}
		
		if(comp.contains(find)) System.out.println(1);
		else System.out.println(0);
		
		scan.close();
	}

}