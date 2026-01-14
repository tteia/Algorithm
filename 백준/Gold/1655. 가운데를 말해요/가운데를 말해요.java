import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 중간값 찾기 그런데 수를 입력될 때마다 출력 > 입력될 때마다 넣기

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            if(maxHeap.isEmpty() || num <= maxHeap.peek()){
                maxHeap.offer(num);
            }else{
                minHeap.offer(num);
            }

            if(maxHeap.size() < minHeap.size()){
                maxHeap.offer(minHeap.poll());
            }else if(maxHeap.size() - minHeap.size() > 1){
                minHeap.offer(maxHeap.poll());
            }

            sb.append(maxHeap.peek()).append('\n');
        }

        System.out.print(sb.toString());
    }
}
