import java.util.Scanner;

// every Java program starts with a class
// the class name should match the file name
public class App {
    // the class must have a main method where code will be executed
    public static void main(String[] args) throws Exception {
        // Variables
        // variables are defined with a type, then name, then value
        // strings must use double quotes
        String example = "Example";

        // Types
        // most types are pretty obvious
        // for fractional numbers, there are floats and doubles
        // floats can store 6-7 decimal numbers
        float num1 = 1.23f;
        // doubles can store 15 decimal numbers
        double num2 = 1.234d;
        // you should end float and double values with "f" or "d" based on the type
        System.out.println(num1 + num2);
        // there is also the "char" type, which only stores a single character
        // make sure to use a capital "S" when defining a String type value

        // Outputs
        // print to console using System.out.println
        // the snippet for this is "sout"
        System.out.println(example);
        // println will add a new line after it
        // if you don't want the new line, just use "print"

        // Inputs
        // use the Scanner class to get user input
        // make sure to import the class (import java.util.Scanner) at the top of the file
        // once imported, create a new instance to be able to use the methods
        Scanner input = new Scanner(System.in);
        // there are many input types that use the normal type name (ex: nextInt())
        // however, for String type, you must use nextLine()
        System.out.println("Enter your message:");
        String message = input.nextLine();
        System.out.println("Your message is: " + message);
        // you should close the Scanner object when you're done using it
        input.close();
    }
    
    /* because we are in a class, we can define methods in of the class
    public means that the method can be used outside of the class
    static means that the method is a member of the class itself rather 
    than an instance of the class 
    following static is a return type, then the function name*/

    public static String sayHi() {
        return "Hello World";
    }
}
