import java.util.*;
public class Stack{
    Scanner sc=new Scanner(System.in);
   // System.out.println("enter the  max size of stack"); 
    int n;
    int stack[];
    int top;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack obj=new Stack();
        while(true){
         System.out.println("enter 1 for push/2 for pop/3 for display/4 for exit");
         int choice=sc.nextInt();
         switch(choice){
             case 1:
                     System.out.println("enter the element to be pushed");
                     int a=sc.nextInt();
                     obj.push(a);
                     break;
             case 2:
                    System.out.println("Element popped is "+obj.pop());
                    break;
             case 3:
                     System.out.println("array is:");
                    obj.display();
                    break;
             case 4:
                    System.exit(0);
         } 
        }



    }
    Stack(){
         System.out.println("enter the  max size of stack"); 
         n=sc.nextInt();
           stack=new int[n];
        top=-1;
    }
    void push(int a){
        if(top==n-1){
            System.out.println("overflow cannot insert");
        }
        else{
            stack[++top]=a;
        }
    }
    int pop(){
        if(top==-1){
             System.out.println("underflow no element to be popped");
             return '\0';
             //break;
        }
        else{
            return stack[top--];
        }
    }
    void display(){
        if(top==-1){
             System.out.println("empty");
             return;
        }
        for(int i=top;i>=0;i--){
             System.out.println(stack[i]);
        }
    }

}


