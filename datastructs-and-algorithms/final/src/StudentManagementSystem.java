import java.util.Arrays;

public class StudentManagementSystem {
    // array for storing students
    Student[] students;

    public void add(int ID, String name, int age, int grade) {
        Student student = new Student(ID, name, age, grade);
        
        // copy and extend students array to add new student
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public int searchByID(int ID) {
        // linear search for student ID
        for (int i = 0; i < students.length; i++) {
            if (students[i].ID == ID)
                return i;
        }

        return -1;
    }

    public int searchByName(String name) {
        // linear search for student name
        for (int i = 0; i < students.length; i++) {
            if (students[i].name == name)
                return i;
        }

        return -1;
    }

    public void delete(int ID) {
        // use search method to find student index
        int index = searchByID(ID);

        // shift values down one index
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        // remove last element in the array
        students = Arrays.copyOf(students, students.length - 1);
    }

    public void display() {
        // iterate through students, printing their ID and name
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name);
        }
    }
}
