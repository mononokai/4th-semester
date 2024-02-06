public class Teacher extends User {
    protected int employeeID;

    public Teacher(String name, String birthDate, String SSN, String phone, String dept, int employeeID) {
        super(name, birthDate, SSN, phone, dept);
        this.employeeID = employeeID;
    }

    public void publishBook(Library library, String title, String description, String author, String genre, String file) {
        Book book = new Book(title, description, author, genre, file);
        library.books.add(book);
    }
}
