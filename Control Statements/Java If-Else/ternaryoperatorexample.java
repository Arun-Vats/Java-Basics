import java.util.Scanner;
public class ternaryoperatorexample{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter Value for a:- ");
a=s.nextInt();
System.out.println("Enter Value for b:- ");
b=s.nextInt();
int c=(a>b)?a:b;
System.out.println(c);
}    
}
/*
Certainly! The ternary operator is a shorthand way of writing an if-else statement 
in a single line of code. Its syntax looks like this:

condition ? expression1 : expression2

 */