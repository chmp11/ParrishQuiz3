package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import MainPackage.Triangle;

public class TriangleTests {
	//set up a new triangle with sides
	Triangle t= new Triangle();
	double side1=1;
	double side2=1;
	double side3=1;

	@Test
	public void testgetPerimeter() {
		//test that the perimeter is correct
		assertTrue("Method failed", t.getPerimeter()==3);
	}
	@Test
	public void testgetArea(){
		//tests that the area returns the correct value
		assertTrue("Area is incorrect", t.getArea()==.4330127018922193);
	}

}
