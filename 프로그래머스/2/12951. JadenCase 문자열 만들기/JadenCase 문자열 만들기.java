class Solution {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());

        boolean check = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = sb.charAt(i);

            if (c == ' ') {
                check = true;
            } else if (check) {
                sb.setCharAt(i, Character.toUpperCase(c));
                check = false;
            }
        }

        return sb.toString();
    }
}