import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = m; i<=n; i++){
            if(isPrime(i)){
                sum +=i;
                if(i<min){
                    min = i;
                }
            }
        }
        if(sum == 0){System.out.println(-1);}
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        sc.close();
    }
    
    public static boolean isPrime(int num){
        if(num == 1){return false;}
        if(num == 2){return true;}
        if(num%2==0){return false;}
        
        for(int i =3; i<=Math.sqrt(num);i +=2){
            if(num%i==0){return false;}
        }
        return true;
    }
}