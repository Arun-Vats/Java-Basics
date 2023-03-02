enum colours{green,red,blue,black,white}
public class enumexample{
    public static void main(String[]args){
colours c=colours.black;
switch(c){
    case blue:
    System.out.println("Colour is blue.");
    break;
    case black:
    System.out.println("Colour is black.");
    break;
    case red:
    System.out.println("Colour is red.");
    break;
    case white:
    System.out.println("Colour is white.");
    break;
    case green:
    System.out.println("Colour is Green.");
    break;
}
    }
}