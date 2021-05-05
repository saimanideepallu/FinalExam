/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S542406
 */
public class NarrowingCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a = 223.33;  
        long b = (long)a;  
        int c = (int)b;  
        System.out.println("Double type: "+a);    
        System.out.println("long type: "+b);   
        System.out.println("int type: "+c);  
    }
    
}
