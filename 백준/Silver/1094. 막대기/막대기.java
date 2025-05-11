import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x = new Scanner(System.in).nextInt();
        int count =0;
        
        while(x>0){
            if(x%2 ==1){
                count++;
            }
            x/=2;
        }
        System.out.print(count);
    }
}