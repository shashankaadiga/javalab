package Main;
import StudentPackage.*;
class mainclass{
	public static void main(String args[]){
		RegisterStudent stu1=new RegisterStudent();
	
		stu1.getDetails();

		System.out.println("Details of Student-");
		stu1.printDetails();
	}
}
