import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        for (char c : dirs.toCharArray()) {
            int nx = x, ny = y;
            if (c == 'U') ny++;
            else if (c == 'D') ny--;
            else if (c == 'R') nx++;
            else if (c == 'L') nx--;
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;
            String path1 = x + "," + y + ":" + nx + "," + ny;
            String path2 = nx + "," + ny + ":" + x + "," + y;
            set.add(path1);
            set.add(path2);
            x = nx;
            y = ny;
        }
        return set.size() / 2;
    }
}
