import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        long [] arr= new long[n];
      
        for(int i =0; i<arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        br.close();
        
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            bw.write((arr[i])+"\n");            
        }
        bw.flush();
        bw.close();
    }
}