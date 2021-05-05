/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;
import java.util.*;
/**
 *
 * @author S542406
 */
public class Question7 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] ar = getArray();
        System.out.print("Enter the index of the array: ");
		try 
                {
			System.out.println("The corresponding element value: " + ar[sc.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) 
                {
			System.out.println("Out of Bounds.");
		}
                
    }
    public static int[] getArray() 
    {
		int[] ary = new int[100];
		for (int i = 0; i < ary.length; i++) 
                {
			ary[i] = (int)(Math.random() * 100) + 1;
		}
		return ary;
	}
    
    
}
