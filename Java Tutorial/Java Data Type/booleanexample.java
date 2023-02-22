public class booleanexample {
    public static void main(String[]args){
        boolean Raining=false;
        boolean Sunny=false;
        if(Raining && Sunny){
            System.out.println("Nice");
        }
        else if(Raining && !Sunny){
            System.out.println("Sexy");
        }
        else{
            System.out.println("Super Sexy");
        }
    }
}
