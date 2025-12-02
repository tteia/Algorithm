import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] Args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] levels = new int[N];
        
        for(int i = 0; i < N; i++){
            levels[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        
        for(int i = N - 2; i >= 0; i--){
            if(levels[i] >= levels[i + 1]){
                int target = levels[i + 1] - 1;
                cnt += levels[i] - target;
                levels[i] = target;
            }
        }

        System.out.println(cnt);
    }
}
