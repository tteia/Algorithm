import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력이 남아있는지 확인하며 루프를 실행
        while (scanner.hasNextInt()) {
            int r = scanner.nextInt();
            // 두 번째 정수(c)가 있는지 확인
            if (!scanner.hasNextInt()) {
                break; // c가 없으면 루프 탈출 (실제 문제 조건에 따라 0 0으로 처리되지만 안전을 위해)
            }
            int c = scanner.nextInt();
            
            // 종료 조건: 0 0
            if (r == 0 && c == 0) {
                break;
            }
            
            char[][] grid = new char[r][c];
            for (int i = 0; i < r; i++) {
                // 문자열 입력(행 데이터)이 있는지 확인
                if (scanner.hasNext()) {
                    String line = scanner.next();
                    grid[i] = line.toCharArray();
                } else {
                    // 입력 행의 수가 r보다 적은 경우 (잘못된 입력 처리)
                    break; 
                }
            }
            
            int cancerCellCount = 0;
            
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == '#') {
                        boolean isIsolated = true;
                        
                        // 주변 8방향 확인
                        for (int dr = -1; dr <= 1; dr++) {
                            for (int dc = -1; dc <= 1; dc++) {
                                if (dr == 0 && dc == 0) continue; // 자기 자신 제외
                                
                                int nr = i + dr;
                                int nc = j + dc;
                                
                                // 경계 조건 확인
                                if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                                    if (grid[nr][nc] == '#') {
                                        isIsolated = false;
                                        break;
                                    }
                                }
                            }
                            if (!isIsolated) break;
                        }
                        
                        if (isIsolated) {
                            cancerCellCount++;
                        }
                    }
                }
            }
            
            System.out.println(cancerCellCount);
        }
        
        scanner.close();
    }
}