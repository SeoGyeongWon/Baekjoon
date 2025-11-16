import java.util.Scanner; 
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int test_case =0 ; test_case<T; test_case++){
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str,",");
            Map<String, Integer> map = new HashMap<>();
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                StringTokenizer key_value = new StringTokenizer(token, ":");
                String key = key_value.nextToken();
                int value = Integer.parseInt(key_value.nextToken());
                map.put(key,value);
            }
            
            String main_condition = sc.nextLine();
            StringTokenizer st2 = new StringTokenizer(main_condition,"|");
            int min = Integer.MAX_VALUE;
            
            while(st2.hasMoreTokens()){
                String sub_condition = st2.nextToken();
                StringTokenizer sub_st = new StringTokenizer(sub_condition,"&");
                int value = 0;
                while(sub_st.hasMoreTokens()){
                    String sub = sub_st.nextToken();
                    if(map.get(sub)>=value){
                        value = map.get(sub);
                    }
                }
                min = Math.min(min,value);
            }
            System.out.println(min);
        }
    }
}