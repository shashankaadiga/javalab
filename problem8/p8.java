

import java.util.*;
class Circle {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	float calcArea() {
		float area = (float) (3.14 * radius * radius);
		return area;
	}
}

class Sector extends Circle {
	float radian;
	Sector(float radius,float radian) {
		super(radius);
		this.radian = radian;
	}
	
	float calcArea() {
		float area = (float) (0.5 * radian * radius * radius);
		return area;
	}
}

class Segment extends Circle {
	float length;

	Segment(float radius,float length) {
		super(radius);
		this.length = length;
	}

	float calcArea() {
		float area=(float) ((radius*radius)*((radius-length)/length)-(radius-length)*Math.pow((2*radius*length-(length*length)),0.5));
		return area;
	}
}
public class p8{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the the radius of circle");
		float radius=scanner.nextFloat();
		Circle circle=new Circle(radius);
		System.out.println("The area of the circle is "+circle.calcArea());
		System.out.println("Enter the value of radian");
		float radian=scanner.nextFloat();
		Sector sector = new Sector(radius,radian);
		System.out.println("The area of the sector is "+sector.calcArea());
		System.out.println("Enter the value of length");
		float length=scanner.nextFloat();
		Segment segment = new Segment(radius,length);
		System.out.println("The area of the Segment is "+segment.calcArea());
	}
}


