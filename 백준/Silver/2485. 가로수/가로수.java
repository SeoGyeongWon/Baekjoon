import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        long[] arr = new long[n];
        
        for(int i = 0 ; i<n; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        br.close();
        
        long[] diff = new long[n-1];
        
        for(int i = 1; i<n;i++){
            diff[i-1] = arr[i]- arr[i-1];
        }
        
        long gcd = diff[0];
        
        for(int i =1;i<diff.length; i++){
            gcd = gcd(gcd,diff[i]);
        }
        
        int total = 0;
        
        for(long count : diff){
            total += count/gcd -1;
        }
        
        System.out.println(total);
        
        
    }
    public static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}