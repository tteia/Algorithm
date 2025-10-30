class Solution {
    public String solution(String my_string) {
        char ch[] = my_string.toCharArray();
        int first = 0;
        int last = ch.length -1 ;

        while ( first < last ) {

            char swap = ch[first];
            ch[first] = ch[last];
            ch[last] = swap;

            first++;
            last--;
        }
        String answer = new String(ch);

        return answer;
    }
}
