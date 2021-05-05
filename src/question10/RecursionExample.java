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
public class RecursionExample {

    static int i=0;  
    static void Rec()
    {  
        i++;  
        if(i<=4)
        {  
            System.out.println("Recursion number:"+i);  
            Rec();  
        }  
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rec();
    }
    
}
