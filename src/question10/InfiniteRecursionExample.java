/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S542406
 */
public class InfiniteRecursionExample {

    static void Rec()
    {  
        System.out.println("Infinite");  
        Rec();  
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rec();
    }
    
}
