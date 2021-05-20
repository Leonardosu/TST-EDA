import java.util.Arrays;
import java.util.Scanner;


class Solution 
{
    static class MyHashMap
    {    

        static class Word                
        {
            private String word;
            private int frequency;

            Word(String word)
            {
                this.word = word;
                frequency = 0;
            }

            public String getWord()
            {
                return this.word;
            }

            public int getFrequency()
            {
                return this.frequency;
            }

            public void addOne()
            {
                addFrequency(1);
            }

            public void addFrequency(int number)
            {
                this.frequency += number;
            }
            
            public void setWord(String word)
            {
                this.word = word;
            }

            @Override
            public int hashCode()
            {
                int hash = (this.word == null ? 0 : this.word.hashCode());
                return hash;
            }
        }
        
        private Word palavras[];
        private int qtdPalavras;

        MyHashMap(int size)
        {
            this.palavras = new Word[size];   
            this.qtdPalavras = 0;
        }

        private int getProbHash(String element,int prob) 
        {
            return ( Math.abs(element.hashCode()) + prob)% this.palavras.length;
        }
        
        private boolean isFull()
        {
            return qtdPalavras >= palavras.length;
        }

        private boolean isPrime(int number)
        {
            if(number <= 1) return false;
            if(number == 2) return true;

            for(int i=3;i*i <= number; i+=2)            
                if(number%i == 0)
                    return false;
            
            return true;
        }

        private int getNextPrime(int number)
        {
            while(!isPrime(number))
                number++;
            return number;
        }

        
        private void resize(int newSize)
        {
            Word copyArray[] = new Word[this.palavras.length];
            System.out.println("Novo tamanho == " + Integer.toString(newSize));
            for(int i=0;i<this.palavras.length;++i)
                copyArray[i] = this.palavras[i];            

            this.palavras = new Word[newSize];

            for(int i=0;i<copyArray.length;++i)
            {
                int qtd = copyArray[i].getFrequency();
                this.put(copyArray[i].getWord(),qtd);                               
            }
                            
        }


        public void put(String element,int quantidade)
        {
            int probing  = 0;
            
            if(this.contains(element))
            {
                while(probing < this.palavras.length)
                {
                    int hash = getProbHash(element, probing);
                    if(palavras[hash].getWord().equals(element))
                    {
                        this.palavras[hash].addFrequency(quantidade);
                        break;
                    }

                    probing++;
                }
            }
            else
            {
                if(this.isFull())
                {
                    int newSize = getNextPrime(palavras.length);
                    this.resize(newSize);
                }

                while(probing < this.palavras.length)
                {
                    int hash = getProbHash(element, probing);
                    
                    if(palavras[hash] == null)
                    {
                        this.palavras[hash] = new Word(element);
                        this.palavras[hash].addFrequency(quantidade);
                        break;
                    }
                    
                    probing++;
                }

                qtdPalavras++;
            }
            
        }

        public void put(String element)
        {
            this.put(element,1);   
        }

        public int getFrequency(String element)
        {
            int frequency = 0;
            int probing = 0;

            while(probing < this.palavras.length)
            {
                int hash = getProbHash(element, probing);
                if(this.palavras[hash] != null && palavras[hash].getWord().equals(element))
                {
                    frequency = palavras[hash].getFrequency();                    
                    break;
                }                

                probing++;
            }

            return frequency;
        }

        public boolean contains(String element)
        {
            return this.getFrequency(element) == 0 ? false : true;
        }                
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);                

        String palavras[] = in.nextLine().split(" ");
        MyHashMap myMap = new MyHashMap(10);
        for(String palavraAtual : palavras)        
            myMap.put(palavraAtual);        
        
        String word = "";
        while(true)
        {
            word = in.nextLine();
            
            if(word.equals("fim"))
                break;
            else
                System.out.println(myMap.getFrequency(word));                                
        }

        in.close();               
    }

}