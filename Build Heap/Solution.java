import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    static class Heap
    {
        private int heap[];
        private int index;

        private static final int INITIAL_SIZE = 20;
        private static final int INCREASING_FACTOR = 10;

        Heap()
        {
            this.heap = new int[INITIAL_SIZE];
            index = -1;
        }

        private int parent(int i) {return (i - 1) / 2;  }

        private int left(int i) {return (i * 2 + 1);    }

        private int right(int i) {return (i * 2 + 1) + 1;   }

        private void heapify(int position) 
        {
            if(!validIndex(position))
                return;

            int maiorIndex = maxIndex(position,left(position),right(position));
            if(maiorIndex != position)
            {
                int aux = this.heap[position];
                this.heap[position] = this.heap[maiorIndex];
                this.heap[maiorIndex] = aux;
                heapify(maiorIndex);
            }
        }

        private boolean validIndex(int position){
            return (position >= 0 && position <= index);}

        private int maxIndex(int id, int left, int right) 
        {
            int position = id;

            if (validIndex(left) && this.heap[left] > (this.heap[position]))        
                position = left;            

            if(validIndex(right) && this.heap[right] > (this.heap[position]))            
                position = right;            

            return position;
        }

    
        public void insert(int element) 
        {
            if(index == heap.length - 1) 
                heap = Arrays.copyOf(heap, heap.length + INCREASING_FACTOR);
            
            index++;
            this.heap[index] = element;
            heapify(index);
        }

        public void buildHeap(int array[])
        {
            this.heap = array;
            this.index = array.length - 1;

            for(int i = parent(this.index); i >= 0; i--)
                heapify(i);
        }

        public int[] toArray() 
        {
            int resp[] = new int[index+1];
            for (int i = 0; i <= this.index; i++) 
                resp[i] = this.heap[i];
            
            return this.heap;
        }

        public boolean isEmpty() {  return (index == -1);   }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Heap myHeap = new Heap();

        String ss[] = in.nextLine().split(" ");
        int array[] = new int[ss.length];

        for(int i=0;i<array.length;++i)
            array[i] = Integer.parseInt(ss[i]);

        myHeap.buildHeap(array);        
        System.out.println(Arrays.toString(myHeap.toArray()));

        in.close();
    }

}
