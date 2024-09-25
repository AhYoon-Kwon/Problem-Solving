import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        char[] nums = Integer.toString(n).toCharArray();
        
        for(Character c: nums) {
            answer += (c - '0');
        }

        return answer;
    }
}