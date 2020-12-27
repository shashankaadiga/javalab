
import java.util.*;
public class account{
     Scanner sc=new Scanner(System.in);
      String name;
       int Accno;
       long Phone_No;
       float balance_amt;
      // int choice;
    public static void main(String args[]){
      
        account obj=new account();
          Scanner sc=new Scanner(System.in);
        obj.getinput();
        while(true){
        System.out.println("Enter your choice(1 for deposit/2 for withdrawal/3 for display/4 for exit)");
        int choice=sc.nextInt();
        switch(choice){
            case 1:obj.Deposit();break;
            case 2:obj.Withdraw();break;
            case 3:obj.display();break;
            case 4:java.lang.System.exit(0);

        }}
    }
    void getinput(){
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
         name=sc.nextLine();
        System.out.println("Enter your ac/no.");
         Accno=sc.nextInt();
        System.out.println("Enter your phoneno:");
         Phone_No=sc.nextLong();
        System.out.println("Enter your balance:");
         balance_amt=sc.nextFloat();
    }
    void Deposit(){
        float depo;
        System.out.println("Eneter the amount to be deposited");
        depo=sc.nextFloat();
        balance_amt+=depo;
        System.out.println("balance after deposition is "+balance_amt);
    }
    void Withdraw(){
        float with;
        System.out.println("Enter the amount to be withdrawn ");
        with=sc.nextFloat();
        if(with>balance_amt){
            System.out.println("failed! not possible as balance is insufficient");
        }
        else{
            balance_amt-=with;
            System.out.println("balance after withdrawal: "+balance_amt);
        }
    }
    void display(){
        System.out.println("Account detail is:");
        System.out.println("Name: "+name);
        System.out.println("Ac/no: "+Accno);
        System.out.println("Phone no: "+Phone_No);
        System.out.println("Balance amt: "+balance_amt);
    }
}

