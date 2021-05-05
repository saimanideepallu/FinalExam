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
public class Menu {
    
    public String Myname;
    public int Myid;
          
    Menu(String Myname, int Myid) 
    {
              
        this.Myname = Myname;
        this.Myid = Myid;
    }
      
    @Override
    public boolean equals(Object obj)
    {
          
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
          
        // it checks if the argument is of the 
        // type Menu by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Menu)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        // type casting of the argument. 
        Menu menu = (Menu) obj;
          
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (menu.Myname == this.Myname && menu.Myid == this.Myid);
    }
      
    @Override
    public int hashCode()
    {   
        // We are returning the Menu_Myid 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.Myid;
    }
}
