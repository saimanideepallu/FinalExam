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
public class Square extends GeometricObject implements Colorable 
{
    private double s;

    public Square(double s) 
    {
        this.s = s;
    }

    public double getS() 
    {
        return s;
    }

    @Override
    public String toString() 
    {
        return "Square{" + "side=" + s + '}';
    }

    @Override
    public double squareArea() 
    {
        return s*s;
    }

    @Override
    public void howToColor() 
    {
        if (s>0) {
            System.out.println("Color all four sides");
        } else {
            System.out.println("No sides for square");
        }
    }
}
