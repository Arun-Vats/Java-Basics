import java.util.Scanner;
public class nestedifexample2 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Your Age:- ");
        a=s.nextInt();
        System.out.println("Enter Your Weight:- ");
        b=s.nextInt();
        if(a>18&&a<=45){
            if(b>48&&b<=70){
                System.out.println("Congratulations! You Are Healthy.");
            }
            else{
            System.out.println("Sorry, You Are Not Healthy.");
            }
        }
        else{
            System.out.println("Sorry, You Are Not Healthy.");
        }
    }
}
