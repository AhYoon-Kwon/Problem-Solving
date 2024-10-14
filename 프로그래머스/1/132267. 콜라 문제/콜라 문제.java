class Solution {
    //a가져다주면 b병 줌.. -> n개면 몇병?
    public int solution(int a, int b, int n) {
        int answer = 0;
        int coke = n; //받을수있는 콜라병수 
        int rest = 0; //남은 콜라병
        
        while(n >= 0) {
            if(n/a < 1) break;
            
            coke = (n / a) * b;
            // System.out.println(coke);
            answer += coke;
                        
            rest = n % a;
            n = coke + rest;
            
            // System.out.printf("n(남은콜라): %d, 받은콜라: %d\n", n, answer);
        }
        // answer = coke;
        
        return answer;
    }
}