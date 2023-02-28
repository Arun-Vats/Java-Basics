import java.util.Scanner;
public class leapyearexample {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        int year;
        System.out.println("Enter Year:- ");
year=s.nextInt();
if((year%4==0&&year%100!=0)||(year%400==0)){
    System.out.println("Entered Year is leap year.");
}
else 
{
    System.out.println("Entered Year is not a leap year.");
}
    }
}
