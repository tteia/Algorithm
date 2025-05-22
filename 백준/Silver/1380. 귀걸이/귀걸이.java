import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int scenario = 0;
        while((n = Integer.parseInt(br.readLine())) != 0){
            Map<Integer, String> names = new HashMap<>();
            Set<Integer> list = new HashSet<>();

            scenario ++;
            
            for(int i = 0; i < n; i++){
                String name = br.readLine();
                names.put(i + 1, name);
            }

            for(int i = 0; i < (2 * n) - 1; i++){
                String line = br.readLine();
                StringTokenizer str = new StringTokenizer(line);
                // 여학생 번호는 최대 두 번이니까 A, B 를 저장해놓을 필요는 없다.
                int num = Integer.parseInt(str.nextToken());
                if(list.contains(num)) list.remove(num);
                else list.add(num);
            }

            int answer = list.iterator().next();
            String name = String.valueOf(names.get(answer));
            StringBuilder sb = new StringBuilder();
            sb.append(scenario).append(" ").append(name);
            System.out.println(sb);
        }
    }
}