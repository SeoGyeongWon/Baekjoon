import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(n==2){
            System.out.println(arr[0]+arr[1]);
            return;
        }
        dp[0] = arr[0]; //1층
        dp[1] = arr[0]+arr[1]; //2층까지의 합
        dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
        for(int i = 3; i<n; i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
        }
        System.out.println(dp[n-1]);
    }
}