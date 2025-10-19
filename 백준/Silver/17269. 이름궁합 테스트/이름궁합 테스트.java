import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        Map<Character, Integer> strokes = new HashMap<>();

        // 획수별 알파벳 정확히 등록
        add(strokes, 3, "AFHKM");
        add(strokes, 2, "BDNPQRTXY");
        add(strokes, 1, "CGIJLOSUVWZ");
        add(strokes, 4, "E");

        // 이름 섞기
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(N, M);
        for (int i = 0; i < minLen; i++) {
            sb.append(A.charAt(i)).append(B.charAt(i));
        }
        if (N > M) sb.append(A.substring(M));
        else sb.append(B.substring(N));

        // 숫자 배열로 변환
        int len = sb.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = strokes.get(sb.charAt(i));
        }

        // 반복 계산
        while (len > 2) {
            int[] next = new int[len - 1];
            for (int i = 0; i < len - 1; i++) {
                next[i] = (arr[i] + arr[i + 1]) % 10;
            }
            arr = next;
            len--;
        }

        // 출력
        System.out.println((arr[0] * 10 + arr[1]) + "%");
    }

    private static void add(Map<Character, Integer> map, int strokes, String letters) {
        for (char c : letters.toCharArray()) {
            map.put(c, strokes);
        }
    }
}
