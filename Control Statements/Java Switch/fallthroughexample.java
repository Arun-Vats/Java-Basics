public class fallthroughexample {
    public static void main(String[]args){
        int a=1;
        switch(a){
            case 1:System.out.println("One");
            case 2:System.out.println("Two");
            case 3:System.out.println("Three");
            case 4:System.out.println("Four");
            default:System.out.println(a);
        }
    }
}
/*The Java switch statement is fall-through. It means it executes all statements after the 
first match if a break statement is not present. */