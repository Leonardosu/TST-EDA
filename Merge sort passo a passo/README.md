# MergeSort passo a passo
Escreva um programa que ordena um array de inteiros utilizando o merge sort.

Seu programa deve imprimir o status a cada etapa do algoritmo.
## Restrições
Seu programa deve, obrigatoriamente, imprimir passo a passo cada etapa do merge sort.
## Entrada
Seu programa irá ler apenas um linha de entrada, que consiste em uma lista de inteiros separados por espaço.
## Saída
Na saída, deve ser impresso o status do array a cada modificação, desde a impressão do array inicial até a array ordenado.
## Dica
Imprima o array com Arrays.toString(array).
## Exemplo 1:
    Input :
    1 2 3 4 6 5
    Output :
    [1, 2, 3, 4, 6, 5]
    [1, 2, 3]
    [1, 2]
    [1]
    [2]
    [1, 2]
    [3]
    [1, 2, 3]
    [4, 6, 5]
    [4, 6]
    [4]
    [6]
    [4, 6]
    [5]
    [4, 5, 6]
    [1, 2, 3, 4, 5, 6]
## Exemplo 2:
    Input :
    7 2 3 1 5
    Output :
    [7, 2, 3, 1, 5]
    [7, 2, 3]
    [7, 2]
    [7]
    [2]
    [2, 7]
    [3]
    [2, 3, 7]
    [1, 5]
    [1]
    [5]
    [1, 5]
    [1, 2, 3, 5, 7]
## Exemplo 3:
    Input :
    38 27 43 3 9 82 10
    Output :
    [38, 27, 43, 3, 9, 82, 10]
    [38, 27, 43, 3]
    [38, 27]
    [38]
    [27]
    [27, 38]
    [43, 3]
    [43]
    [3]
    [3, 43]
    [3, 27, 38, 43]
    [9, 82, 10]
    [9, 82]
    [9]
    [82]
    [9, 82]
    [10]
    [9, 10, 82]
    [3, 9, 10, 27, 38, 43, 82]