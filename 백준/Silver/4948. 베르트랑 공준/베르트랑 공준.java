import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        while(true){
        
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            
            int count = 0;
            for(int i = n+1;i<=2*n;i++){
                if(isPrime(i)){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isPrime(int a){
        if(a<2){return false;}
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}