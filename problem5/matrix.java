


import java.util.*;
public class matrix{
    public static void main(String args[]){
        int r1,r2,c1,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and coloumns of first matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the no. of rows and coloumns of second matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int[][] a=new int[r1][c2];
        int[][] b=new int[r2][c2];
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
        System.out.println("the product matrix is of size"+r1+"*"+c2);
	 System.out.println("The product matrix is:");
         int[][] c=new int[r1][c2];
          for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<r2;k++){
                    
                    sum+=(a[i][k]*b[k][j]);
                }
                c[i][j]=sum;
                
            }
          }
         // System.out.println("Resultant matrix of"+Arrays.deepToString(a)+" * "+Arrays.deepToString(b) +" is: "+Arrays.deepToString(c));
           for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++){
				System.out.print(c[i][j] + "\t ");}
			System.out.println();
		}
	

    }
}

