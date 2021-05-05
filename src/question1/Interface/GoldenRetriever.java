/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Interface;

/**
 *
 * @author S542406
 */
public class GoldenRetriever implements Dog {

    @Override
    public void dogSound() {
        
        System.out.println("Boww");
    }

    @Override
    public void sleep() {
        
        System.out.println("zzzzzzz");
    }
    
}
