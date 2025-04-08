import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String temp = st.nextToken();
            
            switch (temp){
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(q.isEmpty()?"-1":q.remove()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty()?"1":"0").append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty()?"-1":q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty()?"-1": q.getLast()).append("\n");
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}