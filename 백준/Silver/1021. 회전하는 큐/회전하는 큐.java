import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n  =sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1;  i<= n; i++ ){
            dq.add(i);
        }
        
        int count = 0;
        for(int i = 0; i<m; i++){
            int target = sc.nextInt();
            int index = 0;
            for(int num : dq){
                if(num == target){
                    break;
                }
                index ++;
            }
            
            int half = dq.size()/2;
            
            if(index <= half){
                while(dq.peekFirst() != target){
                    dq.addLast(dq.removeFirst());
                    count++;
                }
            }
            else{
                while(dq.peekFirst() != target){
                    dq.addFirst(dq.removeLast());
                    count++;
                }
            }
            dq.removeFirst();
        }
        System.out.println(count);
    }
}