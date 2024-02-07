import java.util.Scanner;

public class Calc {
    Scanner input = new Scanner(System.in);

    public void calculate() {
        System.out.println("Select your operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int op = input.nextInt();

        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        try {
            switch (op) {
                case 1: 
                    System.out.println("The sum is " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The difference is " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("The product is" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("The quotient is " + (num1 / num2));
                    System.out.println("Rounded to 2 decimal places: " + (Math.round((num1 / num2) * 100) / 100));
                    System.out.println("Rounded: " + Math.round(num1 / num2));
                    System.out.println("Truncated: " + Math.floor(num1 / num2));
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
    }
}
