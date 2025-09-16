import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int length = 0;
        int i = 1;

        for(i = 1; length < N; i++){
            length++;

            int tmp = i;
            while(tmp >= 10){
                length++;
                tmp /= 10;
            }
        }

        sb.append(i - 1);
        sb.reverse();
        System.out.println(sb.charAt(length - N));

    }
}