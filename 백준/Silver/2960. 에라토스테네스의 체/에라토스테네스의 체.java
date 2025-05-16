import java.util.*;

public class Main{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for(int i = 2; i <= N; i++){
            if(queue.contains(i) == true) continue;
            else {
                queue.add(i);
                for(int j = i * 2; j <= N; j += i){
                    if(queue.contains(j) == true) continue;
                    else queue.add(j);
                }
            }
        }
        
        for(int i = 1; i <= N; i++){
            if(i == K) System.out.print(queue.poll());
            else queue.poll();
        }
        
    }
}