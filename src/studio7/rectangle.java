package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
private double length;
private double width;
private double area;
private double perimeter;

public rectangle(double l, double w){
	length = l;
	width = w;
	if (l==w)
	{
		System.out.println("square");
	}
	
}
public double getArea()
{
	area = length*width;
	return area;
}
public double getPerimeter()
{
	perimeter = 2*length + 2*width;
	return perimeter;
}
public boolean isSmaller(rectangle r)
{
	if (this.getArea() < r.getArea())
		return true;
	else {
		return false;
	}
}



public static void main(String[] args) {
	
	rectangle r = new rectangle(5, 10);
	System.out.println(r.getArea());
	
}
}