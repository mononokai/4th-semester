import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Java was released in 1995, developed by James Gosling
        // up until Java, there were no programming languages that could be used on any OS
        // Java is a compiled language, like C and C++
        // unlike C and C++, though, Java is compiled into bytecode rather than binary
        // the bytecode can then be interpreted by the Java Virtual Machine (JVM)
        // JVM is unique to each platform


        // -- Java language conventions --
        // class - keyword used to declare a class
        // public - keyword used to declare visibility, visible to all
        // static - a keyword used to declare a method as static, which allows the use of a method
        //          without having to create an object, it is not instance specific
        // void - return type, returns nothing
        // main - represents the startup of the program
        // String[] args - used for command line arguments
        
        // Class names should start with a capital letter and have each word start with a capital
        // this is called pascal casing
        // Method names should be in camel case
        // The class name should match the file name exactly, otherwise it will not compile
        
        // attributes in Java can be accessed with dot notation (ClassName.attrName)
        // values of these attributes can be changed with assignment (ClassName.attrName = "value") ONLY if the property is public
        
        // Encapsulation ensures that things that should not be seen are not seen
        // this is done by using the private keyword
        // in order to access attribute values, you have to precede the attribute name by "get"
        // example: ClassName.getAttributeName
        // in order to update attribute values, you have to precede the attribute name by "set"
        // example: ClassName.setAttribute


        // Arrays
        // declare an array with the datatype followed by empty square brackets and the array name
        // array values in Java are contained in curly braces
        // example: 
        String[] arr = {"Hello", "World"};
        // arrays can be looped through with a normal for loop or a "for-each" loop
        // example:
        for (String i : arr) {
            System.out.println(i);
        }
        // multidimensional arrays can also be created by specifying the amount of dimensions after the datatype
        // example:
        int[][] multiArr = { {1, 2, 3, 4}, {5, 6, 7} };
        // it's also possible to make an array of objects using class instances
        // the ArrayList class from the java.util package is a wrapper class that has a lot of useful methods for arrays
        // with ArrayList, you declare an array somewhat differently
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("Hello");
        myArr.add("World");
        // add can take two arguments to specify adding a value in a specific place in the array
        // this will move any values after it back one space
        // some useful methods include set, size, clear, and remove
        // the Collections interface from the java.util package gives a sort() method that can be used on lists
    }
}
