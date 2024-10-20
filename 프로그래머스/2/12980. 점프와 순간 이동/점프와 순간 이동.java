import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0; //건전지 사용량 
        int distance = n; //남은 거리 

        // +k -> k만큼의 건전지 사용 
        // 현재까지 거리 *2 -> 건전지 사용 x
        
        while (distance != 0) {
            if(distance % 2 == 0) { //텔레포트
                distance/=2;
            }
            else { //점프
                distance-=1;
                ans += 1;
            }
        }

        return ans;
    }
}