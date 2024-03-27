import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Student Management System");

        // create new student management system
        StudentManagementSystem students = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        // add students
        students.add(3, "Bill", 20, 90);
        students.add(2, "Bob", 21, 85);
        students.add(1, "Brad", 19, 95);
        students.add(6, "Barbie", 22, 88);
        students.add(5, "Blake", 20, 92);
        students.add(4, "Bella", 21, 89);

        // start system
        loop: while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Display students");
            System.out.println("2. Add student");
            System.out.println("3. Delete student");
            System.out.println("4. Search for a student by ID");
            System.out.println("5. Search for a student by name");
            System.out.println("6. See students sorted by ID");
            System.out.println("7. See students sorted by name");
            System.out.println("8. See students sorted by age");
            System.out.println("9. See students sorted by grade");
            System.out.println("10. Exit");

            // get user input
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    students.display();
                    break;
                case 2:
                    System.out.println("Enter student ID:");
                    int ID = sc.nextInt();
                    System.out.println("Enter student name:");
                    String name = sc.next();
                    System.out.println("Enter student age:");
                    int age = sc.nextInt();
                    System.out.println("Enter student grade:");
                    int grade = sc.nextInt();
                    students.add(ID, name, age, grade);
                    break;
                case 3:
                    System.out.println("Enter student ID to delete:");
                    ID = sc.nextInt();
                    students.delete(ID);
                    break;
                case 4:
                    System.out.println("Enter student ID to search:");
                    ID = sc.nextInt();
                    int index = students.searchByID(ID);
                    if (index != -1) {
                        System.out.println("Student found: " + students.students[index].name);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter student name to search:");
                    name = sc.next();
                    index = students.searchByName(name);
                    if (index != -1) {
                        System.out.println("Student found: ID " + students.students[index].ID);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 6:
                    SortAlgorithms.byID(students.students);
                    break;
                case 7:
                    SortAlgorithms.byName(students.students);
                    break;
                case 8:
                    SortAlgorithms.byAge(students.students);
                    break;
                case 9:
                    SortAlgorithms.byGrade(students.students);
                    break;
                case 10:
                    System.out.println("Goodbye");
                    sc.close();
                    break loop;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println();
        }
    }
}
