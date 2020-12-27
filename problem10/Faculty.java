package ISE;
import java.util.*;
public class Faculty{
    public String name;
    public String designation;
    public int age;
    public int years_of_experience;
    public String joining_date;
    public String subjects_handhandled;
    Scanner in=new Scanner(System.in);
    void input(){
        System.out.print("Enter the name of the faculty ");
        this.name=in.nextLine();
         System.out.print("Enter the Designation ");
         this.designation=in.nextLine();
          System.out.println("Enter the age ");
          this.age=in.nextInt();
           System.out.println("Enter the age of experience ");
           this.years_of_experience=in.nextInt();
            System.out.print("Enter the joining date ");
            this.joining_date=in.next();
             System.out.print("Enter the subject handled ");
             this.subjects_handhandled=in.next();
    }

}
