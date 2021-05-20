import java.util.Scanner;

class Solution {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);        
        int missing = in.nextInt();
        in.nextLine();

        String ss[] = in.nextLine().split(" ");        
        int n = ss.length;
        boolean find = false;

        for(int i=0;i<n;++i)
            if(Integer.parseInt(ss[i]) == missing)
            {
                find = true;
                break;
            }
                    
        System.out.println((find) ? "sim" : "nao");        
        in.close();
    }
}