import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            
            int n = sc.nextInt();
            if(n==-1){
                break;
            }
            
            int sum = 0;
            
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i<=n/2; i++){
                if(n%i==0){
                    sum +=i;
                    list.add(i);
                }          
            }
            if(sum==n){
                System.out.print(n+" = ");
                for(int i =0; i < list.size(); i++){
                    if(i == list.size()-1){
                        System.out.print(list.get(i));
                    }
                    else{
                        System.out.print(list.get(i)+" + ");
                    }
                }
                System.out.println();
            }
            else{
                System.out.println(n+" is NOT perfect.");
            }
        }
        sc.close();
    }
}