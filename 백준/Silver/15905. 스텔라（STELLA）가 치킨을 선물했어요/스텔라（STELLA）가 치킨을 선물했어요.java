import java.io.*;
import java.util.*;

public class Main {
    static class Student implements Comparable<Student> {
        int solved;
        int penalty;

        Student(int solved, int penalty) {
            this.solved = solved;
            this.penalty = penalty;
        }

        @Override
        public int compareTo(Student o) {
            if (this.solved != o.solved) {
                return o.solved - this.solved;
            } else {
                return this.penalty - o.penalty;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int solved = Integer.parseInt(st.nextToken());
            int penalty = Integer.parseInt(st.nextToken());
            students.add(new Student(solved, penalty));
        }

        Collections.sort(students);

        int rank = 1;
        int prevSolved = students.get(0).solved;
        int prevPenalty = students.get(0).penalty;
        int fifthSolved = 0;
        int fifthRank = 0;

        for (int i = 1; i < N; i++) {
            if (students.get(i).solved != prevSolved || students.get(i).penalty != prevPenalty) {
                rank = i + 1;
                prevSolved = students.get(i).solved;
                prevPenalty = students.get(i).penalty;
            }

            if (rank == 5) {
                fifthSolved = students.get(i).solved;
                fifthRank = i;
                break;
            }
        }

        if (rank < 5) {
            fifthSolved = students.get(rank - 1).solved;
        }

        int count = 0;
        for (int i = fifthRank + 1; i < N; i++) {
            if (students.get(i).solved == fifthSolved) {
                count++;
            }
        }

        System.out.println(count);
    }
}
