
import java.util.*;
public class matrix{
    int r1,r2,c1,c2;
     int a[][],b[][],c[][]; 
     Scanner sc=new Scanner(System.in);
        matrix(int r1,int c1,int r2,int c2){
    	this.r1=r1;
        this.c1=c1;
        this.r2=r2;
        this.c2=c2;
        a=new int[r1][c1];
      b=new int[r2][c2];
     
      }
      
    void input(){
    	 if(c1!=r2){
            System.out.println("Multipication is not possible");
            System.exit(0);
        }
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                 System.out.println("a["+i+"]["+j+"] is:");
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                 System.out.println("b["+i+"]["+j+"] is:");
                 b[i][j]=sc.nextInt();
            }
        }
    
    
    }
    
    void mul(){
        c=new int[r1][c2];
    	 for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
               // int sum=0;
                for(int k=0;k<r2;k++){
                    
                    c[i][j]+=(a[i][k]*b[k][j]);
                
                }
               
             }
          }
        

     }
     void display(){
     	   for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++){
				System.out.print(c[i][j] + "\t ");
            }
		  System.out.println();
		}

     }
    public static void main(String args[]){
          int r1=0;
          int r2=0;
          int c1=0;
          int c2=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no. of rows and coloumns of first matrix");
            r1=sc.nextInt();
            c1=sc.nextInt();
        System.out.println("Enter the no. of rows and coloumns of second matrix");
            r2=sc.nextInt();
            c2=sc.nextInt();
	     matrix obj=new matrix(r1,c1,r2,c2);
        obj.input();
        System.out.println("the product matrix is of size"+r1+"*"+c2);
	    obj.mul();
	    System.out.println("The product matrix is:");
	    obj.display();
   }
}



