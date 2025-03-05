import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> b[2] - a[2]);

        int last = 2;
        if (arr[0][0] == arr[1][0]) {
            for (int i = 2; i < n; i++) {
                if (arr[0][0] != arr[i][0]) {
                    last = i;
                    break;
                }
            }
        }

        bw.write(arr[0][0] + " " + arr[0][1] + "\n");
        bw.write(arr[1][0] + " " + arr[1][1] + "\n");
        bw.write(arr[last][0] + " " + arr[last][1] + "\n");

        bw.flush();
        bw.close();
    }
}
