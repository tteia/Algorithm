import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String s = br.readLine();
        for(char c : s.toCharArray()) left.push(c);

        int M = Integer.parseInt(br.readLine());
        while(M-- > 0){
            String line = br.readLine();
            char cmd = line.charAt(0);

            if(cmd == 'L'){
                if(!left.isEmpty()) right.push(left.pop());
            } else if(cmd == 'D'){
                if(!right.isEmpty()) left.push(right.pop());
            } else if(cmd == 'B'){
                if(!left.isEmpty()) left.pop();
            } else {
                left.push(line.charAt(2));
            }
        }

        while(!left.isEmpty()) right.push(left.pop());
        while(!right.isEmpty()) sb.append(right.pop());

        System.out.print(sb.toString());
    }
}
