package Trees;

import java.util.*;

class node{
    int data;
    node left;
    node right;

    public node(int key)
    {
        data = key;
    }
}

public class dfs {

    public static void main(String[] args) {

        ArrayList <Integer>list=new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Stack<node>s1=new Stack<>();
        Stack<node>s2=new Stack<>();




        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);

        a.left = b;
        a.right = c;
        b.left=d;
        b.right=e;
        c.right=f;

                    //     1
                    //    / \
                    //   2   3
                    //  / \   \
                    // 4   5   6
        s1.push(a);

        while(s1.size()!=0)
        {
            node root=s1.pop();
            s2.push(root);

            if(root.left!=null)
            s1.push(root.left);

            if(root.right!=null)
            s1.push(root.right);
        }

        while(!s2.isEmpty())
        list.add(s2.pop().data);


    System.out.println(list);
}
    
}
