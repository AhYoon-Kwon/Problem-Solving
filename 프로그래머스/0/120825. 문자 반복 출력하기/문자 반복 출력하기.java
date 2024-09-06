class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            int cnt = 0;
            while(true) {
                if(cnt >= n) break;
                answer += my_string.charAt(i);
                cnt++;
            }
        }
        return answer;
    }
}