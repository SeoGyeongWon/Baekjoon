import java.util.Stack;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String line;
        
        while(!(line = br.readLine()).equals(".")){
            Stack<Character> stack = new Stack<>();
            
            boolean vps = true;
            
            for(char c : line.toCharArray()){
                if(c=='(' || c == '['){
                    stack.push(c);
                }
                else if(c == ')'){
                    if(stack.isEmpty() || stack.pop() !='('){
                        vps = false;
                        break;
                    }
                }
                else if(c==']'){
                    if(stack.isEmpty() || stack.pop() !='['){
                        vps = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                vps = false;
            }
            sb.append(vps? "yes" : "no").append("\n");
        }
        System.out.print(sb);
    }
}