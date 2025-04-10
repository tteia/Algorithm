import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        switch(line){
            case "NLCS" : System.out.print("North London Collegiate School");
                break;
            case "BHA" : System.out.print("Branksome Hall Asia");
                break;
            case "KIS": System.out.print("Korea International School");
                break;
            case "SJA" : System.out.print("St. Johnsbury Academy");
                break;
        }
    }
}