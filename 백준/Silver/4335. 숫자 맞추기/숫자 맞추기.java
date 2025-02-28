import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            ArrayList<Integer> high = new ArrayList<>();
            ArrayList<Integer> low = new ArrayList<>();
            int right = 0;

            while(true) {
                int num = Integer.parseInt(br.readLine());
                if(num == 0) {  
                    return;
                }
                String isright = br.readLine();

                if(isright.charAt(4) == 'h') {    
                    high.add(num);
                }else if(isright.charAt(4) == 'l') { 
                    low.add(num);
                }else {
                    right = num;
                    break;
                }
            }
            boolean istrue = true;
            for(int i = 0; i < high.size(); i++) { 
                if(right >= high.get(i)) {
                    istrue = false;
                    break;
                }
            }
            if(istrue) {
                for(int i = 0; i < low.size(); i++) {
                    if(right <= low.get(i)) {
                        istrue = false;
                        break;
                    }
                }
            }
            if(istrue) {
                System.out.println("Stan may be honest");
            }else {
                System.out.println("Stan is dishonest");
            }

        }
    }

}