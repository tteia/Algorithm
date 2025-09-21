import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(bf.readLine());

		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		int num = 100000;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			int type = Integer.parseInt(st.nextToken());

			if (type == 1) {
				int temp = Integer.parseInt(st.nextToken());
				queue.add(temp);
				if (queue.size() >= cnt) {
					if (queue.size() == cnt) {
						if (num > temp)
							num = temp;
					} else {
						cnt = queue.size();
						num = temp;
					}
				}
			} else {
				queue.poll();
			}
		}
		bw.write(cnt +" "+num);
		bw.flush();
	}
}
