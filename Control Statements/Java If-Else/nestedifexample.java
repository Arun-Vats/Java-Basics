public class nestedifexample {
    public static void main(String[]args){
        String State="Brandenburg, Germany";
        if(State.endsWith("India")){
            if(State.contains("Haryana")){
                System.out.println("You Live in Haryana, India");
            }
        }
        else if(State.endsWith("Germany")){
            if(State.contains("Brandenburg")){
            System.out.println("You Live in Berlin,Germany");
        }
    }
    else {
        System.out.println("Country Not Found.");
    }
    } 
}

/*In Java, "endsWith" is a string method that checks whether a given string ends with a 
specific suffix or not.

In Java, the "contains" method is a string method that is used to check if a particular 
sequence of characters (substring) is present in a given string.
 */