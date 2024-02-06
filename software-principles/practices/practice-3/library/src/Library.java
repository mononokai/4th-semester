import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    protected ArrayList<Book> books;
    protected ArrayList<Paper> papers;
    protected Map<User, String> lentBooks;
    protected Map<User, String> lentPapers;
    protected ArrayList<Teacher> teachers;
    protected ArrayList<Student> students;

    public Library() {
        books = new ArrayList<Book>();
        papers = new ArrayList<Paper>();
        lentBooks = new HashMap<>();
        lentPapers = new HashMap<>();
        teachers = new ArrayList<Teacher>();
        students = new ArrayList<Student>();
    }

    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                System.out.println("Book found: " + book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void searchBookByAuthor(String author) {
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.println("Book found: " + book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void searchPaperByTitle(String title) {
        for (Paper paper : papers) {
            if (paper.title.equals(title)) {
                System.out.println("Paper found: " + paper.title);
                return;
            }
        }
        System.out.println("Paper not found");
    }

    public void searchPaperByAuthor(String author) {
        for (Paper paper : papers) {
            if (paper.author.equals(author)) {
                System.out.println("Paper found: " + paper.title);
                return;
            }
        }
        System.out.println("Paper not found");
    }

    public void searchTeacherByName(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.name.equals(name)) {
                System.out.println("Teacher found: " + teacher.name);
                return;
            }
        }
        System.out.println("Teacher not found");
    }

    public void searchTeacherByEmployeeID(int employeeID) {
        for (Teacher teacher : teachers) {
            if (teacher.employeeID == employeeID) {
                System.out.println("Teacher found: " + teacher.name);
                return;
            }
        }
        System.out.println("Teacher not found");
    }

    public void searchStudentByName(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                System.out.println("Student found: " + student.name);
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void searchStudentByStudentID(int studentID) {
        for (Student student : students) {
            if (student.studentID == studentID) {
                System.out.println("Student found: " + student.name);
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void viewLentBooks() {
        for (Map.Entry<User, String> entry : lentBooks.entrySet()) {
            System.out.println("User: " + entry.getKey().name + " Book: " + entry.getValue());
        }
    }
}
