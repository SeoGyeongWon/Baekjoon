import java.util.Arrays;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num = br.readLine();
        br.close();
        
        char[] chr = new char[num.length()];
        
        for(int i = 0; i<num.length(); i++){
            chr[i] = num.charAt(i);
           
        }
        Arrays.sort(chr);
        for(int i = num.length()-1; i >= 0; i--){
            bw.write(String.valueOf(chr[i]));
        }
        bw.flush();
        bw.close();
    }
}