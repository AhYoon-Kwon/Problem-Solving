import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int mon = nums.length / 2;
        if(set.size() >= mon) answer = mon;
        else answer = set.size();
        
        return answer;
    }
}