/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author S542406
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Colorable c1 = new Square(10.0);
        
        Colorable c2 = new Square(20.0);
        
        Colorable c3 = new Square(30.0);
        
        Colorable c4 = new Square(40.0);
        
        Colorable c5 = new Square(50.0);
        
        GeometricObject[] gm = new GeometricObject[5];
        
        gm[0]=(GeometricObject)c1;
        
        gm[1]=(GeometricObject)c2;
        
        gm[2]=(GeometricObject)c3;
        
        gm[3]=(GeometricObject)c4;
        
        gm[4]=(GeometricObject)c5;

        for (GeometricObject gmo : gm) 
        {
            System.out.println("The Area for the square" + gmo.squareArea());
            
            gmo.howToColor();
        }

    }
    
}
