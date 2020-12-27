
import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("entter the number to test");
        int n=sc.nextInt();
        prime t1=new prime();
        t1.check(n);
    }
    public void check(int n){
        if(n<1){
            System.out.println( n+"is invalid");
        }
        else if(n==1){
             System.out.println(n+"is neither prime nor composite");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                     System.out.println(n+"is composite");
                     return;
                }
            }
             System.out.println(n+"is prime");
        }
    }
}


