import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(arr,(a,b)->a[0]== b[0] ? Integer.compare(a[1],b[1]): Integer.compare(a[0],b[0]));
        StringBuilder sb= new StringBuilder();
        for(int[] a : arr){
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}