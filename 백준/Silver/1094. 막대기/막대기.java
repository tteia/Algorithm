import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int stick = 64, length = 64, answer = 1;
        if(64 % X == 0){
            bw.write("1");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        while (true) {
            stick /= 2;
            length -= stick;
            if(length < X){
                answer ++;
                length += stick;
            }
            else if(length == X)
                break;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}