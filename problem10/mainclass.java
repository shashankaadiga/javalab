package mainpack;
import ISE.*;
public class mainclass{
    public static void main(String args[]){
        ISE_department ob=new ISE_department();
        ob.readdata();
        for(int i=0;i<ob.no_faculty;i++){
            if(ob.fac[i].years_of_experience>=20){
                ob.printdata(i);
            }
        }
        ob.print_number_designation();
        ob.number_research_consultancy_projs();
    }
}