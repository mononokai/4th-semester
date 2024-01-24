import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // // hackerrank questions
        // // Java Strings Introduction
        // String A = sc.nextLine(), B = sc.nextLine();
        // System.out.println(A.length() + B.length());
        // System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        // System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        

        // // Java Substring
        // String S = sc.next();
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // System.out.println(S.substring(start, end));


        // // Java Substring Comparisons
        // String smallest = s.substring(0, k);
        // String largest = s.substring(0, k);
        
        // for (int i = 1; i <= s.length() - k; i++) {
        //     if (s.substring(i, i + k).compareTo(smallest) < 0) {
        //         smallest = s.substring(i, i + k);
        //     }
        //     else if (s.substring(i, i + k).compareTo(largest) > 0) {
        //         largest = s.substring(i, i + k);
        //     }
        // }
        
        // return smallest + "\n" + largest;


        // // Java String Reverse
        // String A=sc.next();
        // String rev = new StringBuilder(A).reverse().toString();
        
        // System.out.println(A.compareTo(rev) == 0 ? "Yes" : "No");


        // // Java Anagrams
        // char[] A = a.toLowerCase().toCharArray(), B = b.toLowerCase().toCharArray();
        // Arrays.sort(A);
        // Arrays.sort(B);

        // return Arrays.equals(A, B);


        // Java 1D Array
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        //
    }
}
