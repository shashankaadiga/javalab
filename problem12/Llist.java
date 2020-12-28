import java.util.*;
public class Llist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> names=new LinkedList<String>();
        int n;
        String r="";
        System.out.println("Enter the total number of names in the list");
        n=sc.nextInt();
        if(n>0){
           
            for(int i=0;i<n;i++){
                 System.out.print("Enter the "+(i+1)+" name ");
                 r=sc.next();
                 names.add(r);
            }
            Iterator<String> itr=names.iterator();
            String current="";
            System.out.println("Names whose length is less than 5 are:");
            while(itr.hasNext()){
                current=itr.next();
                if(current.length()<5){
                    System.out.println(current);
                }
            }

        }
        else{
            System.out.println("Invalid Input");
        }


    }
}