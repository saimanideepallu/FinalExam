/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542406
 */
public class ExceptionDeclaration {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ExceptionDeclaration ed = new ExceptionDeclaration();
        try{
            ed.deposit(0);
        }
        catch(Exception e){
            System.out.println("This is Remote Exceptions");
        }
    }
    
     public void deposit(double amount) throws RemoteException {
      // Method implementation
      throw new RemoteException();
   }
     
     
    
}
