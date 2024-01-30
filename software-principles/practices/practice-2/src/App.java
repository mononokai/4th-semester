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
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
        // String[] strArr = {"apple", "orange", "mango", "banana"};
        // Arrays.sort(numArr);
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(numArr));
        // System.out.println(Arrays.toString(strArr));


        // // 2
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
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
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
        // int total = 0;
        // for (int i : numArr) {
        //     total += i;
        // }
        // float avg = total / numArr.length;
        // System.out.println(avg);


        // // 7
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
        // int searchVal = 5;
        // boolean valExists = false;
        // for (int i = 0; i < numArr.length; i++) {
        //     if (numArr[i] == searchVal) {
        //         valExists = true;
        //     }
        // }
        // System.out.println(valExists ? "it's in there" : "nope");


        // // 6
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
        // for (int i = 0; i < numArr.length; i++) {
        //     if (numArr[i] == searchVal) {
        //         System.out.println("index: " + i);
        //     }
        // }


        // // 7
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // Collections.addAll(numList, 5, 4, 3, 2, 1);

        // numList.remove(2);


        // // 8
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // Collections.addAll(numList, 5, 4, 3, 2, 1);
        // ArrayList<Integer> copyArr = new ArrayList<Integer>();
        // for (int i : numList) {
        //     copyArr.add(i);
        // }
        // System.out.println(copyArr.toString());


        // // 9
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // Collections.addAll(numList, 5, 4, 3, 2, 1);
        // numList.add(2, 3);


        // // 10
        // int[] numArr = {3, 4, 5, 1, 2, 8, 9, 6, 7};
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
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // Collections.addAll(numList, 5, 4, 3, 2, 1);
        // Collections.reverse(numList);
        // System.out.println(numList.toString());


        // // 12
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // ArrayList<Integer> dupes = new ArrayList<Integer>();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length - 1; j++) {
        //         if (arr[i] == arr[j]) {
        //             dupes.add(arr[i]);
        //         }
        //     }
        // }


        // // 13
        // String[] strArr = {"apple", "orange", "mango", "banana", "apple", "orange"};
        // ArrayList<String> dupes = new ArrayList<String>();
        // for (int i = 0; i < strArr.length; i++) {
        //     for (int j = i + 1; j < strArr.length - 1; j++) {
        //         if (strArr[i] == strArr[j]) {
        //             dupes.add(strArr[i]);
        //         }
        //     }
        // }


        // // 14
        // String[] strArr1 = {"apple", "orange", "mango", "banana"};
        // String[] strArr2 = {"banana", "apple", "orange"};
        // ArrayList<String> common = new ArrayList<String>();
        // for (int i = 0; i < strArr1.length; i++) {
        //     for (int j = 0; j < strArr2.length - 1; j++) {
        //         if (strArr1[i] == strArr2[j]) {
        //             common.add(strArr1[i]);
        //         }
        //     }
        // }


        // 15 
        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {3, 4, 5, 6, 7};
        // ArrayList<Integer> common = new ArrayList<Integer>();
        // for (int i : arr1) {
        //     for (int j : arr2) {
        //         if (i == j) {
        //             common.add(i);
        //         }
        //     }
        // }


        // // 16
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        // for (int i : arr) {
        //     if (!newArr.contains(i)) {
        //         newArr.add(i);
        //     }
        // }


        // // 17
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // int max = arr[0];
        // int secondMax = arr[0];
        // for (int i : arr) {
        //     if (i > max) {
        //         secondMax = max;
        //         max = i;
        //     }
        //     else if (i > secondMax) {
        //         secondMax = i;
        //     }
        // }


        // // 18 second smallest
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // int min = arr[0];
        // int secondMin = arr[0];
        // for (int i : arr) {
        //     if (i < min) {
        //         secondMin = min;
        //         min = i;
        //     }
        //     else if (i < secondMin) {
        //         secondMin = i;
        //     }
        // }


        // // 19
        // int[][] matrix1 = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // int[][] matrix2 = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };
        // int[][] matrix3 = new int[matrix1.length][matrix1[0].length];
        // for (int i = 0; i < matrix1.length; i++) {
        //     for (int j = 0; j < matrix1[0].length - 1; j++) {
        //         matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
        //     }
        // }


        // // 20
        // int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        // for (int i : arr) {
        //     newArr.add(i);
        // }


        // // 21 
        // ArrayList<Integer> numList = new ArrayList<Integer>();
        // Collections.addAll(numList, 5, 4, 3, 2, 1);
        // int[] newArr = new int[numList.size()];
        // for (int i = 0; i < numList.size(); i++) {
        //     newArr[i] = numList.get(i);
        // }


        // // 22
        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {3, 4, 5, 6, 7};
        // int endNum = 10;
        // ArrayList<ArrayList<Integer>> sumNums = new ArrayList<ArrayList<Integer>>();
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; i++) {
        //         if (arr1[i] + arr2[j] == endNum) {
        //             ArrayList<Integer> ans = new ArrayList<>();
        //             ans.add(arr1[i]);
        //             ans.add(arr2[j]);
        //         }
        //     }
        // }
        

        // // 23
        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {3, 4, 5, 6, 7};
        // System.out.println(Arrays.equals(arr1, arr2));


        // // 24
        // int[] arr = {5, 6, 8, 9, 10};
        // int start = 5;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != start + i) {
        //         System.out.println(start + i);
        //     }
        // }


        // // 25
        // int[] arr1 = {5, 10, 15, 20, 25, 30};
        // int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        // int[] arr3 = {20, 40, 60, 80};
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        // while (cnt1 < arr1.length && cnt2 < arr2.length && cnt3 < arr3.length) {
        //     if (arr1[cnt1] == arr2[cnt2] && arr2[cnt2] == arr3[cnt3]) {
        //         nums.add(arr1[cnt1]);
        //         cnt1++;
        //         cnt2++;
        //         cnt3++;
        //     }
        //     else if (arr1[cnt1] < arr2[cnt2]) {
        //         cnt1++;
        //     }
        //     else if (arr2[cnt2] < arr3[cnt3]) {
        //         cnt2++;
        //     }
        //     else {
        //         cnt3++;
        //     }
        // }

        // System.out.println(nums.toString());


        // // 26
        // int[] arr = {4, 6, 2, 0, 3, 0, 1, 5, 0, 9};
        // int count = 0;
        // int len = arr.length;
        // for (int i = 0; i < len;) {
        //     System.out.println("work");
        //     if (arr[i] == 0) i++;
        //     else {
        //         int num = arr[count];
        //         arr[count] = arr[i];
        //         arr[i] = num;
        //         count++;
        //         i++;
        //     }
        // }
        // while (count < len) {
        //     arr[count] = 0;
        //     count++;
        // }
        // System.out.println(Arrays.toString(arr));


        // // 27
        // int[] arr = {4, 6, 2, 0, 3, 0, 1, 5, 0, 9};
        // int even = 0, odd = 0;
        // for (int i : arr) {
        //     if (i % 2 == 0) even++;
        //     else odd++;
        // }
        // System.out.println("even: " + even + ", odd: " + odd);


        // // 28
        // int[] arr = {4, 6, 2, 0, 3, 0, 1, 5, 0, 9};
        // int min = arr[0], max = arr[0];
        // for (int i : arr) {
        //     if (i < min) min = i;
        //     else if (i > max) max = i;
        // }
        // System.out.println(max - min);


        // // 29
        // int[] arr = {4, 6, 2, 0, 3, 0, 1, 5, 0, 9};
        // int min = arr[0], max = arr[0], total = 0;
        // for (int i : arr) {
        //     if (i < min) min = i;
        //     else if (i > max) max = i;
        //     total += i;
        // }
        // System.out.println((total - min - max) / (arr.length - 2));


        // // 30
        // int[] arr = {4, 6, 2, 0, 3, 0, 1, 5, 0, 9};
        // boolean contains = true;
        // for (int i : arr) {
        //     if (i == 0 || i == -1) {
        //         contains = false;
        //         break;
        //     }
        // }
        // System.out.println(contains);


        // // 31
        // int[] arr = {40, 60, 20, 10, 30, 10, 50, 10, 90};
        // int total = 0;
        // for (int i : arr) {
        //     if (i == 10) total += i;
        // }
        // System.out.println(total == 30);


        // // 32
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // Collections.addAll(arr, 25, 27, 83, 65, 26, 52, 34, 77, 99);
        // if (arr.contains(65) && arr.contains(75)) {
        //     System.out.println("contains 65 and 77");
        // }
        // else {
        //     System.out.println("does not contain 65 and 77");
        // }


        // // 33
        // ArrayList<Integer> arr1 = new ArrayList<Integer>();
        // Collections.addAll(arr1, 20, 20, 30, 40, 50, 50, 50);
        // Set<Integer> set1 = new HashSet<Integer>(arr1);
        // System.out.println(set1.size());


        // // 34
        // int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        // Set<Integer> set = new HashSet<Integer>();
        // for (int i : arr) {
        //     set.add(i);
        // }
        // int max = 0;
        // for (int i : arr) {
        //     if (!set.contains(i - 1)) {
        //         int j = i;
        //         while (set.contains(j)) {
        //             j++;
        //         }
        //         max = Math.max(max, j - i);
        //     }
        // }
        // System.out.println(max);


        // // 35
        // int[] arr = {1, 2, 4, 5, 6};
        // int target = 6;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             System.out.println(arr[i] + " + " + arr[j] + " = " + target);
        //         }
        //     }
        // }
        

        // // 36
        // int[] arr = {1, -2, 0, 5, -1, -4};
        // int target = 2;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         for (int k = j + 1; k < arr.length; k++) {
        //             if (arr[i] + arr[j] + arr[k] == target) {
        //                 System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + target);
        //             }
        //         }
        //     }
        // }


        // // 37
        // int[][] matrix = {
        //     {1, 2},
        //     {3, 4}
        // };
        // int n = matrix.length;
        // int[][] newArr = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         newArr[i][j] = matrix[j][i - j];
        //     }
        // }
        // for (int i = 1; i < n; i++) {
        //     for (int j = 0; j < n - i; j++) {
        //         newArr[i + j][n - 1 - j] = matrix[i + j][n - 1 - j];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(Arrays.toString(newArr[i]));
        // }


        // // 38
        // int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        // int majority = arr[0];
        // int count = 1;
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] == majority) {
        //         count++;
        //     }
        //     else {
        //         count--;
        //     }
        //     if (count == 0) {
        //         majority = arr[i];
        //         count = 1;
        //     }
        // }
        // count = 0;
        // for (int i : arr) {
        //     if (i == majority) {
        //         count++;
        //     }
        // }
        // if (count > arr.length / 2) {
        //     System.out.println(majority);
        // }
        // else {
        //     System.out.println("no majority element");
        // }


        // // 39
        // int[] arr = {16, 17, 4, 3, 5, 2};
        // int max = arr[arr.length - 1];
        // System.out.println(max);
        // for (int i = arr.length - 2; i >= 0; i--) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //         System.out.println(max);
        //     }
        // }


        // // 40
        // int[] arr = {1, 60, -10, 70, -80, 85};
        // int min = Integer.MAX_VALUE;
        // int num1 = 0, num2 = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         int sum = arr[i] + arr[j];
        //         if (Math.abs(sum) < min) {
        //             min = Math.abs(sum);
        //             num1 = arr[i];
        //             num2 = arr[j];
        //         }
        //     }
        // }
        // System.out.println(num1 + " and " + num2);
    } 
}
