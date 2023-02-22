import java.util.Scanner;
public class arithmeticoperator {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Value for a:- ");
        a=s.nextInt();
        System.out.println("Enter Value for b:- ");
        b=s.nextInt();
        int c=a+b,d=a-b,e=a*b,f=a/b,g=a%b;
        System.out.println("Addition is "+c+" Substraction is "+d+" Multiplication is "+e+" Division is "+f+" Reminder is "+g);
    }
}
