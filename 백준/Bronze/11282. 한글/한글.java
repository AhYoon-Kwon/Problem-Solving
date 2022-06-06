import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 N += 44031;
		 char C = (char) N;
		 System.out.println(C);
		 
		 scan.close();
	}

}