import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] clss = new int[n][5];
        for(int i =0; i<n;i++){
            for(int j =0; j<5; j++){
                clss[i][j] = sc.nextInt();
            }
        }
        int maxCnt = -1;
        int result = 0;
        //기준 학생을 stdNum 으로 표현
        for(int stdNum = 0; stdNum < n; stdNum ++){
            int cnt = 0;
            // 비교 대상 학생을 j
            for(int j = 0; j<n; j++){
                if(stdNum == j)continue;
                for(int k =0; k<5; k++){
                    if(clss[stdNum][k] == clss[j][k]){
                        cnt++;
                        break;
                    }
                }                 
            }
            if(cnt > maxCnt){
                maxCnt = cnt;
                result = stdNum +1;
            }            
        }
        System.out.println(result);
    }
}