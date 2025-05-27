import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        StringTokenizer str = new StringTokenizer(line);
        int N = Integer.parseInt(str.nextToken());
        int S = Integer.parseInt(str.nextToken());
        int P = Integer.parseInt(str.nextToken());

        // 내림차순 정렬을 위해 Integer 배열 활용
        Integer[] list = new Integer[N];

        if(N == 0) System.out.println(1);
        else {
            for(int i = 0; i < N; i++){
                list[i] = sc.nextInt();
            }

            Arrays.sort(list, Collections.reverseOrder());

            int start = 0;
            int end = N - 1;

            while(start <= end){
                int mid = (start + end) / 2;

                if(list[mid] > S) start = mid + 1;
                else end = mid - 1;
            }

            if(N == P && (list[N-1] >= S)) System.out.println("-1");
            else System.out.println(start + 1);

        }


    }
}