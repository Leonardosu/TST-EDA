import java.util.Scanner;
import java.util.Arrays;

class Solution 
{

    public static int[] mergeSort(int array[])
    {
        int n = array.length;

        System.out.println(Arrays.toString(array));
        if(n == 1) return array;

        int mid = (n+1)/2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for(int i=0;i<mid;++i)
            left[i] = array[i];
        for(int i=mid;i<n;++i)
            right[i-mid] = array[i];

        left = mergeSort(left);
        right = mergeSort(right);

        array = merge(left,right);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] merge(int left[], int right[])
    {
        int a = left.length, b = right.length;
        int arr[] = new int[a + b];

        int i = 0, j = 0;
        while(i < a && j < b)
        {
            if(left[i] > right[j])
                arr[i+j] = right[j++];            
            else
                arr[i+j] = left[i++];            
        }

        while(i<a)        
            arr[i+j] = left[i++];
        
        while(j<b)        
            arr[i+j] = right[j++];

        return arr;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String ss[] = in.nextLine().split(" ");
        int n = ss.length;
        int arr[] = new int [n];

        for(int i=0;i<n;++i)
            arr[i] = Integer.parseInt(ss[i]);
        
        arr = mergeSort(arr);
        in.close();
    }

}
