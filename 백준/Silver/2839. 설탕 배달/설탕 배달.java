import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        while(n>=0){
            if(n%5 == 0){
                count += n/5;
                bw.write(String.valueOf(count));
                bw.flush();
                bw.close();
                return;
            }
            n -=3;
            count++;
        }
        bw.write(String.valueOf(-1));
        bw.flush();
        bw.close();
    }
}