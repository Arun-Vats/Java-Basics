public class javaorexample {
    public static void main(String[]args){
        int a=14,b=13,c=11;
        System.out.println(a>b|a>c); //here | is bitwise or operator 
        System.out.println(a<b||a<c); //here || is logical or operator
    }
}

/*The logical || operator doesn't check the second condition if the first condition is true. 
It checks the second condition only if the first one is false.

The bitwise | operator always checks both conditions whether first condition is true or false. */