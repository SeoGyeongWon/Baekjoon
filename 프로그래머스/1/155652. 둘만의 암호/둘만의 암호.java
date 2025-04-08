import java.util.Set;
import java.util.HashSet;
class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        
        for(char c : skip.toCharArray()){
            skipSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            int count = 0;
            char current = ch;
            
            while(count < index){
                current ++;
                
                if(current > 'z'){
                    current = 'a';
                }
                if(!skipSet.contains(current)){
                    count ++;
                }
            }
            sb.append(current);
        }
        return sb.toString();
    }
}