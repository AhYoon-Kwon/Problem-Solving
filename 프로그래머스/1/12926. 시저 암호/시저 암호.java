import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) { // 대문자 처리
                result.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) { // 소문자 처리
                result.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else { // 공백 처리
                result.append(c);
            }
        }

        answer = result.toString();
        return answer;
    }

}