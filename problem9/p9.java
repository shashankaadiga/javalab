import java.util.*;

abstract class Vehicle {
	
	int year_of_manufacture;
	
	Vehicle(int yom) {
		year_of_manufacture = yom;
	}
	
	abstract String getData();
	abstract void putData(String a);
}

class TwoWheeler extends Vehicle {
	
	String name;
	
	TwoWheeler(int yom){
		super(yom);
	}
	
	void putData(String name) {
		this.name = name;
	}
	
	String getData() {
		return name;
	}
	
}

final class FourWheeler extends Vehicle {
	
	String name;
	
	FourWheeler(int yom){
		super(yom);
	}
	
	void putData(String name) {
		this.name = name;
	}
	
	String getData() {
		return name;
	}
}

class MyTwoWheeler extends TwoWheeler {
	
	MyTwoWheeler(int yom){
		super(yom);
	}
	
}

public class p9 
{
    public static void main(String[] args)  {
    
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the name of My Two Wheeler");
    	String str = sc.nextLine();
    	System.out.println("Enter the year of manufacture of My Two Wheeler");
    	int n = sc.nextInt();
    	MyTwoWheeler ob1 = new MyTwoWheeler(n);
    	ob1.putData(str);
    	//System.out.println("Year of manufacture of My Two Wheeler " + ob1.getData() + " is "  + ob1.year_of_manufacture);
        System.out.println("Enter the name of Four Wheeler");
    	String st = sc.next();
    	System.out.println("Enter the year of manufacture of Four Wheeler");
    	int m = sc.nextInt();
        FourWheeler ob2=new FourWheeler(m);
        ob2.putData(st);
        System.out.println("Year of manufacture of My Two Wheeler " + ob1.getData() + " is "  + ob1.year_of_manufacture);
        System.out.println("Year of manufacture of Four Wheeler "+ob2.getData()+"is"+ob2.year_of_manufacture);

    	
    	
    }
    	
    	
}