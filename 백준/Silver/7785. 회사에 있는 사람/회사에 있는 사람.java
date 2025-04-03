import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb= new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, Boolean> map = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            boolean attendance = st.nextToken().equals("enter");
            
            if(attendance){
                map.put(name,true);
            }
            else{
                map.put(name,false);
            }
        }
        br.close();
        
        List<String> list = new ArrayList<>();
        
        for(Map.Entry<String,Boolean> entry : map.entrySet()){
            if(entry.getValue()){
                list.add(entry.getKey());
            }
        }
        list.sort((a,b)->b.compareTo(a));
        
        for(String name : list){
            sb.append(name).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}