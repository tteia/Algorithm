class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }

        int len = A.length();

        StringBuilder sb = new StringBuilder(A);
        
        for (int i = 1; i <= len; i++) {
            char lastChar = sb.charAt(len - 1);
            sb.deleteCharAt(len - 1);
            sb.insert(0, lastChar);
            if (sb.toString().equals(B)) {
                return i;
            }
        }
        return -1;
    }
}
