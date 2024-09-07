class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(Character c: control.toCharArray()) {
            switch(c) {
                case 'w': 
                    answer += 1;
                    break;
                case 's' : 
                    answer -= 1;
                    break;
                case 'd': 
                    answer += 10;
                    break;
                case 'a': 
                    answer -= 10;
                    break;
                default:
                    break;
            }
            // System.out.println(answer);
        }
        return answer;
    }
}