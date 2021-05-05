/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542406
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{

    public ComparableCircle() 
    {
    }

    public ComparableCircle(double radius) 
    {
        super(radius);
    }
    
    @Override
    public int compareTo(ComparableCircle arg0) 
    {
        if (getArea() > arg0.getArea())
        {
            return 1;
        }
        else if (getArea() < arg0.getArea())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}
