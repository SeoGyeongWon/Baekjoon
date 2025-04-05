import java.util.StringTokenizer;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int mother = lcm(b1,b2);
        int son = a1*(mother/b1) + a2*(mother/b2);
        
        int gcd = gcd(son,mother);
        
        son /= gcd;
        mother /= gcd;

        bw.write(son + " " + mother);
        bw.flush();
        bw.close();


    }

    public static int gcd(int a, int b){
        if(b==0){
            return  a;
        }
        return gcd(b,a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(b,a%b);
    }
}