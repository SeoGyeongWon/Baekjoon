import java.util.Arrays;
import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int student = Integer.parseInt(st.nextToken());
        int prize = Integer.parseInt(st.nextToken());
        
        int[] score = new int[student];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<score.length;i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        Arrays.sort(score);
        bw.write(String.valueOf(score[student-prize]));
        bw.flush();
        bw.close();
    }
}