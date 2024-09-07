class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(Integer i: index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}