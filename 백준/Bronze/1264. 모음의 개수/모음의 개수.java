import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String input = scan.nextLine();
            if(input.equals("#")) break;

            input = input.toLowerCase(); //모두 소문자로 변경
            int cnt = 0; //모음 개수

            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case 'a': case 'e': case 'i': case 'o': case 'u': cnt++;
                }
            }

            System.out.println(cnt);

        }
        scan.close();
    }
}