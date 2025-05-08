import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, List<String>> children = new HashMap<>();
        Map<String, Boolean> alive = new HashMap<>();
        children.put("M", new ArrayList<>());
        alive.put("M", true);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line.charAt(0) == '+') {
                String[] parts = line.split(" ");
                String father = parts[1], son = parts[2];
                children.putIfAbsent(father, new ArrayList<>());
                children.get(father).add(son);
                children.put(son, new ArrayList<>());
                alive.put(son, true);
            } else if (line.charAt(0) == '-') {
                String name = line.split(" ")[1];
                alive.put(name, false);
            } else {
                int k = Integer.parseInt(line.split(" ")[1]);
                Queue<String> queue = new LinkedList<>();
                queue.add("M");
                int count = 0;
                String answer = "-";
                while (!queue.isEmpty()) {
                    String u = queue.poll();
                    if (alive.getOrDefault(u, false)) {
                        count++;
                        if (count == k) {
                            answer = u;
                            break;
                        }
                    }
                    for (String v : children.getOrDefault(u, Collections.emptyList())) {
                        queue.add(v);
                    }
                }
                sb.append(answer).append('\n');
            }
        }
        System.out.print(sb);
    }
}
