/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author S542406
 */
public class throwsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
		writeToFile();
	} 
        catch (IOException ioe) 
        {
		ioe.printStackTrace();
	}
    }
    public static void writeToFile() throws IOException 
    {
	BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
	bw.write("Test");
	bw.close();
        throw new IOException();
    }
    
}
