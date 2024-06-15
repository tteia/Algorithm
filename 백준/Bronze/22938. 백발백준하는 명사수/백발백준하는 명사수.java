import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x1 = sc.nextBigInteger();
        BigInteger y1 = sc.nextBigInteger();
        BigInteger r1 = sc.nextBigInteger();
        BigInteger x2 = sc.nextBigInteger();
        BigInteger y2 = sc.nextBigInteger();
        BigInteger r2 = sc.nextBigInteger();

        BigInteger round1 = x1.subtract(x2);
        round1 = round1.multiply(round1);
        BigInteger round2 = y1.subtract(y2);
        round2 = round2.multiply(round2);
        BigInteger forCompare = round1.add(round2);

        BigInteger radius = r1.add(r2);
        radius = radius.multiply(radius);

        int answer = radius.compareTo(forCompare);
        if(answer > 0){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
