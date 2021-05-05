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
public class MultipleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultipleException m = new MultipleException();
        try{
            m.withdraw(2.00);
        }
        catch(RemoteException e){
            System.out.println("This is RemoteException");
        }
        catch(InsufficientFundsException i)
        {
            System.out.println("This is InsufficientFundsException");
        }
       
    }
    
     public void withdraw(double amount) throws RemoteException, InsufficientFundsException {
      // Method implementation
       if(amount<1)
        throw new RemoteException();
     else
        throw new InsufficientFundsException();
      
   }
    
        }
