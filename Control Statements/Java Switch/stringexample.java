public class stringexample{
    public static void main(String[]args){
        String levelname="Expert";
        int level=3;
        switch(levelname){
            case "Beginner":level=1;
            break;
            case "Intermediate":level=2;
            break;
            case "Expert":level=3;
            break;
            default: level=0;
            break;
        }
        System.out.println("Your Level is "+level);
    }
}