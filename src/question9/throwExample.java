/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author S542406
 */
public class throwExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try {
		addInteger(1);
                addInteger(1);
	} 
        catch (IllegalArgumentException iae) 
        {
		iae.printStackTrace();
	}
        
    }
    
    private static List<Integer> in = new ArrayList<Integer>();
    public static void addInteger(Integer value) throws IllegalArgumentException 
    {
	if (in.contains(value))
        {
		throw new IllegalArgumentException("Integer already added.");
	}
	in.add(value);
    }
    
}
