public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        Student student = new Student("Apples Mcgee", "01/01/2001", "123-45-6789", "555-555-5555", "CSET", 12345);
        library.students.add(student);
        Teacher teacher = new Teacher("Bananas Smith", "01/01/1992", "987-65-4321", "555-555-5556", "CSET", 23456);
        library.teachers.add(teacher);
        Staff staff = new Staff();

        while (true) {
            System.out.println("Login:");
            System.out.println("1. Staff");
            System.out.println("2. Teacher");
            System.out.println("3. Student");
            int user = Integer.parseInt(System.console().readLine());

            while (user == 1) {
                System.out.println("What would you like to do?");
                System.out.println("1. Lend book");
                System.out.println("2. Search teacher by name");
                System.out.println("3. Search teacher by employee ID");
                System.out.println("4. Search student by name");
                System.out.println("5. Search student by student ID");
                System.out.println("6. Search book by title");
                System.out.println("7. Search book by author");
                System.out.println("8. Search paper by title");
                System.out.println("9. Search paper by author");
                System.out.println("10. View lent books");
                System.out.println("11. Back to login");
                int choice = Integer.parseInt(System.console().readLine());
                if (choice == 1) {
                    System.out.println("Enter book title");
                    String title = System.console().readLine();
                    staff.lendBook(library, teacher, title);
                } 
                else if (choice == 2) {
                    System.out.println("Enter teacher name");
                    String name = System.console().readLine();
                    library.searchTeacherByName(name);
                } 
                else if (choice == 3) {
                    System.out.println("Enter teacher employee ID");
                    int employeeID = Integer.parseInt(System.console().readLine());
                    library.searchTeacherByEmployeeID(employeeID);
                } 
                else if (choice == 4) {
                    System.out.println("Enter student name");
                    String name = System.console().readLine();
                    library.searchStudentByName(name);
                } 
                else if (choice == 5) {
                    System.out.println("Enter student ID");
                    int studentID = Integer.parseInt(System.console().readLine());
                    library.searchStudentByStudentID(studentID);
                } 
                else if (choice == 6) {
                    System.out.println("Enter book title");
                    String title = System.console().readLine();
                    library.searchBookByTitle(title);
                } 
                else if (choice == 7) {
                    System.out.println("Enter book author");
                    String author = System.console().readLine();
                    library.searchBookByAuthor(author);
                } 
                else if (choice == 8) {
                    System.out.println("Enter paper title");
                    String title = System.console().readLine();
                    library.searchPaperByTitle(title);
                } 
                else if (choice == 9) {
                    System.out.println("Enter paper author");
                    String author = System.console().readLine();
                    library.searchPaperByAuthor(author);
                } 
                else if (choice == 10) {
                    library.viewLentBooks();
                }
                else if (choice == 11) {
                    break;
                }
            } 
            while (user == 2) {
                System.out.println("What would you like to do?");
                System.out.println("1. Publish book");
                System.out.println("2. Publish paper");
                System.out.println("3. Search book by title");
                System.out.println("4. Search book by author");
                System.out.println("5. Search paper by title");
                System.out.println("6. Search paper by author");
                System.out.println("7. Back to login");
                int choice = Integer.parseInt(System.console().readLine());
                if (choice == 1) {
                    System.out.println("Enter book title:");
                    String title = System.console().readLine();
                    System.out.println("Enter book description:");
                    String description = System.console().readLine();
                    System.out.println("Enter book author:");
                    String author = System.console().readLine();
                    System.out.println("Enter book genre:");
                    String genre = System.console().readLine();
                    System.out.println("Enter book file:");
                    String file = System.console().readLine();
                    teacher.publishBook(library, title, description, author, genre, file);
                }
                else if (choice == 2) {
                    System.out.println("Enter paper title:");
                    String title = System.console().readLine();
                    System.out.println("Enter paper description:");
                    String description = System.console().readLine();
                    System.out.println("Enter paper author:");
                    String author = System.console().readLine();
                    System.out.println("Enter paper file:");
                    String file = System.console().readLine();
                    teacher.publishPaper(library, title, description, author, file);
                }
                else if (choice == 3) {
                    System.out.println("Enter book title");
                    String title = System.console().readLine();
                    library.searchBookByTitle(title);
                } 
                else if (choice == 4) {
                    System.out.println("Enter book author");
                    String author = System.console().readLine();
                    library.searchBookByAuthor(author);
                } 
                else if (choice == 5) {
                    System.out.println("Enter paper title");
                    String title = System.console().readLine();
                    library.searchPaperByTitle(title);
                } 
                else if (choice == 6) {
                    System.out.println("Enter paper author");
                    String author = System.console().readLine();
                    library.searchPaperByAuthor(author);
                }
                else if (choice == 7) {
                    break;
                }
            } 
            while (user == 3) {
                System.out.println("What would you like to do?");
                System.out.println("1. Publish paper");
                System.out.println("2. Search book by title");
                System.out.println("3. Search book by author");
                System.out.println("4. Search paper by title");
                System.out.println("5. Search paper by author");
                System.out.println("6. Back to login");
                int choice = Integer.parseInt(System.console().readLine());
                if (choice == 1) {
                    System.out.println("Enter paper title:");
                    String title = System.console().readLine();
                    System.out.println("Enter paper description:");
                    String description = System.console().readLine();
                    System.out.println("Enter paper author:");
                    String author = System.console().readLine();
                    System.out.println("Enter paper file:");
                    String file = System.console().readLine();
                    student.publishPaper(library, title, description, author, file);
                }
                else if (choice == 2) {
                    System.out.println("Enter book title");
                    String title = System.console().readLine();
                    library.searchBookByTitle(title);
                } 
                else if (choice == 3) {
                    System.out.println("Enter book author");
                    String author = System.console().readLine();
                    library.searchBookByAuthor(author);
                } 
                else if (choice == 4) {
                    System.out.println("Enter paper title");
                    String title = System.console().readLine();
                    library.searchPaperByTitle(title);
                } 
                else if (choice == 5) {
                    System.out.println("Enter paper author");
                    String author = System.console().readLine();
                    library.searchPaperByAuthor(author);
                }
                else if (choice == 6) {
                    break;
                }
            }

            System.out.println("Continue? (y/n)");
            String cont = System.console().readLine();
            if (cont.equals("n")) {
                break;
            }
        }
    }
}
