class Solution {
    public int solution(int n) {
        int answer = 1; //자기만으로 표현가능한 부분
        
        for(int i = 1; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                if(sum > n) break;
                sum += j;
                
                if(sum == n) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}


// class Solution {
//     static int answer;
//     public int solution(int n) {
//         answer = 0;
        
//         for(int i = 2; i <= n/2; i++) {
//             dp(i, n);
//         }
//         if(n == 3) {
//             answer++;
//         }
//         answer++; //자기자신만 표현하는 경우

//         // if(answer == 0) answer = 1;
        
//         return answer;
//     }
    
//     static void dp(int i, int n) {
//         int[] mem = new int[n+1];
        
//         mem[0] = 0;
//         mem[1] = 1;
        
//         for(int idx = i; idx <= n; idx++) {
//             mem[idx] = mem[idx-1] + idx;
            
//             if(mem[idx] == n) {
//                 // System.out.printf(" ## mem[%d] = %d\n", idx, mem[idx]);
//                 answer++;
//                 break;
//             }
//             if(mem[idx] > n) break;
//         }
       
//         // System.out.println(answer);
//     }
// }