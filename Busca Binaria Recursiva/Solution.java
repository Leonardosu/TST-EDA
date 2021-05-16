import java.util.Scanner;

class Solution {
    
    
    static int find(int v[],int goal,int l, int r)
    {
        int pos = -1;

        int mid = (l + r)/2;
        if(l <= r)
        {
            System.out.println(mid);
            if(v[mid] == goal)
                return pos = mid;

            if(v[mid] < goal)
                pos = find(v,goal,mid + 1,r);
            else
                pos = find(v,goal,l,mid - 1);

            return pos;
        }        
        else //Intervalo invalido, nao foi possivel encontrar tal numero.   
        {
            System.out.println(-1);
            return -1;
        }
    }   
    

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        String ss[] = in.nextLine().split(" ");
        int goal = in.nextInt();

        int array[] = new int[ss.length];
        for(int i=0;i<ss.length;++i)
            array[i] = Integer.parseInt(ss[i]);
        
        find(array,goal,0,ss.length-1);
        in.close();
    }    
}