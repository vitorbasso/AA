/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

/**
 *
 * @author vitor
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {5, 1, 3, 7, 0, 6, 3, 6, 7, 8, 10};
        print(vetor);
        bubblesort(vetor);
        print(vetor);
    }
    
    public static void print(int vetor[]){
        for(int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
    public static void trocar(int vetor[], int i, int j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    
    public static void bubblesort(int vetor[]){
        for(int iteracao = 0; iteracao < vetor.length - 1; iteracao++){
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i+1])
                    trocar(vetor, i, i+1);
            }
        }
    }
    
}
