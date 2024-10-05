class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int idx = 0;
        
        for(String s : seoul) {
            if(s.equals("Kim")) answer += Integer.toString(idx);
            idx++;
        }
        answer += "에 있다";
        return answer;
    }
}