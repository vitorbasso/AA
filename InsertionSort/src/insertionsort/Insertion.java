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
public class Insertion {
    
    void insertionSort(int[] v){
        int n = v.length;
        
        for(int j = 1; j < n; j++){
            int c = v[j];
            int i = j - 1;
            
            while( i >= 0 && v[i] > c){
                v[i+1] = v[i];
                i = i - 1;
            }
            v[i+1] = c;
        }
        
    }
    
    void print(int[] v){
        for(int each : v){
            System.out.println(each);
        }
    }
    
}
