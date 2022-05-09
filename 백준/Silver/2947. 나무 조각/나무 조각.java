import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		while(true) {
			if(isSort(num)) break;
			
			for (int i = 0; i < num.length-1; i++) {
				boolean flag = false; //이번 턴에서 위치를 바꿨는지 체크
				
				if(num[i] > num[i+1]) {
					int temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
					flag = true;
				}
				if(flag) print(num);
			}
		}
		
		scan.close();
	}
	
	static boolean isSort(int[] arr) {
		boolean flag = true;
		
		//정렬되어 있지 않으면 false 리턴
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != (i+1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}