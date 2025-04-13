import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int n = commands.length;
        int[] answer = new int[n];
        for(int i =0 ; i<n; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] -1;
            
            int[] result = new int[end-start];
        for(int j = start; j<end; j++ ){
         result[j-start] = array[j];
        }
                    Arrays.sort(result);
            answer[i] = result[k];
        }
        return answer;
    }
}