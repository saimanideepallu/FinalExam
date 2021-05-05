/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542406
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          
	ComparableCircle cc1 = new ComparableCircle(10);
	ComparableCircle cc2 = new ComparableCircle(30);
	System.out.println("The values of the first circle");
	System.out.println(cc1);
	System.out.println("The values of the second circle");
	System.out.println(cc2);
	System.out.println((cc1.compareTo(cc2) == 1 ? "First Circle" : "Second Circle") + " is the larger among the both circles.");
    }
    
}
