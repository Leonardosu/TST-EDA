import java.util.Scanner;

class Solution 
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String ss[] = in.nextLine().split(" ");        
        int maior = in.nextInt();

        int n = ss.length;

        int arr[] = new int [n];
        int frequencia[] = new int [maior+1];
        int prefixo[] = new int[maior+1];

        for(int i=0;i<n;++i)
        {
            int valor = Integer.parseInt(ss[i]);
            arr[i] = valor;
            frequencia[valor]++;
            String saida = "";

            for(int j=0;j<=maior;++j)
                saida += Integer.toString(frequencia[j]) + " ";
            System.out.println(saida.trim());
        }
        
        System.out.print("Cumulativa do vetor de contagem - ");
        String saida = "";
        prefixo[0] = frequencia[0];

        for(int i=0;i<=maior;++i)
        {
            if(i > 0)
                prefixo[i] += prefixo[i-1] + frequencia[i];
            saida += Integer.toString(prefixo[i]) + " ";
        }        
        System.out.println(saida.trim());

        saida = "0 ";
        for(int i=0;i<maior;++i)
            saida += Integer.toString(prefixo[i]) + " ";
              
        System.out.println(saida.trim());
        

        int j = 0;
        saida = "";
        for(int i=0;i<n;++i)
        {
            while(j <= maior && frequencia[j] == 0)
                j++;
            arr[i] = j;
            frequencia[j]--;
            saida += Integer.toString(j) + " ";
        }
        System.out.println(saida.trim());
        in.close();
    }

}
