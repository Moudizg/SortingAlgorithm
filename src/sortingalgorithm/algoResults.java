
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

/**
 *
 * @author Mouhammad
 */
public class algoResults {
    private String methodused;
    private long timeused;
    int size;
    String max;

    public algoResults(String methodused, long timeused, int size, String max) {
        this.methodused = methodused;
        this.timeused = timeused;
        this.size = size;
        this.max = max;
    }
    public String getMethodused() {
        return methodused;
    }

    public double getTimeused() {
        return timeused;
    }


    public int getSize() {
        return size;
    }

    public String getMax() {
        return max;
    }

    @Override
    public String toString() {
        return methodused + "," + "\"" + String.valueOf(timeused) +"\""+ "," + size + "," + max + "\n";
    }
    
}
