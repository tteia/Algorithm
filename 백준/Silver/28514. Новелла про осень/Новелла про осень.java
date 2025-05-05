import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String k = sc.nextLine();
        String s = sc.nextLine();

        Map<Character, Set<Integer>> posMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = k.charAt(i);
            posMap.computeIfAbsent(ch, x -> new HashSet<>()).add(i);
        }

        for (char ch : s.toCharArray()) {
            if (!posMap.containsKey(ch)) {
                System.out.println("NO");
                return;
            }
        }

        char prevChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (prevChar == currChar) {
                continue;
            }

            Set<Integer> prevSet = posMap.get(prevChar);
            Set<Integer> currSet = posMap.get(currChar);
            boolean canMove = false;

            for (int pos : prevSet) {
                int next = (pos + 1) % n;
                if (currSet.contains(next)) {
                    canMove = true;
                    break;
                }
            }

            if (!canMove) {
                System.out.println("NO");
                return;
            }

            prevChar = currChar;
        }

        System.out.println("YES");
    }
}
