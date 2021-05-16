import java.util.Scanner;

class Solution {
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String ss[] = in.nextLine().split(" ");
        int n = ss.length;
        String resposta = "false";
        
        for(int i=0;i<n;++i)
            for(int j=i+1;j<n;++j)            
                if(ss[i].equals(ss[j]))
                {
                    resposta = "true";
                    break;
                }
            
        System.out.println(resposta);
        in.close();
    }    
}