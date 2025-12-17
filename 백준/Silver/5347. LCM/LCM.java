import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      BigInteger a = sc.nextBigInteger();
      BigInteger b = sc.nextBigInteger();
      BigInteger gcd = a.gcd(b); 
      BigInteger lcm = a.multiply(b).divide(gcd);
      System.out.println(lcm);
    }
    
  }
}