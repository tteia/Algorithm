class Solution {
    public int solution(String word) {
        int[] weight = {781, 156, 31, 6, 1};
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        int answer = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = 0;
            
            // A=0, E=1, I=2, O=3, U=4
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == ch) {
                    index = j;
                    break;
                }
            }
            
            answer += index * weight[i] + 1; // +1은 자기 자신
        }
        
        return answer;
    }
}
