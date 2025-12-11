import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            map.put(name, state);
        }

        List<String> people = new ArrayList<>();

        for (String name : map.keySet()) {
            if (map.get(name).equals("enter")) {
                people.add(name);
            }
        }

        Collections.sort(people, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : people) {
            sb.append(name).append("\n");
        }

        System.out.print(sb);
    }
}
