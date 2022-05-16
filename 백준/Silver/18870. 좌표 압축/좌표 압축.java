import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //좌표 개수
		
		//<좌표값, 좌표값의 최소 인덱스>
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		//기존 좌표 배열
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = scan.nextInt();
		}
		
		//좌표 배열을 그대로 복제하여 정렬한다.
		int[] copy = nums.clone();
		Arrays.sort(copy);
		
		int rank = 0;
		for (int i = 0; i < N; i++) {
			//정렬한 배열에서 좌표값에 맞는 해시맵이 없으면 rank 부여
			if(hm.get(copy[i]) == null) 
				hm.put(copy[i], rank++);
		}
		
		//기존 좌표 배열값으로 원래 인덱스 값을 얻어온다.
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(hm.get(nums[i]) + " ");
		}
		System.out.println(sb);
		
		scan.close();
	}

}