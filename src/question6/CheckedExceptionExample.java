/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author S542406
 */
public class CheckedExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
    }
    
}
