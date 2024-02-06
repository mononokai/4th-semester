public class User {
    protected String name;
    protected String birthDate;
    protected String SSN;
    protected String phone;
    protected String dept;

    public User (String name, String birthDate, String SSN, String phone, String dept) {
        this.name = name;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.phone = phone;
        this.dept = dept;
    }

    public void publishPaper(Library library, String title, String description, String author, String file) {
        Paper paper = new Paper(title, description, author, file);
        library.papers.add(paper);
    }
}
