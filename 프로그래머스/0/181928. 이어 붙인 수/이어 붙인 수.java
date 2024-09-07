class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(Integer i: num_list) {
            if(i % 2 == 0) even += Integer.toString(i);
            else odd += Integer.toString(i);
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}