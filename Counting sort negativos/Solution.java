import java.util.Arrays;
import java.util.Scanner;

class Solution 
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String ss[] = in.nextLine().split(" ");        
        int maior = in.nextInt();
        int menor = in.nextInt();

        int n = ss.length, range = maior - menor;

        int arr[] = new int [n];
        int frequencia[] = new int [range+1];
        int prefixo[] = new int[range+1];

        for(int i=0;i<n;++i)
        {
            int valor = Integer.parseInt(ss[i]);
            arr[i] = valor;
            frequencia[valor-menor]++;
            
            System.out.println(Arrays.toString(frequencia));
        }
        

        System.out.print("Cumulativa do vetor de contagem - ");
        prefixo[0] = frequencia[0];
        for(int i=1;i<=range;++i)
                prefixo[i] += prefixo[i-1] + frequencia[i];
       
        System.out.println(Arrays.toString(prefixo));

        for(int i=range;i>0;--i)
            prefixo[i] = prefixo[i-1];
        prefixo[0] = 0;              
        System.out.println(Arrays.toString(prefixo));
        

        int j = 0;
        for(int i=0;i<n;++i)
        {
            while(j <= range && frequencia[j] == 0)
                j++;
            arr[i] = j+menor;
            frequencia[j]--;            
        }
        System.out.println(Arrays.toString(arr));
        in.close();
    }

}
