import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2]; //변환횟수, 제거된0의갯수
        int cnt = 0; // 변환횟수
        int removedZero = 0; // 제거된 0 개수

        while(!s.equals("1")) { //1만 남을때까지 계속 반복 
            //0숫자 세기
            long zero = s.chars().filter(c -> c=='0').count();
            removedZero+=zero;
            
            //0제거하기
            s = s.chars()
                .filter(c -> (c == '1'))
                .mapToObj(c -> "1")
                .collect(Collectors.joining());
            
            //0제거한 문자열의 길이 -> 이진수 변환
            int lenS = s.length();
            s = Integer.toString(lenS, 2);
            cnt++;

        }

        answer[0] = cnt;
        answer[1] = removedZero;
        
        return answer;
    }
}