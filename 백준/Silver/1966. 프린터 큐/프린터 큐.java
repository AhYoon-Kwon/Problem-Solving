import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class File {
		int no, prior;

		public File(int no, int prior) {
			this.no = no;
			this.prior = prior;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt(); //문서개수
			int M = scan.nextInt(); //궁금한 문서의 현재 위치
			Queue<File> q = new LinkedList<File>();
			
			for (int j = 0; j < N; j++) { //중요도
				int input = scan.nextInt();
				q.add(new File(j, input));
			}
			
			int ans = 1;
			
			
			while(!q.isEmpty()) {
				File curr = q.poll();
				boolean flag = true; //문서의 우선순위가 큰게 있는지 없는지 체크하는 변수
				
				//Iterator: 컬렉션에 저장된 데이터를 접근할때 사용함
				Iterator<File> it = q.iterator();
				
				while(it.hasNext()) { //q가 다음값을 가지고 있으면
					File next = it.next();
					
					if(curr.prior < next.prior) {
						//우선순위가 높은게 있으면 체크하고
						//q 탐색 종료
						flag = false;
						break;
					}
				}
				
				//우선순위가 높은게 있으면 출력안하고 뒤로 보냄
				if(flag == false) {
					q.add(curr);
				}
				//우선순위가 높은게 없으면 출력함
				else {
					//이때, 궁금한 문서의 번호와 출력하려는 현재 문서의 번호가 동일하면 출력
					if(curr.no == M) System.out.println(ans);
					//그 외 문서는 몇번째인지 세자
					else ans++;
				}
			}
		}
		
		scan.close();
	}

}