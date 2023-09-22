import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //치킨 총 개수
        String input = scan.nextLine();

        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int ans = 0; //먹는 치킨 개수
        int coke = A/2;
        int beer = B;

        //치킨 1마리 = 콜라2개 || 맥주1개
        //N보단 작아야함
        ans = coke + beer;
        if(ans > N) System.out.println(N);
        else System.out.println(ans);
        
        scan.close();
    }
}