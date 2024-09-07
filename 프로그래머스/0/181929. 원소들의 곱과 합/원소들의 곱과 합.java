class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        
        for(Integer i: num_list) {
            mul *= i;
            sum += i;
        }
        sum = (int)Math.pow(sum, 2);
        // System.out.printf("%d %d\n", mul, sum);
        answer = (mul < sum) ? 1:0;
        return answer;
    }
}