import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] alph = new int[26];
        
        for(int i = 0; i < S.length(); i++){
            alph[S.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            System.out.print(alph[i] + " ");
        }
    }
}