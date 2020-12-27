
import java.util.*;
public class bubblesort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
         int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("array before sorting is"+Arrays.toString(ar));
        Sort obj=new Sort(ar);
         System.out.println("array after sorting is"+Arrays.toString(ar));
     }
}
class Sort{
    Sort(int ar[]){
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }

        }
    }
}
