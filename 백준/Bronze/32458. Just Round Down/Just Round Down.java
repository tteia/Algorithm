import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        StringTokenizer str = new StringTokenizer(line, ".");

        System.out.print(str.nextToken());
    }
}