# Counting Sort Negativos
Ordene um array de inteiros positivos e negativos utilizando o counting sort.
## Entrada
Seu programa deve ler da entrada três linhas: uma contendo uma sequência de inteiros separados por espaço e outra contendo k (o maior elemento do array) e outra contendo o menor elemento do array.

Considere que esse elemento é sempre negativo.
## Saída
Seu programa deve imprimir o status do vetor de contagem em diversos momentos:

1)Imprimir o conteúdo do array de contagem a cada modificação feita nele durante o cálculo da frequência

2)Imprimir uma frase 'Cumulativa do vetor de contagem - ' seguida do vetor de contagem já tendo armazenado a cumulativa.

3)Imprimir o vetor de contagem ao fim da execução do algoritmo;

4)Imprimir a sequência ordenada.
## Exemplo 1:
    Input :
    3 1 1 6 4 -2 7
    7
    -2    
    Output :
    [0, 0, 0, 0, 0, 1, 0, 0, 0, 0]
    [0, 0, 0, 1, 0, 1, 0, 0, 0, 0]
    [0, 0, 0, 2, 0, 1, 0, 0, 0, 0]
    [0, 0, 0, 2, 0, 1, 0, 0, 1, 0]
    [0, 0, 0, 2, 0, 1, 1, 0, 1, 0]
    [1, 0, 0, 2, 0, 1, 1, 0, 1, 0]
    [1, 0, 0, 2, 0, 1, 1, 0, 1, 1]
    Cumulativa do vetor de contagem - [1, 1, 1, 3, 3, 4, 5, 5, 6, 7]
    [0, 1, 1, 1, 3, 3, 4, 5, 5, 6]
    [-2, 1, 1, 3, 4, 6, 7]
## Exemplo 2:
    Input :
    2 2 -4 9 3 2 1 5
    9
    -4
    Output :
    [0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]
    [0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0]
    [1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0]
    [1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1]
    [1, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1]
    [1, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 1]
    [1, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 1]
    [1, 0, 0, 0, 0, 1, 3, 1, 0, 1, 0, 0, 0, 1]
    Cumulativa do vetor de contagem - [1, 1, 1, 1, 1, 2, 5, 6, 6, 7, 7, 7, 7, 8]
    [0, 1, 1, 1, 1, 1, 2, 5, 6, 6, 7, 7, 7, 7]
    [-4, 1, 2, 2, 2, 3, 5, 9]