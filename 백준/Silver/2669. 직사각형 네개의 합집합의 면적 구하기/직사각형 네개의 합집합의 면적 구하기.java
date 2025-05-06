import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] grid = new boolean[101][101];
        int area = 0;

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (!grid[x][y]) {
                        grid[x][y] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}
