class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            //가로<세로 : swap
            if(width < height) {
                int temp = width;
                sizes[i][0] = height;
                sizes[i][1] = temp;
            }
            
            maxX = Math.max(sizes[i][0], maxX);
            maxY = Math.max(sizes[i][1], maxY);
        }
        
        answer = maxX * maxY;
        return answer;
    }
}