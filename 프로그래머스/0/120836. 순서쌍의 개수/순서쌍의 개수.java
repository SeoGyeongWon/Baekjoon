class Solution {
    public int solution(int n) {
        int count =  1;
        for(int i = 1; i<=n/2; i++){
            int a = i;
            if(n%i == 0){
                int b = n/i ;
                count ++;
            }
        }
        return count;
    }
}