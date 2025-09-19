import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < 2; i++){
            set.add(st.nextToken());
        }
 
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2; i++){
            set.add(st.nextToken());
        }
 
        StringBuilder sb = new StringBuilder();
        for(String body : set){
            for(String tail : set)
                sb.append(body+" "+tail+"\n");
        }
 
        System.out.print(sb);
    }
}