import java.util.Scanner;
public class ternaryoperator{
    public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter Value for a:- ");
a=s.nextInt();
System.out.println("Enter Value for b:- ");
b=s.nextInt();
int m=(a>b)?a:b;
System.out.println(m+" is greater.");
    }
}
/*The ternary operator in Java is a shorthand way of writing an if-else statement in a 
single line of code. It is also known as the conditional operator. */