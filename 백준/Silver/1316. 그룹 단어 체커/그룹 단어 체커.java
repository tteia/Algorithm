import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++){

            String word = br.readLine();
            Map<Character, Boolean> map = new HashMap<>();
            boolean isGroup = true;
            char prev = 0;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (map.containsKey(c) && prev != c) {
                    // 이미 나온 문자이고, 바로 앞 문자랑 다르면 그룹 단어 아님
                    isGroup = false;
                    break;
                }
                map.put(c, true); // 등장 기록
                prev = c;
            }

            if (isGroup) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        
    }
}
