import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //홀수
		int[] arr = new int[N];
		int[] cnt = new int[8002];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int input = scan.nextInt();
			arr[i] = input;
			sum += arr[i];
			
			cnt[input+4000]++;
		}
		
		//1. 산술 평균: N개 수의 합을 N으로 나눈값
		double avg = sum*1.0 / N;
		System.out.println(Math.round(avg));
		
		//2. 중앙값 : N개 수를 증가하는 순서로 나열했을 때 그 중앙에 있는 값
		Arrays.sort(arr);
		int mid = N / 2;
		System.out.println(arr[mid]);
		
		//3. 최빈값 : N개 수 중 가장 많이 나타난 값
		int max = 0;
		int maxIdx = 0;
		boolean second = false; //여러개의 최빈값일때 두번째인지 체크
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				maxIdx = i - 4000;
				second = true;
			}
			else if(cnt[i] == max && second == true) {
				maxIdx = i - 4000;
				second = false;
			}
		}
		
		System.out.println(maxIdx);
		
		//4. 범위 : 최대값과 최소값의 차이
		System.out.println(arr[N-1]-arr[0]);
		
		scan.close();
	}

}