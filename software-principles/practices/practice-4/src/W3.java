import java.util.Scanner;

public class W3 {
    Scanner input = new Scanner(System.in);

    // 1
    public void q1() {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Smallest number is " + Math.min(Math.min(num1, num2), num3));
    }

    // 2
    public void q2() {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("Average is " + ((num1 + num2 + num3) / 3));
    }

    // 3
    public void q3() {
        String str = input.nextLine();
        if (str.length() % 2 == 0) {

        }
        else {
            
        }
    }
}
