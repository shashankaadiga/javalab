package ISE;
import java.util.*;
public class ISE_department implements Department{
    private int no_designation,no_research_projs;
    public int no_faculty;
    Scanner sc=new Scanner(System.in);
    public  Faculty[] fac;

   public  ISE_department(){
    
     System.out.println("Enter the no. of designation");
     no_designation=sc.nextInt();
      System.out.println("Enter the no. of research project done");
      no_research_projs=sc.nextInt();
      }
     public void print_number_designation(){
         System.out.println("No.of designation in the department is "+this.no_designation);
     }
     public void number_research_consultancy_projs(){
           System.out.println("No.of research projects conducted in the department is "+this.no_research_projs);

      }
     
       public void readdata() {
           System.out.println("Enter the no. of faculty");
           no_faculty=sc.nextInt();
            fac = new Faculty[no_faculty];
           System.out.println("Enter the details of all faculties");
         for(int i=0;i<no_faculty;i++){
           System.out.println("Enter the details of "+(i+1)+"faculty");
           fac[i]=new Faculty();
           fac[i].input();
           try{
               if(fac[i].age>58){
                   throw new AgeException();
               }

           }
           catch(AgeException e){
               System.out.println(e);
           }

        
        
              // System.out.println(fac[i].name+e.toString);
           
      }
    }
    
    public void printdata(int b){
        System.out.println("Name: "+fac[b].name);
         System.out.println("Designation: "+fac[b].designation);
          System.out.println("Age: "+fac[b].age);
           System.out.println("Years of Experience: "+fac[b].years_of_experience);
            System.out.println("Joining Date: "+fac[b].joining_date);
             System.out.println("Subjects Handled"+fac[b].subjects_handhandled);


    }

}
class AgeException extends Exception{
    public String toString(){
         return "faculty will retire soon";
     }
 } 
 