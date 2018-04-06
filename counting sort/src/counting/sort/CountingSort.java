/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        countingSort(vetor, getMaior(vetor));
        print(vetor);
        
    }
    
    public static int getMaior(int vetor[]){
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i < vetor.length; i++){
            list.add(vetor[i]);
        }
        return Collections.max(list);
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
