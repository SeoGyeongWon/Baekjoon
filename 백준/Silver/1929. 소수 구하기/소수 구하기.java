import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        br.close();
        
        for(int i = m; i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
       
    }
    public static boolean isPrime(int a){
        if(a<2){ return false; }
        for(int i =2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}