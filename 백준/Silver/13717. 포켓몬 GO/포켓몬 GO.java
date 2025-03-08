import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String monster[] = new String[N];
        int KM[][] = new int[N][2];

        for(int i = 0; i < N; i++) {
            monster[i] = br.readLine();
            st = new StringTokenizer(br.readLine());
            KM[i][0] = Integer.parseInt(st.nextToken());
            KM[i][1] = Integer.parseInt(st.nextToken());
        }

        int upgrade = 0;
        int maxCount = Integer.MIN_VALUE;
        String maxMonster = "";

        for(int i = 0; i < N; i++) {
            int candy = KM[i][1];
            int count = 0;

            while(true) {
                if(candy >= KM[i][0]) {
                    candy -= KM[i][0] - 2;
                    upgrade += 1;
                    count += 1;
                }
                else {
                    break;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                maxMonster = monster[i];
            }
        }

        bw.write(upgrade + "\n");
        bw.write(maxMonster + "\n");
        bw.flush();
        bw.close();
    }
}
