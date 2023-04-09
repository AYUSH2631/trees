
import java.util.Scanner;


class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        data=key;
    }
}

public class bst {

    private static Node create(Node root,int temp)
    {
        if(root==null)
        {
            root=new Node(temp);
            return root;
        }

        if(temp<root.data)
        {
            root.left=create(root.left, temp);
        }

        else
        root.right=create(root.right, temp);


        return root;


    }

    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Node root=null;


        for(int i=0;i<arr.length;i++)
        {
           int temp=arr[i];
            root= create(root, temp);
        }

       inorder(root);

        
        
    }
    
}
