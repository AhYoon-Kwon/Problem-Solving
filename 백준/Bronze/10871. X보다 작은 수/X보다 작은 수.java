import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 정수 개수
        int x = scan.nextInt(); // x 보다 작아야 함

        // n개의 정수 받기
        for (int i = 0; i < n; i++) {
            int comp = scan.nextInt(); // x와 비교할 n개의 값들
            if (comp < x)
                System.out.print(comp + " ");
        }

        scan.close();
    }
}