import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int count  =0;
        int num = 666;
        
        int result = 0;
        
        for(int i =666; count<n;i++){
            if(contains666(i)){
                count++;
                result = i;
            }
        }
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
    static boolean contains666(int num){
        while(num>0){
           if(num%1000==666) {
               return true;
           }
            num/=10;
        }
        return false;
    }
}