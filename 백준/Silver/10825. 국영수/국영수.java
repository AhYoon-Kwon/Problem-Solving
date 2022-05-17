import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		String[][] stu = new String[N][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				stu[i][j] = scan.next();
			}
		}
		
		Arrays.sort(stu, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o2[1].equals(o1[1])) { //국어가 똑같으면 
					
					if(o2[2].equals(o1[2])) { //영어가 똑같으면
						
						if(o2[3].equals(o1[3])) { //수학도 똑같으면
							//이름 사전 순
							return o1[0].compareTo(o2[0]);
						}
						//수학 내림차순
						return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
					}
					//영어 오름차순
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
				}
				//국어 내림차순
				return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(stu[i][0] + "\n");
		}
		System.out.println(sb);
		
		scan.close();
	}

}