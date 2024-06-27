class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        int tmp = 0;
        for(int i = 1; i <= n; i++){
            arr[tmp] = i;
            tmp++;
        }
        int start = 0;
        int end = 0;

        int sum = arr[0];
        while (start <= end) {
            if (sum == n) {
                sum -= arr[start];
                start++;
                answer++;
            } else if (sum < n && end < arr.length - 1) {
                end++;
                sum += arr[end];
            } else {
                sum -= arr[start];
                start++;
            }
        }
        return answer;
    }
}