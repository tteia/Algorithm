import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 가진 카드 배열로 만들기
        int[] cards = new int[N];
        String nums = br.readLine();
        StringTokenizer tmp = new StringTokenizer(nums);
        int index = 0;
        while (tmp.hasMoreTokens()) {
            cards[index] = Integer.parseInt(tmp.nextToken());
            index++;
        }
        Arrays.sort(cards);

        // 각 숫자에 대한 등장 횟수를 저장할 Map
        Map<Integer, Integer> cardCount = new HashMap<>();
        for (int card : cards) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        // 각 숫자에 대해 등장 횟수 계산
        String finds = br.readLine();
        StringTokenizer hm = new StringTokenizer(finds);
        while (hm.hasMoreTokens()) {
            int num = Integer.parseInt(hm.nextToken());
            int cnt = cardCount.getOrDefault(num, 0);
            bw.write(cnt + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
