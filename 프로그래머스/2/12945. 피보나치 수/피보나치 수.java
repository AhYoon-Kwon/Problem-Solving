class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] mem = new int[n+1];
        mem[0] = 0;
        mem[1] = 1;
        for(int i = 2; i<= n; i++) {
            //if(i >= mem.length) break;
            
            mem[i] = (mem[i-1] + mem[i-2]) % 1234567;
        }
        answer = mem[n]%1234567;
        return answer;
    }
    
//     public static void mem(int n, int[] mem){
//         if(n == mem.length) return;
//         else {
//             dp[n] = dp[n-1] + dp[n-2];
//         }
        
//     }

}