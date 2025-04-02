import java.util.Arrays;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        String[] str = new String[n];
        for(int i =0; i<n; i++){
            str[i] = br.readLine();
        }
        br.close();
        
        Arrays.sort(str,(a,b)->a.length() == b.length()? a.compareTo(b): Integer.compare(a.length(),b.length()));
        
        sb.append(str[0]).append("\n");
        
        for(int i = 1; i<n; i++){
            if(!str[i].equals(str[i-1])){
                sb.append(str[i]).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}