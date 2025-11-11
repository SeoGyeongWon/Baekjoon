import java.util.Scanner;

class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] arr = new int[N];

    int K =  sc.nextInt();

    for(int i = 0; i < N; i++){
      arr[i] = K;
    }
    int A =  sc.nextInt();
    int B =  sc.nextInt();
    
        
    int index = 0;
        int date = 0;
        
        while(true){
            date += 1;
            for(int range = 0; range<A; range++){
                arr[(index+range)%N] += B;
            }
            boolean die = false;
            for(int i =0; i<N; i++){
                arr[i]--;
                if(arr[i] == 0){
                    die = true;
                    break;
                }
            }
            if(die){break;}
            index = (index+A)%N;
        }
        System.out.println(date);
    }
}