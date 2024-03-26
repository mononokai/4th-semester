import java.util.Arrays;

public class School {
    Student[] students;

    public void add(int ID, String name, int age, int grade) {
        Student student = new Student(ID, name, age, grade);

        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public int searchByID(int ID) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].ID == ID)
                return i;
        }

        return -1;
    }

    public int searchByName(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name == name)
                return i;
        }

        return -1;
    }

    public void delete(int ID) {
        int index = searchByID(ID);

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        students = Arrays.copyOf(students, students.length - 1);
    }

    public void display() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.ID + ", name: " + student.name);
        }
    }

    
}
