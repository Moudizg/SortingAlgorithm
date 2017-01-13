/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

import java.util.Random;

/**
 *
 * @author Mouhammad
 */
public class SortingAlgorithm extends csv{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0, n=2; //n=2 being where the array starts.
        MyQuickSort asddf = new MyQuickSort();
        BubbleSort b = new BubbleSort();
        Random rand = new Random();
        int r,j,s;
        String h;
        long start, elapsedTime;
        //how many tests to do
        for(j=0; j<98; j++){
            //array size increasing based on the arraysize multiplier at the end of this loop
            int[] x = new int[n];
            for(i=10; i<=1000000; i*=100000){ 
                for(s=0; s<n; s++){
                    r = rand.nextInt(i) + 1;
                    x[s] = r;
                }          
                start = System.nanoTime(); //starting a "timer" 
                asddf.sort(x);
                // if the randomly generated number is between 1 and 10, it's most likely homogeneous
                if(i==10){
                    h= "homo";
                }
                // if it isn't, most likely heterogenious
                else{
                    h="hetero";
                }
                elapsedTime = System.nanoTime()- start; //calculating elapsed time for sorting
                saveResult(new algoResults("Q", elapsedTime, n, h));
                start = System.nanoTime();
                b.bubbleSort(x);
                elapsedTime = System.nanoTime()- start;
                saveResult(new algoResults("B", elapsedTime, n, h));
                start = System.nanoTime();
                InsertionSort(x);
                elapsedTime = System.nanoTime()- start;
                saveResult(new algoResults("I", elapsedTime, n, h));
                
            }
            //array size multiplier
            n+=1;            
        }
    }   
    public static void InsertionSort( int [ ] num)
    {
         int j;                     // the number of items sorted so far
         int key;                // the item to be inserted
         int i;  

         for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
        {
               key = num[ j ];
               for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
              {
                     num[ i+1 ] = num[ i ];
              }
             num[ i+1 ] = key;    // Put the key in its proper location
         }
    }
    
}
