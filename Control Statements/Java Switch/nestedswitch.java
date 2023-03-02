import java.util.Scanner;
public class nestedswitch {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a;
        char b='b';
        System.out.println("Enter Value For a:");
        a=s.nextInt();
        switch(a){
            case 1:
                System.out.println("Civil Engineering");
            break;
            case 2:
            switch(b){
              case 'a':System.out.println("Data Science");break; 
              case 'b':System.out.println("Ethical Hacking");break; 
              case 'c':System.out.println("Cloud Computing");break;
              default:System.out.println("Common Computer Science Engineering");break;
            }
            break;
            case 3:System.out.println("Electrical Engineering");break;
            case 4:System.out.println("Mechanical Engineering");break;
            default:System.out.println("BA");
        }
    }
}
