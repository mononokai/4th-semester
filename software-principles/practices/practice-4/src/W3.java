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
            System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2));
        } else {
            System.out.println(str.charAt(str.length() / 2));
        }
    }

    // 4
    public void q4() {
        String str = input.nextLine();
        int count = 0;
        for (char i : str.toCharArray()) {
            if ("aeiou".indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }

    // 5
    public void q5() {
        String str = input.nextLine();
        int count = str.split("\\s").length;
        System.out.println("Number of words: " + (count + 1));
    }

    // 6
    public void q6() {
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // 7
    public void q7() {
        for (int i = 1; i <= 50; i++) {
            System.out.println((i * (3 * i - 1)) / 2);
        }
    }

    // 8
    public void q8() {
        double amount = input.nextDouble();
        double rate = input.nextDouble();
        int years = input.nextInt();
        System.out.println("Years\t Future Value");

        for (int i = 1; i <= years; i++) {
            amount += amount * rate / 100;
            System.out.printf(i + "\t\t %.2f\n", amount);
        }
    }

    // 9
    public void q9() {
        char c1 = input.next().charAt(0);
        char c2 = input.next().charAt(0);
        for (char i = c1; i <= c2; i++) {
            System.out.print(i + " ");
        }
    }

    // 10
    public void q10() {
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    // 11
    public void q11() {
        String str = input.nextLine();
        int count = 0;
        if (str.length() < 10) {
            System.out.println("Invalid password");
            return;
        }
        for (char i : str.toCharArray()) {
            if (Character.isDigit(i)) {
                count++;
            }
            if (!Character.isLetterOrDigit(i)) {
                System.out.println("Invalid password");
                return;
            }
        }
        if (count < 2) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Valid password");
        }
    }

    // 12
    public void q12() {
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    // 13
    public void q13() {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }

    // 14
    public void q14() {
        double s = input.nextDouble();
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("Area: " + area);
    }

    // 15
    public void q15() {
        System.out.println("Current date and time: " + java.time.LocalDateTime.now());
    }

    // 16
    public void q16() {
        for (int i = 2; i < 100; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }

    // 17
    public void q17() {
        int num = input.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Number of 2s: " + count);
    }

    // 18
    public boolean q18() {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        return (num1 + 1 == num2 && num2 + 1 == num3);
    }

    // 19
    public boolean q19() {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        return (num1 + num3) / 2 == num2;
    }

    // 20
    public void q20() {
        int num = input.nextInt();
        num = Math.abs(num);
        while (num > 9) {
            num /= 10;
        }
        System.out.println(num);
    }

    // 21
    public void q21() {
        int num = input.nextInt();
        System.out.print(num + " = ");
        while (num % 3 == 0) {
            System.out.print("3 * ");
            num /= 3;
        }
        System.out.println(num);
    }

    // 22
    public boolean q22() {
        int num = input.nextInt();
        while (num > 0) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // 23
    public boolean q23() {
        String str = input.nextLine();
        for (char i : str.toCharArray()) {
            if ("aeiou".indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
