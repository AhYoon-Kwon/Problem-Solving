import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        //board에서 옮길 바구니
        ArrayList<Integer> basket = new ArrayList<Integer>();
        int answer = 0;
        int idx = -1; //basket으로 옮긴 인형의 인덱스
        
        //moves 위치에서 board y좌표확인 후 바구니 옮기기
        for(int i = 0; i < moves.length; i++) {
            int loc = moves[i]-1; 
            int doll = 0;
            
            for(int j = 0; j < board.length; j++) {
                if(board[j][loc] != 0) { //비어있지 않을 때까지
                    doll = board[j][loc];
                    board[j][loc] = 0;
                    break;
                }
            }
            
            if(doll != 0) {
                basket.add(doll);
                idx++;
            }
            
            //터트릴 것이 있는지 체크 (연속하는 같은 숫자가 있는지)
            //방금 추가한 인형의 인덱스 체크
            if(idx >= 1) {
                if(basket.get(idx-1) == basket.get(idx)) {
                    basket.remove(idx);
                    idx--;
                    
                    basket.remove(idx);
                    answer += 2;
                    idx--;
                }
            }
        }
        
        
        return answer;
    }
}