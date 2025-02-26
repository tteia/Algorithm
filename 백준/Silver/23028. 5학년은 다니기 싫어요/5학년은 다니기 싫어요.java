import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int A = Integer.parseInt(firstLine[1]);
        int B = Integer.parseInt(firstLine[2]);

        int[][] courses = new int[10][2];
        for (int i = 0; i < 10; i++) {
            String[] line = br.readLine().split(" ");
            courses[i][0] = Integer.parseInt(line[0]);
            courses[i][1] = Integer.parseInt(line[1]);
        }

        int remainingSemesters = 8 - N;
        int majorCredits = A;
        int totalCredits = B;

        for (int i = 0; i < remainingSemesters; i++) {
            int availableCourses = 6;
            int majorCourses = Math.min(courses[i][0], availableCourses);
            availableCourses -= majorCourses;
            int nonMajorCourses = Math.min(courses[i][1], availableCourses);

            majorCredits += majorCourses * 3;
            totalCredits += (majorCourses + nonMajorCourses) * 3;

            if (majorCredits >= 66 && totalCredits >= 130) {
                bw.write("Nice");
                bw.flush();
                return;
            }
        }
        bw.write("Nae ga wae");
        bw.flush();
    }
}
