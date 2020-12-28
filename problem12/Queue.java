import java.util.*;
public class Queue{
    public int rear=-1;
    public int front=-1;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> Q;
    void init(){
        this.Q=new ArrayList<String>();
    }
    void enque(){
        rear++;
        System.out.print("Enter the element to the queue ");
        String str=sc.next();
        this.Q.add(str);
    }
    void deque(){
        front++;
        if((rear==-1) || (front>rear)){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Element deleted is"+Q.get(front));
        }
    }
    void display(){
        if(front>=rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.print("Queue is: ");
            for(int i=front+1;i<=rear;i++){
                System.out.print(Q.get(i)+"\t");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        Queue obj=new Queue();
        obj.init();
        int choice;
        while(true){
        System.out.println("Enter the choice(1.insertion,2.Deletion,3.Display,4.Exit)");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                    obj.enque();
                    break;
            case 2:
                    obj.deque();
                    break;
            case 3:
                    obj.display();
                    break;
            default:
                    System.exit(0);

        }
    }
       

 }
    
}