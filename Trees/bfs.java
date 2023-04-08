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

public class bfs {



    public static void main(String[] args) {

            ArrayList <Integer>list=new ArrayList<>();

            Scanner sc = new Scanner(System.in);

        Queue<node>q= new LinkedList<>();




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

            q.add(a);

       while(q.size()!=0)
       {
            node temp=q.remove();

            if(temp.left!=null)
                q.add(temp.left);

            if(temp.right!=null)
                q.add(temp.right);

            list.add(temp.data);
       }

        System.out.println(list);
    }
}
