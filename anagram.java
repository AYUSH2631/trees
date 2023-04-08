import java.util.HashMap;
import java.util.Scanner;

public class anagram {

    private static boolean solve(String f,String s){

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<f.length();i++)
        {
            char c=f.charAt(i);
            if(map.containsKey(c))
            map.put(c, map.get(c)+1);

            else
            map.put(c, 1);
        }

        
      

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                if(map.get(c)==1)
                map.remove(c);

                else
                map.put(c, map.get(c)-1);
            }
            else
            return false;
        }


        return map.isEmpty();



    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String f=sc.next();
        String s=sc.next();

        boolean r=solve(f,s);

        System.out.println(r);

        sc.close();
    }
    
}
