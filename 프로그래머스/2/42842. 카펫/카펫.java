class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // 가로와 세로를 계산
        for (int width = 3; width <= total / 3; width++) {
            if (total % width == 0) {
                int height = total / width;
                
                if (width >= height) {
                    // 갈색과 노란색 격자 수가 맞는지 확인
                    if ((width - 2) * (height - 2) == yellow && (2 * width + 2 * height - 4) == brown) {
                        answer[0] = width;
                        answer[1] = height;
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}
