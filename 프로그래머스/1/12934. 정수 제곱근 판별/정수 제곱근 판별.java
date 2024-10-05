class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double flag = Math.sqrt(n);
        if(flag % 1 == 0) {
            answer = (long)Math.pow(flag+1,2);
        }
        // System.out.println(flag);
        return answer;
    }
}