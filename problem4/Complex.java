

import java.util.*;
public class Complex{
    float x1,x2,y1,y2,real,img;
    Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Complex obj=new Complex();
        obj.add();
        obj.sub();
        obj.mul();

    }
     Complex(){
         System.out.println("enter for first no:");
         x1=sc.nextFloat();
         y1=sc.nextFloat();
         System.out.println("enter for second no:");
         x2=sc.nextFloat();
         y2=sc.nextFloat();
     }
     void add(){
         real=x1+x2;
         img=y1+y2;
          System.out.println("Sum is: "+real+"+"+"i("+img+")");}
     
     void sub(){
         real=x2-x1;
         img=y2-y1;
          System.out.println("Diff is: "+real+"+"+"i("+img+")");
     }
     void mul(){
         real=(x1*x2)-(y1*y2);
         img=(x1*y2)+(y1*x2);
          System.out.println("Product is: "+real+"+"+"i("+img+")");
     }
}


