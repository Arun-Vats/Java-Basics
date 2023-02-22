import java.util.Scanner;
public class datatypesexamples {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        byte a;
        char arun='a';
        short b;
        int c;
        long d;
        float e;
        double f;
        System.out.println("Enter Number for Byte Datatype:- ");
        a=s.nextByte();
        System.out.println("Enter Number for Short Datatype:- ");
        b=s.nextShort();
        System.out.println("Enter Number for Int Datatype:- ");
        c=s.nextInt();
        System.out.println("Enter Number for Long Datatype:- ");
        d=s.nextLong();
        System.out.println("Enter Number for Float Datatype:- ");
        e=s.nextFloat();
        System.out.println("Enter Number for double Datatype:- ");
        f=s.nextDouble();
        System.out.println("Byte Datatype Example:- "+a);
        System.out.println("Char Datatype example :- "+arun);
        System.out.println("Short Datatype Example:- "+b);
        System.out.println("Int Datatype Example:- "+c);
        System.out.println("Long Datatype Example:- "+d);
        System.out.println("Float Datatype Example:- "+e);
        System.out.println("Double Datatype Example:- "+f);


    }
}
