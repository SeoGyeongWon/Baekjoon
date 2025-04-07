import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        long[] arr = new long[n];
        
        for(int i = 0; i < n;i++){
            long a= Long.parseLong(br.readLine());
            
            if(isPrime(a)){
                arr[i] = a;
            }
            else{
                long k = a+1;
                while(!isPrime(k)){
                    k++;
                }
                arr[i] = k;
            }
        }
        br.close();
        
        for(long answer : arr){
            System.out.println(answer);
        }
    }
    
    public static boolean isPrime(long a){
        if(a<2){return false;}
        
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){return false;}
        }
        return true;
    }
}