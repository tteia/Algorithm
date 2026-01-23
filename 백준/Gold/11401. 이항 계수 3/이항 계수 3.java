import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = 1000000007;
        
        long num = factorial(N, P);
        long denom = factorial(N - K, P) * factorial(K, P);
        
        System.out.println((num * div(denom, P - 2, P)) % P);
    }
    
    private static long factorial(int n, int p){
        if(n == 0) return 1;
        if(n == 1) return 1 % p;
        else return ((n % p) * factorial(n - 1, p) % p) % p;
    }

    private static long div(long n, long m, long p){
        if(m == 0) return 1 % p;
        if(m == 1) return n % p;
        else{
            long tmp = div(n, m/2, p);
            if(m % 2 == 1){
                return (((tmp * tmp) % p) * (n % p)) % p;
            } else{
                return (tmp * tmp) % p;
            }
        }
    }

}