import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String output = "";

        for(int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if(Character.isUpperCase(temp)) output += Character.toLowerCase(temp);
            else output += Character.toUpperCase(temp);
        }

        System.out.println(output);

        scan.close();
    }
}