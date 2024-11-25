import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedHashMap<String, Integer> works = new LinkedHashMap<>();
        works.put("Re", 0);
        works.put("Pt", 0);
        works.put("Cc", 0);
        works.put("Ea", 0);
        works.put("Tb", 0);
        works.put("Cm", 0);
        works.put("Ex", 0);

        int total = 0;
        
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer str = new StringTokenizer(line);
            while (str.hasMoreTokens()) {
                String token = str.nextToken();
                total++;
                if (works.containsKey(token)) {
                    works.put(token, works.get(token) + 1);
                }
            }
        }

        // 결과 출력
        for (Map.Entry<String, Integer> entry : works.entrySet()) {
            bw.write(entry.getKey() + " ");
            bw.write(entry.getValue() + " ");
            bw.write(String.format("%.2f", (double) entry.getValue() / total));
            bw.newLine();
        }

        bw.write("Total " + total + " 1.00");
        bw.flush();
        bw.close();
        br.close();
    }
}
