class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        //1~numer 까지의 약수 개수 배열..? 필요없고 그냥 반복 돌리면서 answer 더하기
        
        for(int i = 1; i <= number; i++) {
            int cnt = 0; //약수 개수 1포함
            if(i == 1) {
                cnt++;
            }
            
            // int sq = (int)Math.sqrt(i);
            // System.out.println(sq);
            // System.out.printf("i : %d\n", i);
            
            if(i > 1) {
                for(int j = 1; j*j <= i; j++) {
                    if(j*j == i) cnt++;
                    else if(i % j == 0) cnt+=2;
                    
                    // System.out.printf("약수 개수 : %d\n", cnt);
                }


                
            }
            
                if(cnt > limit) answer += power;
                else answer += cnt;
            //     System.out.printf("최종 약수 개수 : %d\n", cnt);
            // System.out.printf("무기 : %d\n", answer);
            //     System.out.println("##");
        }
        
        return answer;
    }
}