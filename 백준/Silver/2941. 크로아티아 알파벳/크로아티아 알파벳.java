import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int cnt = 0;

        for(int i = 0; i < line.length(); i++){
            switch (line.charAt(i)){
                case 'c':
                    if(i + 1 < line.length() && (line.charAt(i + 1) == '=' || line.charAt(i + 1) == '-')){
                        cnt++;
                        i++; // 다음 문자도 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                case 'd':
                    if(i + 2 < line.length() && line.charAt(i + 1) == 'z' && line.charAt(i + 2) == '='){
                        cnt++;
                        i += 2; // dz= 전체를 건너뛰기
                    } else if(i + 1 < line.length() && line.charAt(i + 1) == '-'){
                        cnt++;
                        i++; // d- 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                case 'l':
                    if(i + 1 < line.length() && line.charAt(i + 1) == 'j'){
                        cnt++;
                        i++; // lj 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                case 'n':
                    if(i + 1 < line.length() && line.charAt(i + 1) == 'j'){
                        cnt++;
                        i++; // nj 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                case 's':
                    if(i + 1 < line.length() && line.charAt(i + 1) == '='){
                        cnt++;
                        i++; // s= 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                case 'z':
                    if(i + 1 < line.length() && line.charAt(i + 1) == '='){
                        cnt++;
                        i++; // z= 건너뛰기
                    } else {
                        cnt++;
                    }
                    break;
                
                default:
                    cnt++;
                    break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}