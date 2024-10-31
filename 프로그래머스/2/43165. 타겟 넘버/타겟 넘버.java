class Solution {   
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {

        // 인덱스 따라 쭉 선형으로 가면되니 방문여부 체크는 필요 없음. 
        // idx만 체크하면 됨 
        
        dfs(0, 0, numbers, target);
        
        return answer;
    }
    
    static void dfs(int sum, int index, int[] numbers, int target) {
        //종료 조건
        if(index == numbers.length) {
            if(sum == target) answer++; 
        }
        
        //5개 다 안돌았으면 다음 인덱스로 넘겨서 더하거나 빼기 
        else {
            dfs(sum+numbers[index], index+1, numbers, target);
            dfs(sum-numbers[index], index+1, numbers, target);
        }
        
        
    }
    
}