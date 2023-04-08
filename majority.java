import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class majority {

    private static void solve(int []arr,List<Integer>list){

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            //if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
        }

       

        for(Integer x:map.keySet())
        {
            if(map.get(x)>=arr.length/2)
            list.add(x);
        }



    
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

       ArrayList<Integer>list=new ArrayList<>();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        solve(arr,list);

        System.out.println(list);

        sc.close();


        }
    
}
