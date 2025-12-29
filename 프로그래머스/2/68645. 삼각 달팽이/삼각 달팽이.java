class Solution {
    public int[] solution(int n) {

        // 삼각형 만들기
        int[][] tri = new int[n][];
        for (int i = 0; i < n; i++) {
            tri[i] = new int[i + 1];
        }

        // 방향: 아래, 오른쪽, 왼쪽 위
        int[] dr = {1, 0, -1};
        int[] dc = {0, 1, -1};

        int row = 0, col = 0;
        int dir = 0; // 0: 아래
        int num = 1;
        int max = n * (n + 1) / 2;

        // 숫자 채우기
        while (num <= max) {
            tri[row][col] = num++;

            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];

            // 다음 칸이 있으면 계속
            if (nextRow >= 0 && nextRow < n &&
                nextCol >= 0 && nextCol < tri[nextRow].length &&
                tri[nextRow][nextCol] == 0) {

                row = nextRow;
                col = nextCol;
            }
            // 없으면 방향 변경
            else {
                dir = (dir + 1) % 3;
                row += dr[dir];
                col += dc[dir];
            }
        }

        // 결과 배열 만들기
        int[] answer = new int[max];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tri[i].length; j++) {
                answer[idx++] = tri[i][j];
            }
        }

        return answer;
    }
}
