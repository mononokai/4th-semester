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


        // // Java 1D Array
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        //     a[i] = sc.nextInt();
        // }
        // sc.close();
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }


        // // Java Arraylist
        // int n = sc.nextInt();
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        // for (int i = 0; i < n; i++) {
        //     int columns = sc.nextInt();
        //     ArrayList<Integer> row = new ArrayList<>();
            
        //     for (int j = 0; j < columns; j++) {
        //         row.add(sc.nextInt());
        //     }
            
        //     arr.add(row);
        // }
        
        
        // int q = sc.nextInt();
        
        // for (int i = 0; i < q; i++) {
        //     int r = sc.nextInt() - 1, c = sc.nextInt() - 1;
            
        //     try {
        //         System.out.println(arr.get(r).get(c));
        //     }
        //     catch (Exception e) {
        //         System.out.println("ERROR!");
        //     }
        // }




        // // beecrowd questions
        // // 1013
        // int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // int ab = (a + b + Math.abs(a - b)) / 2;
        // int max = (ab + c + Math.abs(ab - c)) / 2;
        // System.out.println(max + " eh o maior");


        // // 1035
        // int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
        // if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
        //     System.out.println("Valores aceitos");
        // }
        // else {
        //     System.out.println("Valores nao aceitos");
        // }


        // // 1038
        // double[][] arr = {
        //     {1, 4},
        //     {2, 4.5},
        //     {3, 5},
        //     {4, 2},
        //     {5, 1.5}
        // };

        // int x = sc.nextInt(), y = sc.nextInt();
        // double total = arr[x - 1][1] * y; 
        // System.out.println("Total: R$ " + String.format("%.2f", total));


        // // 1037
        // float num = sc.nextFloat();
        
        // if (num >= 0 && num <= 25) {
        //     System.out.println("Intervalo [0,25]");
        // }
        // else if (num > 25 && num <= 50) {
        //     System.out.println("Intervalo (25,50]");
        // }
        // else if (num > 50 && num <= 75) {
        //     System.out.println("Intervalo (50,75]");
        // }
        // else if (num > 75 && num <= 100) {
        //     System.out.println("Intervalo (75,100]");
        // }
        // else {
        //     System.out.println("Fora de intervalo");
        // }


        // // 1041
        // float x = sc.nextFloat(), y = sc.nextFloat();
        // if (x == 0 && y == 0) {
        //     System.out.println("Origem");
        // }
        // else if (x == 0) {
        //     System.out.println("Eixo Y");
        // }
        // else if (y == 0) {
        //     System.out.println("Eixo X");
        // }
        // else if (x > 0) {
        //     if (y > 0) {
        //         System.out.println("Q1");
        //     }
        //     else {
        //         System.out.println("Q4");
        //     }
        // }
        // else {
        //     if (y > 0) {
        //         System.out.println("Q2");
        //     }
        //     else {
        //         System.out.println("Q3");
        //     }
        // }


        // // 1044
        // int A = sc.nextInt(), B = sc.nextInt();
        // if (B % A == 0 || A % B == 0) {
        //     System.out.println("Sao Multiplos");
        // }
        // else {
        //     System.out.println("Nao sao Multiplos");
        // }


        // // 1040
        // float n1 = sc.nextFloat(), n2 = sc.nextFloat(), n3 = sc.nextFloat(), n4 = sc.nextFloat();
        // float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        // System.out.println("Media: " + String.format("%.1f", avg));
        
        // if (avg >= 7) {
        //     System.out.println("Aluno aprovado.");
        // }
        // else if (avg < 5) {
        //     System.out.println("Aluno reprovado.");
        // }
        // else {
        //     System.out.println("Aluno em exame.");
        //     float exam = sc.nextFloat();
        //     float newAvg = (avg + exam) / 2;
        //     System.out.println("Nota do exame: " + exam);
            
        //     if (newAvg >= 5) {
        //         System.out.println("Aluno aprovado.");
        //     }
        //     else {
        //         System.out.println("Aluno reprovado.");
        //     }
            
        //     System.out.println("Media final: " + String.format("%.1f", newAvg));
        // }


        // // 1043
        // float A = sc.nextFloat(), B = sc.nextFloat(), C = sc.nextFloat();
        // float perim = A + B + C;
        // float area = C * (A + B) / 2;
        // if (A + B > C && A + C > B && B + C > A) {
        //     System.out.println("Perimetro = " + String.format("%.1f", perim));
        // }
        // else {
        //     System.out.println("Area = " + String.format("%.1f", area));
        // }


        // // 1078
        // int N = sc.nextInt();
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i + " x " + N + " = " + i * N);
        // }


        // // 1172
        // int[] X = new int[10];
        
        // for (int i = 0; i < 10; i++) {
        //     int num = sc.nextInt();
        //     if (num <= 0) {
        //         num = 1;
        //     }
        //     X[i] = num;
        // }
        
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("X[" + i + "] = " + X[i]);
        // }




        // w3resource questions
        // 1
        int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
        // String[] strArr = {"apple", "orange", "mango", "banana"};
        // Arrays.sort(numArr);
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(numArr));
        // System.out.println(Arrays.toString(strArr));


        // // 2
        // int total = 0;
        // for (int i : numArr) {
        //     total += i;
        // }
        // System.out.println(total);


        // // 3
        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         System.out.print("- ");
        //     }
        //     System.out.println("");
        // }


        // // 4
        // int total = 0;
        // for (int i : numArr) {
        //     total += i;
        // }
        // float avg = total / numArr.length;
        // System.out.println(avg);


        // // 7
        // int searchVal = 5;
        // boolean valExists = false;
        // for (int i = 0; i < numArr.length; i++) {
        //     if (numArr[i] == searchVal) {
        //         valExists = true;
        //     }
        // }
        // System.out.println(valExists ? "it's in there" : "nope");


        // // 6
        // for (int i = 0; i < numArr.length; i++) {
        //     if (numArr[i] == searchVal) {
        //         System.out.println("index: " + i);
        //     }
        // }


        // // 7
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList.add(5);
        // numList.add(4);
        // numList.add(3);
        // numList.add(2);
        // numList.add(1);

        // numList.remove(2);


        // // 8
        // ArrayList<Integer> copyArr = new ArrayList<Integer>();
        // for (int i : numList) {
        //     copyArr.add(i);
        // }
        // System.out.println(copyArr.toString());


        // // 9
        // copyArr.add(2, 3);


        // // 10
        // int min = numArr[0];
        // int max = numArr[0];
        // for (int i : numArr) {
        //     if (i < min) {
        //         min = i;
        //     }
        //     else if (i > max) {
        //         max = i;
        //     }
        // }


        // // 11
        // Collections.reverse(copyArr);
        // System.out.println(copyArr.toString());


        // // 12
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // ArrayList<Integer> dupes = new ArrayList<Integer>();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length - 1; j++) {
        //         if (arr[i] == arr[j]) {
        //             dupes.add(arr[i]);
        //         }
        //     }
        // }


        // 13
        String[] strArr = {"apple", "orange", "mango", "banana", "apple", "orange"};
        ArrayList<String> dupes = new ArrayList<String>();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i+1; j < strArr.length - 1; j++) {
                if (strArr[i] == strArr[j]) {
                    dupes.add(strArr[i]);
                }
            }
        }


        // 14
        String[] strArr1 = {"apple", "orange", "mango", "banana"};
        String[] strArr2 = {"banana", "apple", "orange"};
        ArrayList<String> common = new ArrayList<String>();
        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length - 1; j++) {
                if (strArr1[i] == strArr2[j]) {
                    common.add(strArr1[i]);
                }
            }
        }


        // 15 
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        ArrayList<Integer> common = new ArrayList<Integer>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    common.add(i);
                }
            }
        }


        // 16
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i : arr) {
            if (!newArr.contains(i)) {
                newArr.add(i);
            }
        }


        // 17
        int max = arr[0];
        int secondMax = arr[0];
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            }
            else if (i > secondMax) {
                secondMax = i;
            }
        }


        // 18 second smallest
        int min = arr[0];
        int secondMin = arr[0];
        for (int i : arr) {
            if (i < min) {
                secondMin = min;
                min = i;
            }
            else if (i < secondMin) {
                secondMin = i;
            }
        }


        // 19
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length - 1; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }


        // 20
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i : arr) {
            newArr.add(i);
        }


        // 21
        int[] newArr = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            newArr[i] = numList.get(i);
        }
    } 
}
