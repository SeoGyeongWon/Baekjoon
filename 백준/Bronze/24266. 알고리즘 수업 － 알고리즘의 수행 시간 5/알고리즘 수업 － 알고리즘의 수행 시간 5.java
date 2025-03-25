import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        Long n = Long.parseLong(r.readLine());
        
        System.out.println(n*n*n);
        System.out.println(3);
    }
}