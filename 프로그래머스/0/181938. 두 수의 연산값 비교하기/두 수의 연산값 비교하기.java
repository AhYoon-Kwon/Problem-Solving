class Solution {
    public int solution(int a, int b) {
        String sum = Integer.toString(a) + Integer.toString(b);
        int sumInt = Integer.parseInt(sum);
        int mul = 2 * a * b;
        int answer = 0;
        if(sumInt >= mul) answer = sumInt;
        else answer = mul;
        
        return answer;
    }
}