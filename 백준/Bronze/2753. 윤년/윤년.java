import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean flag = false;

        if (year % 4 == 0 && year % 100 != 0)
            flag = true;
        if (year % 400 == 0)
            flag = true;

        System.out.println(flag ? 1 : 0);
        scan.close();
    }
}