import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("fdsajkl;")) {
            System.out.println("in-out");
        } else if (input.equals("jkl;fdsa")) {
            System.out.println("in-out");
        } else if (input.equals("asdf;lkj")) {
            System.out.println("out-in");
        } else if (input.equals(";lkjasdf")) {
            System.out.println("out-in");
        } else if (input.equals("asdfjkl;")) {
            System.out.println("stairs");
        } else if (input.equals(";lkjfdsa")) {
            System.out.println("reverse");
        } else {
            System.out.println("molu");
        }
    }
}
