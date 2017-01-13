/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mouhammad
 */
public class csv {
    static File resFile = new File("results.csv");
    static String[] temp = new String[100];
    static String line = "";
    static FileWriter fileWriter;
    public static void saveResult(algoResults a)
    {
        try{
                fileWriter = new FileWriter(resFile, true);    
                fileWriter.append(a.toString());
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while flushing/closing fileWriter");
                    e.printStackTrace();
		}
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
