import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int wavelength = Integer.parseInt(br.readLine());

        if (wavelength >= 620 && wavelength <= 780) {
            bw.write("Red");
        } else if (wavelength >= 590 && wavelength < 620) {
            bw.write("Orange");
        } else if (wavelength >= 570 && wavelength < 590) {
            bw.write("Yellow");
        } else if (wavelength >= 495 && wavelength < 570) {
            bw.write("Green");
        } else if (wavelength >= 450 && wavelength < 495) {
            bw.write("Blue");
        } else if (wavelength >= 425 && wavelength < 450) {
            bw.write("Indigo");
        } else if (wavelength >= 380 && wavelength < 425) {
            bw.write("Violet");
        }

        bw.flush();
        bw.close();
    }
}
