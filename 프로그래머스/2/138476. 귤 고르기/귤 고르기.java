import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) { //tangerine중 k개를 고르기
        int answer = 0;
        
        // 귤의 크기별 개수를 저장할 맵
        Map<Integer, Integer> map = new HashMap<>(); // (귤크기, 개수)
        
        for(int i: tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1); //크기가 i인 귤의 개수 세주기 default: 0
        }
        // (1,1), (2,2), (3, 2), (4, 1), (5, 2)
        // (2,2), (3, 2), (5, 2), (1,1), (4, 1)
        // 개수가 많은 애를 먼저 넣어야 그 밑에 다른 귤을 넣을 확률 줄기 때문.. 
        
        // 크기별 개수를 list에 저장하고 reverseOrder (많은거순서대로 넣어야 )
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder());
        // 2,2,2,1,1
        
        int pick = 0; //상자에 넣은 귤 개수 
        for(int i : counts) {
            pick += i; //상자에 넣은 귤 개수
            answer++;
            
            if(pick >= k) break;
        }
        
        return answer;
    }
}