/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author vitor
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {3,7,5,1,10,6,4,10,56,9,5};
        Insertion insert = new Insertion();
        
        insert.insertionSort(vetor);
        
        insert.print(vetor);
        
    }
    
}
