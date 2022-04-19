import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	//필요없는 길 지우기 -> union
	//MST의 크루스칼
	
	static int[] p;
	static int N, M;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); //정점
		M = scan.nextInt(); //간선
		int[][] edges = new int[M][3];
		for (int i = 0; i < M; i++) {
			edges[i][0] = scan.nextInt();
			edges[i][1] = scan.nextInt();
			edges[i][2] = scan.nextInt();
		}
		
		//가중치에 따른 edges 배열 오름차순 정렬
		Arrays.sort(edges, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		
		p = new int[N+1];
		for (int i = 0; i < N; i++) {
			makeSet(i);
		}

		int pick = 0;
		long ans = 0;
		int idx = 0;
		for (int i = 0; i < M; i++) {
			
			//parent가 달라 union이 정상적으로 실행되었다면
			if(union(edges[i][0], edges[i][1])) {
				pick++;
				ans += edges[i][2];
			}
			
			//마지막 정점을 고를 필요가 없으므로
			if(pick == (N-1)) {
				idx = i;
				break;
			}
		}
		//2개의 마을로 분리하려면, MST에서 가장 비싼 친구 하나를 없애면 됨
		ans -= edges[idx][2];
		
		System.out.println(ans);
		
		scan.close();
	}
	
	static void makeSet(int x) {
		p[x] = x;
	}
	
	static int findSet(int x) {
		if(p[x] == x) return x;
		return p[x] = findSet(p[x]);
	}
	
	static boolean union(int x, int y) {
		int p1 = findSet(x);
		int p2 = findSet(y);
		
		if(p1 == p2) return false;
		p[p1] = p2;
		return true;
	}

}