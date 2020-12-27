
package StudentPackage;
import java.util.Scanner;
import ResultPackage.*;
import Except.*;

public class RegisterStudent implements Student{	
	private String name,branch;
	private int noOfCredits;
	public Result res;
	public void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the student - ");
		this.name=sc.nextLine();
		System.out.print("Enter the branch of the student - ");
		this.branch=sc.nextLine();
		this.noOfCredits=-1;
		boolean key=true;
		while(this.noOfCredits<0 || key){
			System.out.print("Enter the no of credits registered - ");
			this.noOfCredits=sc.nextInt();
			key=false;
			sc.nextLine();
		try{
		if(this.noOfCredits>30){
			throw new CreditLimit();
		}}catch(CreditLimit e){
			key=true;
			System.out.println(e);
			
	}
		
	}
		
		
}
	public void printDetails(){
		System.out.println("Name : "+this.name);
		System.out.println("Branch : "+this.branch);
		res=new Result();
		res.getDetails();
		res.printDetails();
	}
}


