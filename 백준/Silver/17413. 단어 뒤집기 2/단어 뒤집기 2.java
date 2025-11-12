import java.util.Scanner;
import java.util.Stack;
class Main{
    public static void main(String[] args){
        String s = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        int i = 0;
        
        while(i<s.length()){
            if(s.charAt(i) == '<'){
                do{
                    sb.append(s.charAt(i));
                    i++;
                }while(s.charAt(i-1)!='>');
            }
            else if(s.charAt(i)==' '){
                sb.append(s.charAt(i));
                i++;
            }
            else{
                while(i<s.length()&&s.charAt(i) != ' '&&s.charAt(i) != '<'){
                    st.push(s.charAt(i++));
                }
                while(!st.empty()){
                    sb.append(st.pop());
                }
            }
        }
        System.out.println(sb.toString());
    }
}