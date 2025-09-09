import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] sum = new int[n];
        for(int i =0; i<n; i++){
            sum[i] = sc.nextInt();
        }
        int[] result = new int[n];
        
        int temp = 0;
        for(int i =0 ; i<n; i++){
            if(i % 2 ==0){
                temp += sum[i];
            }
            else{
                temp -= sum[i];
            }
        }
        result[0] = temp/2;
        System.out.println(result[0]);
        for(int i = 1; i<n ; i++){
            result[i] = sum[i-1] - result[i-1];
            System.out.println(result[i]);
        }
    }
}