public class narrowing {
    public static void main(String[]args){
        float a=10.5f;
        int b=(int)a;
        System.out.println("Narrowed Number is:-"+b);
    }
}

/*In Java, narrowing refers to the process of converting a value of a 
larger data type to a value of a smaller data type.  

In Java, narrowing conversion can be done by using explicit type 
casting. Type casting is the process of converting a value from 
one data type to another data type.

largerType variable1 = largerValue;
smallerType variable2 = (smallerType) variable1;

*/