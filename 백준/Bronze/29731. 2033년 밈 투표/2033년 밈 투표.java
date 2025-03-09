import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};
        int N = Integer.parseInt(br.readLine());
        boolean isValid = true;

        while(N-- > 0){
            String str = br.readLine();
            boolean found = false;
            for (String s : strs) {
                if(str.equals(s)){
                    found = true;
                    break;
                }
            }
            if(!found) {
                isValid = false;
                break;
            }
        }

        if(isValid) {
            bw.write("No");
        } else {
            bw.write("Yes");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
