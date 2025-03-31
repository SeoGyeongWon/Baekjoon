import java.util.Arrays;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[5];
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        br.close();
        Arrays.sort(arr);
        
        int avg = sum/5;
        bw.write(avg+"\n"+arr[2]);
        bw.flush();
        bw.close();
    }
}