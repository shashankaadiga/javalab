package ResultPackage;
import java.util.Scanner;
import Except.*;

public class Result{
	private float[] sgpas;
	private String[] subjectname;
	private char[] grades;
	private float cgpa;
	public void getDetails(){
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Details of the latest year-");
		while(n<=0){
			System.out.print("Enter no of subjects-");
			n=sc.nextInt();
		}
		sc.nextLine();
		this.subjectname=new String[n];
		this.grades=new char[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter the name of subject "+(i+1)+" - ");
			this.subjectname[i]=sc.nextLine();
			System.out.print("Enter grade for "+this.subjectname[i]+" - ");
			this.grades[i]=sc.next().charAt(0);
			sc.nextLine();
		}
		n=0;
		while(n<=0){
			System.out.print("Enter no of semesters - ");
			n=sc.nextInt();
		}
		this.sgpas=new float[n];
        boolean ptr;
		for(int i=0;i<n;i++){
            ptr=true;
            while(ptr){
			System.out.print("Enter sgpa of semester "+(i+1)+" - ");
			this.sgpas[i]=sc.nextFloat();
             ptr=false;
            try{
			if(this.sgpas[i]>10){
				throw new InvalidSGPA();
			}
            else{
                this.cgpa+=this.sgpas[i];
            }
        }catch(InvalidSGPA e){
            System.out.println(e);
             ptr=true;
        }
        }
			
	}
		this.cgpa/=n;
	}
	public void printDetails(){
		System.out.println("The subjects and respective grades in the latest semester-");
		int i=0;
		for(String str:this.subjectname){
			System.out.println(str+" : "+this.grades[i]);
			i++;
		}
		i=0;
		for(float sgpa:sgpas){
			System.out.println("SGPA of Sem "+(i+1)+" : "+this.sgpas[i]);
			i++;
		}
		System.out.println("CGPA : "+this.cgpa);
	}
}


