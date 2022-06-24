import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //당첨 가능한 최고 순위와 최저 순위
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int same = 0; //당첨번호와 일치하는 번호의 개수
        int zero = 0; //알 수 없는 번호의 개수
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) same++;
            }
        }

        answer[0] = rank(same+zero);
        answer[1] = rank(same);
        return answer;
    }
    
    public int rank(int same) {
        switch(same) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}