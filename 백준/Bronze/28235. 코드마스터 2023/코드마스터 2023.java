import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        switch (line){
            case "SONGDO":
                System.out.print("HIGHSCHOOL");
                break;
            case "CODE":
                System.out.print("MASTER");
                break;
            case "2023":
                System.out.print("0611");
                break;
            case "ALGORITHM":
                System.out.print("CONTEST");
                break;
        }
    }
}