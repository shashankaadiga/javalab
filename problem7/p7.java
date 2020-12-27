


import java.util.*;
class Salary {
	float basic, da, hra, total;

	Salary(float basic) {
		this.basic = basic;
		hra = (float) (basic * 0.4);
		da = (float) (basic * 0.6);
		total = (basic + hra + da);
	}

}

class Employee {
	String name, education;
	int age, experienceYears, basic, numberOfLoans, loanAmount, tax;
	Salary salary;

	Employee(String name, int age, String education, int experienceYears, int numberOfLoans, int basic,
			int loanAmount) {

		this.name = name;
		this.age = age;
		this.education = education;
		this.experienceYears = experienceYears;
		this.numberOfLoans = numberOfLoans;
		this.basic = basic;
		this.loanAmount = loanAmount;
		salary = new Salary(basic);

	}

	void isEligible() {
		if ((loanAmount <= salary.total / 2) && (numberOfLoans < 5))
			System.out.println("Is eligible for loan");
		else
			System.out.println("Not eligible for loan");
	}

	int taxPay() {
       // System.out.println(salary.total);
		if (salary.total < 250000)
			tax = 0;
		else if ((salary.total > 250000) && (salary.total < 500000))
			this.tax = (int) (0.1 * salary.total);
		else if ((salary.total > 500000) && (salary.total < 1000000))
			this.tax = (int) (0.2 * salary.total);
		else if (salary.total > 1000000)
			this.tax = (int) (0.3 * salary.total);
        return tax;
	}

	void isEligiblePromotion() {
		if (experienceYears > 10)
			System.out.println("Eligible for promotion ");
		else
			System.out.println("Not eligible for promotion");
	}

	void Display() {
		System.out.println("name: " + name);
		System.out.println("age :" + age);
		System.out.println("education :" + education);
		System.out.println("Years of Experience: " + experienceYears);
		System.out.println("Number of Loans: " + numberOfLoans);
		System.out.println("Salary: " + salary.total);
		isEligible();
		System.out.println("The tax to be paid is " + this.taxPay());
		isEligiblePromotion();
		System.out.println("\n\n\n");
	}
}
public class p7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of employees to be created");
        int num=sc.nextInt();
        Employee employees[]=new Employee[num];
        for(int i=0;i<num;i++){
            System.out.println("Enetr the information for employee number"+(i+1));
            System.out.println("Enter the name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			System.out.println("Enter Education");
			sc.nextLine();
			String education = sc.nextLine();
			System.out.println("Enter years of experience");
			int experienceYears = sc.nextInt();
			System.out.println("Enter number of Loans");
			int numberOfLoans = sc.nextInt();
			System.out.println("Enter the basic salary");
			int basic = sc.nextInt();
			System.out.println("Enter the loan amount");
			int loanAmount = sc.nextInt();
			employees[i] = new Employee(name, age, education, experienceYears, numberOfLoans, basic, loanAmount);
		}
		for (int j = 0; j < num; j++) {
            System.out.println("\n");
			System.out.println("This is employee number "+(j+1)+"'s Information");
			employees[j].Display();
			System.out.println("\n");}
    }
} 


