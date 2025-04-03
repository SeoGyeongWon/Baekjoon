import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb= new StringBuilder();
        
        int offSet = 10000000;
        int[] arr = new int[20000001];
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[num+offSet]++;
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(arr[num+offSet]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}