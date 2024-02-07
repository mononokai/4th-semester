import java.util.Scanner;

public class TwoNums {
    Scanner input = new Scanner(System.in);

    public void dos() {
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Distance: " + Math.abs(num1 - num2));
        System.out.println("Max: " + Math.max(num1, num2));
        System.out.println("Min: " + Math.min(num1, num2));
    }
}
