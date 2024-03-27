import java.util.Random;

public class SortAlgorithms {
    public static void byID(Student[] students) {
        // bubble sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].ID > students[j + 1].ID) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // print sorted students
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name);
        }
    }

    public static void byName(Student[] students) {
        // insertion sort
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].name.compareTo(key.name) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }

        // print sorted students
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name);
        }
    }

    public static void byAge(Student[] students) {
        // quick sort
        quickSort(students);

        // print sorted students
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name + ", age: " + student.age);
        }
    }

    
    public static void byGrade(Student[] students) {
        // merge sort
        mergeSort(students);

        // print sorted students
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name + ", grade: " + student.grade);
        }
    }

    // quick sort

    private static Student[] quickSort(Student[] students) {
        return quickSort(students, 0, students.length - 1);
    }

    private static Student[] quickSort(Student[] students, int lower, int upper) {
        // guard clause for empty array
        if (lower >= upper)
            return students;

        // random pivot selection
        int randomPivot = new Random().nextInt(upper - lower) + lower;
        Student pivot = students[randomPivot];
        // swap pivot with upper student
        swap(students, randomPivot, upper);
        int left = lower;
        int right = upper;

        // partition students array
        while (left < right) {
            // find students with age less than pivot
            while (students[left].age <= pivot.age && left < right) {
                left++;
            }

            // find students with age greater than pivot
            while (students[right].age >= pivot.age && left < right) {
                right--;
            }

            // swap students
            Student temp = students[left];
            students[left] = students[right];
            students[right] = temp;
        }

        // swap pivot with left student
        swap(students, left, upper);

        // recursive calls
        quickSort(students, lower, left - 1);
        quickSort(students, left + 1, upper);

        return students;
    }

    // swap helper method
    static private void swap(Student[] students, int indx1, int indx2) {
        Student hold = students[indx1];
        students[indx1] = students[indx2];
        students[indx2] = hold;
    }


    // merge sort
    private static Student[] mergeSort(Student[] students) {
        // storing length and mid point of students array
        int len = students.length;
        int mid = len / 2;

        // guard clause for empty array
        if (students.length < 2) return students;

        // split students array into left and right arrays
        Student[] left = new Student[mid];
        Student[] right = new Student[students.length - mid];

        // copy students array into left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = students[i];
        }

        for (int i = mid; i < students.length; i++) {
            right[i - mid] = students[i];
        }

        // recursive calls
        mergeSort(left);
        mergeSort(right);

        // merge left and right arrays
        merge(students, left, right);

        return students;
    }

    // merge helper method
    private static void merge(Student[] students, Student[] left, Student[] right) {
        // storing length of left and right arrays
        int leftLen = left.length;
        int rightLen = right.length;
        // initializing indexes for left, right, and students arrays
        int i = 0, j = 0, k = 0;

        // merge left and right arrays into students array
        while (i < leftLen && j < rightLen) {
            if (left[i].grade <= right[j].grade) {
                students[k++] = left[i++];
            } else {
                students[k++] = right[j++];
            }
        }

        // merge remaining elements in left and right arrays
        while (i < leftLen) {
            students[k++] = left[i++];
        }

        while (j < rightLen) {
            students[k++] = right[j++];
        }
    }
}
