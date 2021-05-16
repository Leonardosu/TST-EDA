import java.util.Scanner;

class Solution {
    
    
    static int find(int v[],int goal,int i)
    {
        if(i >= v.length) return -1;

        if(v[i] == goal) return i;

        return find(v, goal, i+1);
    }   
    

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        String ss[] = in.nextLine().split(" ");
        int goal = in.nextInt();

        int array[] = new int[ss.length];
        for(int i=0;i<ss.length;++i)
            array[i] = Integer.parseInt(ss[i]);
        
        System.out.println(find(array,goal,0));
    }    
}