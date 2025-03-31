import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        
        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        br.close();
        
        for(int i = 1; i<=10000; i++){
            for(int j =0;j<count[i];j++){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}