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
        StringBuilder sb= new StringBuilder();
        for(long num : arr){
            sb.append(num).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}