

import java.util.*;
public class string1{
     Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        string1 obj=new string1();
	System.out.println("first problem started");
        obj.p1();
	System.out.println("second problem started");
        obj.p2();
	System.out.println("third problem started");
        obj.p3();
	System.out.println("fourth problem started");
        obj.p4();
	System.out.println("fifth problem started");
        obj.p5();
	System.out.println("sixth problem is started");
        obj.p6();
   }
    void p1(){
         String s;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        s=sc.nextLine();
          System.out.println("Entered string is :"+s);
            System.out.println("enter the size of da string to be extrcted");
            int m=sc.nextInt();
              System.out.println("enter the position from which we have to start");
              int n=sc.nextInt();
            if((n+m)>s.length()){
                  System.out.println("not possible");
                 // System.exit(0);
            }
            else{
            String r="";
             // System.out.println(r.length());
            for(int i=n;r.length()<m;i++){
                r=r+s.charAt(i);
            }
              System.out.println("extracted string is: "+r);}

    }
    void p2(){
        String s;
        String word;
        System.out.println("Enter the string");
        s=sc.next();
        System.out.println("Enter the word");
        word=sc.next();
        int n=s.length();
        int m=word.length();
        int count=0;;
        String str;
        for(int i=0;i<=n-m;i++){
            str=s.substring(i,i+m);
            if(str.equals(word)){
                count++;
            }
        }
        System.out.println(word+" is repeated "+count+" times in "+s);
 }
    void p3(){
        String s;
        String word;
        String str;
        System.out.println("Enter the string");
        s=sc.next();
        System.out.println("Enter the substring:");
        word=sc.next();
        System.out.println("Enter the replacable new substring");
        str=sc.next();
        System.out.println("String before replace: "+s);
        s=s.replace(word,str);
        System.out.println("String after replace: "+s);

    }
    void p4(){
        String s;
        System.out.println("Enter the string");
        s=sc.next();
        System.out.println("String before sorting: "+s);
        char[] ar=s.toCharArray();
        Arrays.sort(ar);
        System.out.println("String after sorting: "+new String(ar));
    }
    void p5(){
        String s;
        System.out.println("Enter first string: ");
        s=sc.next();
        String r;
         System.out.println("Enter second string: ");
         r=sc.next();
         String S=s.toUpperCase();
         String R=r.toUpperCase();
         if(S.equals(R)){
              System.out.println(s+" and "+r+" are equal");
              return;
         }
          System.out.println(s+" and "+r+" are not equal");
    }
    void p6(){
        String s;
        System.out.println("Enter first string: ");
        s=sc.next();
        String r;
         System.out.println("Enter second string: ");
         r=sc.next();
         //s=s.concat(r);
         s=s+r;
         System.out.println("String after concatenation is: "+s);

    }

}


