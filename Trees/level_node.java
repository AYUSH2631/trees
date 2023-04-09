package Trees;
import java.util.*;


public class level_node {

    public static void solve(node root,List<Integer>list,int k,int level)
    {
        if(root==null)
        return;

        if(level==k)
        {
            list.add(root.data);
            return;
        }

        solve(root.left,list,k,level+1);
        solve(root.right,list,k,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>list=new ArrayList<>();

        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        node h = new node(8);
        node i = new node(9);
        node j = new node(10);

        a.left = b;
        a.right = c;
        b.left=d;
        b.right=e;
        c.right=f;
        e.right=g;
        g.left=h;
        d.left=i;
        h.right=j;
        
            //         1
            //        / \
            //       2   3
            //      / \   \
            //     4   5   6
            //    /     \
            //   9       7
            //          /
            //         8
            //          \
            //          10

            System.out.println("enter the level for you which want nodes");
            int k=sc.nextInt();

            node root=a;
            int level=0;

            solve(root,list,k,level);

            System.out.println(list);

            sc.close();


    }

    
}
