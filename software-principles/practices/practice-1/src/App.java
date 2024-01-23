import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // // greet user by first name
        // System.out.println("Enter your first name:");
        // String fName = input.nextLine();
        // System.out.println("Hello, " + fName + "!");


        // // greet user by full name
        // System.out.println("Enter your first and last name:");
        // String name = input.nextLine();
        // System.out.println(name);


        // // greet user based on gender
        // System.out.println("Enter your first and last name:");
        // String name = input.nextLine();
        // System.out.println("Enter gender:");
        // String gender = input.nextLine();
        // if (gender == "male") {
        //     System.out.println("Hello, Mr. " + name);
        // }
        // else if (gender == "female") {
        //     System.out.println("Hello, Ms. " + name);
        // }
        // else {
        //     System.out.println("Hello, " + name);
        // }


        // // print full name and age
        // System.out.println("Enter your first and last name:");
        // String name = input.nextLine();
        // System.out.println("Enter your age:");
        // int age = input.nextInt();
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);


        // // print user info separated by line breaks
        // System.out.println("Enter your first and last name:");
        // String name = input.nextLine();
        // System.out.println("Enter your age:");
        // int age = input.nextInt();
        // System.out.println("Enter your weight:");
        // int weight = input.nextInt();
        // System.out.println("Enter your phone number:");
        // int phone = input.nextInt();
        // System.out.println("Name: " + name);
        // System.out.println("Age: " + age);
        // System.out.println("Weight: " + weight + "lbs");
        // System.out.println("Phone number: " + phone);


        // // print user info separated by line breaks
        // System.out.println("Enter your first and last name:");
        // String name = input.nextLine();
        // System.out.println("Enter your age:");
        // int age = input.nextInt();
        // System.out.println("Enter your weight:");
        // int weight = input.nextInt();
        // System.out.println("Enter your phone number:");
        // int phone = input.nextInt();
        // System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Weight: " + weight + "lbs" + ", " + "Phone number: " + phone);


        // // print 1-10
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }


        // // print 1-100
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(i);
        // }


        // // print 20-55
        // for (int i = 20; i <= 55; i++) {
        //     System.out.println(i);
        // }


        // // print 1-10 without number user inputs
        // System.out.println("Enter a number:");
        // int number = input.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     if (i == number) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        // // print all numbers between two input
        // System.out.println("Enter your minimum number:");
        // int min = input.nextInt();
        // System.out.println("Enter your maximum number:");
        // int max = input.nextInt();
        // for (int i = min; i <= max; i++) {
        //     System.out.println(i);
        // }


        // // odd or even
        // System.out.println("Enter your number:");
        // int number = input.nextInt();
        // if (number % 2 == 1) {
        //     System.out.println("odd");
        // }
        // else {
        //     System.out.println("even");
        // }


        // // sqrt
        // System.out.println("Enter your number:");
        // int number = input.nextInt();
        // System.out.println(Math.sqrt(number));


        // // odd numbers 1-100
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 1) {
        //         System.out.println(i);
        //     }
        // }



        // // beecrowd questions
        // // 1001
        // int A = input.nextInt(), B = input.nextInt();
        // int X = A + B;
        // System.out.println("X = " + X);


        // // 1002
        // double R = input.nextDouble();
        // double A = R * R * 3.14159;
        // System.out.println("A=" + String.format("%.4f", A));


        // // 1003
        // int A = input.nextInt(), B = input.nextInt();
        // int SOMA = A + B;
        // System.out.println("SOMA = " + SOMA);


        // // 1004
        // int num1 = input.nextInt(), num2 = input.nextInt();
        // int PROD = num1 * num2;
        // System.out.println("PROD = " + PROD);


        // // 1005
        // double A = input.nextDouble(), B = input.nextDouble();
        // double avgGrade = ((A * 3.5) + (B * 7.5)) / 11;
        // System.out.println("MEDIA = " + String.format("%.5f", avgGrade));


        // // 1007
        // int A = input.nextInt(), B = input.nextInt(), C = input.nextInt(), D = input.nextInt();
        // int diff = (A * B) - (C * D);
        // System.out.println("DIFERENCA = " + diff);


        // // 1008
        // int num = input.nextInt(), hrs = input.nextInt();
        // float pay = input.nextFloat();
        // float sal = hrs * pay;
        // System.out.println("NUMBER = " + num);
        // System.out.println("SALARY = U$ " + String.format("%.2f", sal));


        // // 1009
        // String name = input.nextLine();
        // float sal = input.nextFloat(), sales = input.nextFloat();
        // double total = sal + (sales * .15);
        // System.out.println("TOTAL = R$ " + String.format("%.2f", total));


        // // 1010
        // int prod1Code = input.nextInt(), prod1Units = input.nextInt();
        // float prod1Cost = input.nextFloat();
        // int prod2Code = input.nextInt(), prod2Units = input.nextInt();
        // float prod2Cost = input.nextFloat();
        // float cost = (prod1Units * prod1Cost) + (prod2Units * prod2Cost);
        // System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", cost));


        // // 1015
        // double x1 = input.nextDouble(), y1 = input.nextDouble();
        // double x2 = input.nextDouble(), y2 = input.nextDouble();
        // double res = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        // System.out.println(String.format("%.4f", res));



        // // hackerrank questions
        // // Java Stdin and Stdout I
        // int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();
        // System.out.println(A);
        // System.out.println(B);
        // System.out.println(C);


        // // Java If-Else
        // int N = input.nextInt();
        
        // if (N % 2 == 1) {
        //     System.out.println("Weird");
        // }
        // else if (N >= 2 && N <= 5) {
        //     System.out.println("Not Weird");
        // }
        // else if (N >= 6 && N <= 20) {
        //     System.out.println("Weird");
        // }
        // else {
        //     System.out.println("Not Weird");
        // }


        // // Java Stdin and Stdout II
        // int num = input.nextInt();
        // double dub = input.nextDouble();
        // input.nextLine();
        // String words = input.nextLine();
        
        // System.out.println("String: " + words);
        // System.out.println("Double: " + dub);
        // System.out.println("Int: " + num);


        // // Java Output Formatting
        // System.out.println("================================");
        // for (int i = 1; i <= 3; i++) {
        //     String str = input.next();
        //     int num = input.nextInt();
        //     System.out.printf("%-15s%03d%n", str, num);
        // }
        // System.out.println("================================");


        // // Java Loops I
        // int N = input.nextInt();
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(N + " x " + i + " = "  + (N * i));
        // }


        // // Java Loops II
        // int queries = input.nextInt();
        
        // for (int q = 0; q < queries; q++) {
        //     int a = input.nextInt(), b = input.nextInt(), n = input.nextInt();
        //     int res = a;
            
        //     for (int i = 0; i < n; i++) {
        //         res += Math.pow(2, i) * b;
        //         System.out.print(res + " ");
        //     }
        //     System.out.println();
        // }


        // // Java Datatypes
        // int tests = input.nextInt();

        // for (int i = 0; i < tests; i++) {
        //     try {
        //         long num = input.nextLong();
        //         System.out.println(num + " can be fitted in:");
        //         if (num >= -128 && num <= 127) {
        //             System.out.println("* byte");
        //         }
        //         if (num >= -32768 && num <= 32767) {
        //             System.out.println("* short");
        //         }
        //         if (num >= -2147483648 && num <= 2147483647) {
        //             System.out.println("* int");
        //         }
        //         if (num >= Math.pow(-2, 63) && num <= Math.pow(2, 63) - 1) {
        //             System.out.println("* long");
        //         }
        //     }
        //     catch (Exception e) {
        //         System.out.println(input.next() + " can't be fitted anywhere.");
        //     }
        // }


        // // Java Strings Introduction
        // String A = input.nextLine(), B = input.nextLine();
        // System.out.println(A.length() + B.length());
        // System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        // System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));


        // // Java Substring
        // String S = input.next();
        // int start = input.nextInt();
        // int end = input.nextInt();
        // System.out.println(S.substring(start, end));



        // // codeforces questions
        // // 4A
        // int w = input.nextInt();

        // if (w % 2 == 0 && w > 2) {
        //     System.out.println("YES");
        // }
        // else {
        //     System.out.println("NO");
        // }


        // // 71A
        // int n = input.nextInt();

        // for (int i = 0; i < n; i++) {
        //     String word = input.next();
        //     if (word.length() > 10) {
        //         System.out.println(word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1));
        //     }
        //     else {
        //         System.out.println(word);
        //     }
        // }


        // 1A
        long n = input.nextInt(), m = input.nextInt(), a = input.nextInt();
        long height, width;

        if (m % a == 0) {
            height = m / a;
        } 
        else {
            height = m / a + 1;
        }

        if (n % a == 0) {
            width = n / a;
        }
        else {
            width = n / a + 1;
        }
        
        System.out.println(height * width);
    }
}