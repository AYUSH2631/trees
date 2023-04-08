package Trees;

import java.util.*;;

public class height_of_tree {

    private static int max(node root){

        if(root==null)
        return 0;

        int l=max(root.left);
        int r=max(root.right);

        return 1+Math.max(l, r);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        node h = new node(8);

        a.left = b;
        a.right = c;
        b.left=d;
        b.right=e;
        c.right=f;
        e.right=g;
        g.left=h;
        
                //     1
                //    / \
                //   2   3
                //  / \   \
                // 4   5   6
                //      \
                //       7
                //      /
                //     8

                node root=a;

                int height=max(root);

                System.out.println(height);
    
}

}
