import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        // String[] answer = new String[strings.length];
        
        String[] answer = Arrays.stream(strings)
                        .sorted(Comparator.comparing((String s) -> s.charAt(n))
                                          .thenComparing(Comparator.naturalOrder()))
                        .toArray(String[]::new);
        
        return answer;
    }
}