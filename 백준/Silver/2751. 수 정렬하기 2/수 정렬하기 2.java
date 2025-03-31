import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        boolean [] arr= new boolean[2000001];
      
        int n = Integer.parseInt(br.readLine());
        
        for(int i =0; i<n; i++){
            arr[Integer.parseInt(br.readLine())+1000000] = true;
        }
        br.close();
        
        int index = 0;
        for(boolean b : arr){
            
            if(b){sb.append(index-1000000).append("\n");}
            index++;
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}