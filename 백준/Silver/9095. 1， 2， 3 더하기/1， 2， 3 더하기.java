import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int tc =1; tc<=n; tc++){
            
            int num = sc.nextInt();
            int[] dp = new int[12];
            
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for(int i =4; i<=11; i++){
                dp[i] = dp[i-1]+ dp[i-2]+dp[i-3];
            }
            System.out.println(dp[num]);
        }
    }
}