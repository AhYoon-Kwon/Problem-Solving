import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] spl = s.split(",");
		int sum = 0;
		for (int i = 0; i < spl.length; i++) {
			if(spl[i].equals(",")) continue;
			else sum += Integer.parseInt(spl[i]);
		}
		System.out.println(sum);
		
		scan.close();
	}

}