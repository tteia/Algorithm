import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ROT13;

        char[] vowels = {'a', 'i', 'y', 'e', 'o', 'u'};
        char[] vowelsUpper = {'A', 'I', 'Y', 'E', 'O', 'U'};
        char[] consonants = {'b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g', 'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f'};
        char[] consonantsUpper = {'B', 'K', 'X', 'Z', 'N', 'H', 'D', 'C', 'W', 'G', 'P', 'V', 'J', 'Q', 'T', 'S', 'R', 'L', 'M', 'F'};

        while ((ROT13 = br.readLine()) != null) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < ROT13.length(); i++) {
                char current = ROT13.charAt(i);

                // 모음에서 찾기
                if (isInArray(current, vowels)) {
                    int index = (findIndex(current, vowels) + 3) % vowels.length;
                    result.append(vowels[index]);
                } else if (isInArray(current, vowelsUpper)) {
                    int index = (findIndex(current, vowelsUpper) + 3) % vowelsUpper.length;
                    result.append(vowelsUpper[index]);
                }

                // 자음에서 찾기
                else if (isInArray(current, consonants)) {
                    int index = (findIndex(current, consonants) + 10) % consonants.length;
                    result.append(consonants[index]);
                } else if (isInArray(current, consonantsUpper)) {
                    int index = (findIndex(current, consonantsUpper) + 10) % consonantsUpper.length;
                    result.append(consonantsUpper[index]);
                }
                // 문자가 아닌 공백은 그대로 넘겨주기
                else {
                    result.append(current);
                }
            }
            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    // 자음, 모음 중 어떤 배열에 포함된 문자인지 찾기
    public static boolean isInArray(char c, char[] array) {
        for (char element : array) {
            if (element == c) return true;
        }
        return false;
    }

    // 해당 배열에서 문자의 인덱스를 찾는 메서드
    public static int findIndex(char c, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) return i;
        }
        return -1;
    }
}
