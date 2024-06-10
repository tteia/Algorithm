import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] newNums = new int[numbers.length*2];
        int tmp = 0;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                newNums[tmp] = numbers[i]+numbers[j];
                tmp++;
            }
        }
        Arrays.sort(newNums);
        int[] temp = new int[newNums.length];
        int count = 0;
        for(int i = 0; i < newNums.length; i++){
            if(i == 0 || newNums[i] != newNums[i-1]){
                temp[count] = newNums[i];
                count++;
            }
        }
        int[] answer = Arrays.copyOfRange(temp, 0, count);
        return answer;
    }
}