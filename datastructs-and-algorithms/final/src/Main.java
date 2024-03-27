public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Student Management System");

        // create new student management system
        StudentManagementSystem students = new StudentManagementSystem();

        // add students
        students.add(3, "Bill", 20, 90);
        students.add(2, "Bob", 21, 85);
        students.add(1, "Brad", 19, 95);
        students.add(6, "Barbie", 22, 88);
        students.add(5, "Blake", 20, 92);
        students.add(4, "Bella", 21, 89);

        // display students
        System.out.println("All students:");
        students.display();

        // delete student
        students.delete(3);

        // display students
        System.out.println("Students after deleting Bill:");
        students.display();

        // search for student by ID
        int index = students.searchByID(2);
        System.out.println("Student name found by ID: " + students.students[index].name);

        // search for student by name
        index = students.searchByName("Blake");
        System.out.println("Student ID found by name: " + students.students[index].ID);

        // sort students by ID
        System.out.println("Students sorted by ID:");
        SortAlgorithms.byID(students.students);

        // sort students by name
        System.out.println("Students sorted by name:");
        SortAlgorithms.byName(students.students);

        // sort students by age
        System.out.println("Students sorted by age:");
        SortAlgorithms.byAge(students.students);

        // sort students by grade
        System.out.println("Students sorted by grade:");
        SortAlgorithms.byGrade(students.students);
    }
}
