#include <stdio.h>
#include <stdlib.h>

void bubblesort(int *vetor[]);
void troca(int *vetor[], int i, int j);
void printArray(int vetor[]);

int main()
{

    int vetor[] = {5, 1, 7, 3, 0};
    printArray(vetor);

    bubblesort(&vetor);

    printArray(vetor);

    return 0;
}

void printArray(int vetor[]){

    for(int i = 0; i <= sizeof(vetor); i ++ )
        printf("elemento n%d: %d.\n", i, vetor[i]);

}

void troca(int *vetor[], int i, int j){

    int aux = vetor[i];

    vetor[i] = vetor[j];
    vetor[j] = aux;

}

void bubblesort(int *vetor[]){

    int N = sizeof(vetor);

    for(int iteracao = 0; iteracao <= N; iteracao ++ ){
        for (int i = 0; i <= N; i++){
            if(vetor[i] > vetor[i+1]){
                troca(vetor, i, i+1);
            }
        }
    }

}
