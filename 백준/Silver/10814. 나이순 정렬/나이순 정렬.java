import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        List<String[]> list = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age= Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new String[]{String.valueOf(age),name});
        }
        br.close();
        
        list.sort((a,b)->Integer.parseInt(a[0])-Integer.parseInt(b[0]));
        
        for(String[] str : list){
            sb.append(str[0]).append(" ").append(str[1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}