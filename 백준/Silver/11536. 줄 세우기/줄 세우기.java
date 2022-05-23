import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] name = new String[N];
		String[] comp = new String[N];
		for (int i = 0; i < N; i++) {
			comp[i] = name[i] = scan.next();
		}
		Arrays.sort(comp);

		int flag_dec = 0, flag_inc = 0;
		
		for (int i = 0; i < N; i++) {
			if(comp[i].equals(name[i])) flag_inc++;
			if(comp[i].equals(name[N-i-1])) flag_dec++;
		}
		if(flag_inc == N) System.out.println("INCREASING");
		else if(flag_dec == N) System.out.println("DECREASING");
		else System.out.println("NEITHER");
		
		scan.close();
	}

}