package MainPackage;

public class Triangle extends GeometricObject{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	//no arg constructor that creates a triangle with all sides=1.0
	public Triangle(){
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
	//a constructor with three arguments that makes a triangle of specified sides
	public Triangle(double s1, double s2, double s3){
		side1=s1;
		side2=s2;
		side3=s3;
	}
	
	//getter for side 1
	double getside1(){
		return side1;
	}
	//getter for side 2
	double getside2(){
		return side2;
	}
	//getter for side 3
	double getside3(){
		return side3;
	}
	//method that calculates the Perimeter of the triangle
	public double getPerimeter(){
		double p;
		p=getside1()+getside2()+getside3();
		return p;
	}
	public double getArea(){
		double A;
		double s;
		double x;
		//uses Heron's formula to calculate the area of a triangle
		s=(getside1()+getside2()+getside3())/2;
		x=(s*(s-getside1())*(s-getside2())*(s-getside3()));
		A=Math.sqrt(x);
		return A;
	}
	//method that returns a string that is the description of the triangle
	public String toString(){
		return ("this triangle has side 1 of length"+side1+"side 2 of length"+side2+"and side 3 of length"+side3);
	}
}
