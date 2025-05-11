import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long x= sc.nextInt();
        long y= sc.nextInt();
        long b = (y*100)/x;
        
        if(b>=99){
            System.out.println(-1);
            return;
        }
        
        long l = 1;
        long r = Integer.MAX_VALUE;
        long answer = -1;
        
        while(l<=r){
            long mid = (r+l)/2;
            long bb = (y+mid)*100/(x+mid);
            
            if(bb>b){
                answer = mid;
                r = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        System.out.println(answer);
    }
}