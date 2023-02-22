public class overflow {
    public static void main(String[]args){
        int a=128;
        byte b=(byte)a;
        System.out.println("Value for  integer datatype is "+a+" and for byte datatype its "+b);
    }
}
/*In Java, an overflow occurs when the result of a computation is too large to be stored in the data type that's being used.

When an overflow occurs, the value "wraps around" to the lowest possible value that can be represented by the data type, which can cause errors or unexpected behavior in program.
 */