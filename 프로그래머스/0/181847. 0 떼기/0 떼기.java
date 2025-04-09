import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String n_str) {
        
        List<Character> list = new ArrayList<>();
        
        for(int i = 0; i<n_str.length(); i++){
            char c = n_str.charAt(i);
            
            list.add(c);
            
        }
       
        while(!list.isEmpty() && list.get(0) == '0'){
            list.remove(0);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : list){
            sb.append(c);
        }
        return sb.toString();
    }
}