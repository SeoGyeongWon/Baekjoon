import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        HashSet<Integer> set = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i =0;i<n;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        int m  = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(set.contains(num)?"1":"0").append(" ");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}