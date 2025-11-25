import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean a = true;
        for(int i = 0; i < m; i++){
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            for(int j = 0; j < k-1; j++){
                int kn = Integer.parseInt(st.nextToken());
                if(tmp < kn){
                    a=false;
                }
                else{
                    tmp = kn;
                }
            }
            if(a == false){
                break;
            }
        }
        bw.write(a? "Yes":"No");
        bw.flush();
    }
}