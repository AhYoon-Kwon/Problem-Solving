import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int res = 0;
        int flag = 0;

        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            res += (num * num);
            flag++;

            if (flag == 5)
                break;
        }

        System.out.println(res % 10);

        scan.close();
    }
}