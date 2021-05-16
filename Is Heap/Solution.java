import java.util.Scanner;

class Solution {

    static class Node
    {
        int val;
        Node left,right;
        public Node(int valor)
        {   this.val = valor; this.left = this.right = null;    }     
        public boolean isLeaf()
        {   return (left == null && right == null); }   
    }

    public static Node createTree(int arr[], int i)
    {
        if(i < arr.length)
        {
            Node root = new Node(arr[i]);
        
            root.left = createTree(arr,2*i + 1);
            root.right = createTree(arr,2*i + 2);
            return root;
        }
        return null;
    }

    public static boolean isMaxHeap(Node root)
    {
        if(root == null || root.isLeaf()) return true;

        boolean valid = true;

        if(root.left != null &&  root.left.val > root.val) return false;
        if(root.right != null &&  root.right.val > root.val) return false;
        valid = isMaxHeap(root.left) & isMaxHeap(root.right);        
        return valid;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String ss[] = in.nextLine().split(" ");
        int n = ss.length;
        int arr[] = new int [n];

        for(int i=0;i<n;++i)
            arr[i] = Integer.parseInt(ss[i]);
        
        Node root = createTree(arr, 0);
        
        System.out.println(isMaxHeap(root));      
        
        in.close();  
    }
}