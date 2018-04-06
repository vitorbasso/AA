/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting.sort;
import java.util.Arrays;

/**
 *
 * @author vitor
 */
public class CountingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor [] = {5, 1, 3, 7, 0, 6, 3, 6, 7, 9, 8, 10};
        print(vetor);
        int max = Arrays.stream(vetor).max().getAsInt();
        countingSort(vetor, max);
        print(vetor);
        
    }
    
    public static void print(int vetor[]){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
    public static void countingSort(int vetor[], int max){
        long count[] = new long[max+1];
        for(int i = 0; i < vetor.length; i++){
            count[vetor[i]] ++ ;
        }
        
        for(int j = 0, i = 0; i < vetor.length; j++){
            while(count[j]-- > 0){
                vetor[i ++] = j;
            }
        }
    }
    
}
