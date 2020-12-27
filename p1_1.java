
import java.util.*;
public class p1_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in da series to be printed");
        int n=sc.nextInt();
        int count=0;
        p1_1 obj=new p1_1();
	System.out.println("Printing theFibonacci series without recurssion");
        obj.fibo(n);
	System.out.println();
	System.out.println("Printing theFibonacci series using recurssion");
        obj.fibor(n,count,0,1);
	System.out.println();
    }
    void fibo(int n){
        int t1=0;int t2=1;
        int t3;
        int i=1;
        while(i<=n){
            System.out.print(t1+"\t");
            t3=t1+t2;
            t1=t2;
            t2=t3;
            i++;
        }
    }
    void fibor(int n,int count,int t1,int t2)
    {
        if(count==n){
            return;
        }
        else{
            System.out.print(t1+"\t");
            ++count;
            fibor(n,count,t2,t1+t2);
            return;
        }
    }

}


