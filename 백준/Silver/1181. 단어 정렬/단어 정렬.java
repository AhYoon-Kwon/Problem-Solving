import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] word = new String[N];
		for (int i = 0; i < N; i++) {
			word[i] = scan.next();
		}
		
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//1. 길이 짧은순
				if(o1.length() != o2.length())
					return o1.length()-o2.length();
				
				//2. 길이가 같으면 사전순
				else 
					return o1.compareTo(o2);
			}
		});
		
		System.out.println(word[0]);
		for (int i = 1; i < N; i++) {
			if(word[i].equals(word[i-1])) continue;				
			System.out.println(word[i]);
		}
		
		scan.close();
	}

}