class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String check = "";
        for(char c: my_string.toCharArray()) {
            check += c;
            if(check.equals(is_prefix)) answer = 1;
        }
        return answer;
    }
}