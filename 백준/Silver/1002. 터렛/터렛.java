import java.util.Scanner;

public class Main {
	
	//각 좌표는 원의 중심이 되고, 주어지는 거리에 맞는 반지름을 가진 원을 그린다.
	//두 원은  1.동일한원  2-1.외접 2-2.내접  3.접하지 않음  4. 겹치는경우
	//위 네가지 경우가 있다

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] A = new int[2];
			int[] B = new int[2];
			
			for (int i = 0; i < A.length; i++) {
				A[i] = scan.nextInt();
			}
			int dist_A = scan.nextInt();
			
			for (int i = 0; i < B.length; i++) {
				B[i] = scan.nextInt();
			}
			int dist_B = scan.nextInt();
			
			int dist = (int)(Math.pow(A[0]-B[0], 2) + Math.pow(A[1]-B[1], 2));
			
			//동일한 원
			if((A[0] == B[0]) && (A[1] == B[1]) && (dist_A == dist_B)) 
				System.out.println(-1);
			//바깥에서 접할때
			else if(dist == Math.pow(dist_A+dist_B, 2))
				System.out.println(1);
			//안에서 접할때
			else if(dist == Math.pow(dist_A-dist_B, 2))
				System.out.println(1);
			//바깥으로 아예 만나지 않을때
			else if(dist > Math.pow(dist_A+dist_B, 2))
				System.out.println(0);
			//안쪽으로 아예 만나지 않을때
			else if(dist < Math.pow(dist_A-dist_B, 2))
				System.out.println(0);
			//그외 : 겹침
			else System.out.println(2);

		}
		
		scan.close();
	}

}