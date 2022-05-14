import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); //사이트 수
		int M = Integer.parseInt(st.nextToken()); //찾으려는 사이트
		
		HashMap<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			hm.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			if(hm.containsKey(temp)) {
				sb.append(hm.get(temp)+"\n");
			}
		}
		System.out.println(sb);
		
		br.close();
	}

}