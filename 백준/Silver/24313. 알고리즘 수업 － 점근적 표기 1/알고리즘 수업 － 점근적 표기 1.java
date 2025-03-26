import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int c=  Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        if(c>=a1&&a0<=(c-a1)*n){
            bw.write("1");
        }
        else{bw.write("0");}
        
        bw.flush();
        bw.close();
    }
}
