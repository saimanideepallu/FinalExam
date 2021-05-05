/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author S542406
 */
public class Question11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // creating the Objects of Menu class.
        Menu my1 = new Menu("aa", 1);
        Menu my2 = new Menu("aa", 1);         
        // comparing the above created Objects.
        if(my1.hashCode() == my2.hashCode())
        {
            if(my1.equals(my2))
                System.out.println("Both Objects are equal.");
            else
                System.out.println("Both Objects are not equal.");   
        }
        else
        System.out.println("Both Objects are not equal."); 
    }
    
}
