import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if(n>m-n){
                n = m-n;
            }
            long answer =1;
            for(int i = 1; i<=n; i++){
                answer = answer*(m-n+i)/i;
            }
            System.out.println(answer);
        }
    }
}