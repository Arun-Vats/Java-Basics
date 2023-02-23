public class example{
    public static void main(String[]args){
        int a=120,b=123,c=12;
        System.out.println(a<b&a>c);//here < is comparison operator, & is bitwaise and
        System.out.println(a>b&&a>c);//here && is logical and
    }
}
/*The logical && operator doesn't check the second condition if the first condition is false. 
It checks the second condition only if the first one is true.

 */