import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++) {
            String S = sc.nextLine();
            Stack<Character> stack = new Stack<Character>();
            for(int j = 0; j < S.length(); j++) {
                if(S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                }else {
                    if(stack.empty()) {
                        stack.push(S.charAt(j));
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

