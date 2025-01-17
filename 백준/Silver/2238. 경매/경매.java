import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int N, U;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        U = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, String> firstBidder = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            String name = line.nextToken();
            int price = Integer.parseInt(line.nextToken());
            if (!firstBidder.containsKey(price)) {
                firstBidder.put(price, name);
            }
            map.put(name, price);
            cnt.put(price, cnt.getOrDefault(price, 0) + 1);
        }
        
        int min = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int price = entry.getKey();
            int count = entry.getValue();
            if(count < min || (count == min && price < answer)){
                min = count;
                answer = price;
            }
        }

        String winner = firstBidder.get(answer);

        bw.write(winner + " " + answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
