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
public class Circle {
    private double radius;

	public Circle() 
        {
	}

	public Circle(double radius) 
        {
            this.radius = radius;
	}

	public double getRadius() 
        {
            return radius;
	}

	public void setRadius(double radius) 
        {
            this.radius = radius;
	}

	public double getArea() 
        {
            return radius * radius * Math.PI;
	}

	@Override
	public String toString() 
        {
            return  "Radius of the Circle: " + radius+"\nArea of the Circle: "+this.getArea();
	}
}
