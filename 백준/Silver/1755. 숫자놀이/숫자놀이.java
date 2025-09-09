import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] lib = {"zero","one", "two","three",
                "four","five","six","seven","eight","nine"};
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        Map<Integer, String> map = new HashMap<>();
        for(int i =m ; i<=n; i++){
            if(i<10){
                map.put(i, lib[i]);
            }
            else{
                int a = i/10;
                int b=  i%10;
                map.put(i,lib[a]+" "+lib[b]);
            }
        }
        List<Map.Entry<Integer,String>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        Map<Integer,String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int count =0;
        for(int key : sortedMap.keySet()){
            System.out.print(key+" ");
            count++;
            if(count% 10 == 0){
                System.out.println();
            }
        }
    }
}