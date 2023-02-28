import java.util.Scanner;
public class ifelseifexample {
    public static void main(String[]args){
Scanner s=new Scanner(System.in);
int per;
System.out.println("Enter Total Percentage:-");
per=s.nextInt();
if(per>=90&&per<100){
    System.out.println("A Grade.");
}
else if (per>=80&&per<90){
    System.out.println("B Grade.");
}
else if(per>70&&per<80){
    System.out.println("C Grade.");
}
else if(per>60&&per<70){
    System.out.println("D Grade.");
}
else {
    System.out.println("E Grade.");
}
    }
}
