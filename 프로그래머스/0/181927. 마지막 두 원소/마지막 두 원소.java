class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int lastIndex = num_list.length-1;
        int temp = (num_list[lastIndex-1] < num_list[lastIndex]) ? 
                                        num_list[lastIndex]-num_list[lastIndex-1] : num_list[lastIndex]*2;
        answer[lastIndex+1] = temp;

        return answer;
    }
}