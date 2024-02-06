public class Student extends User{
    protected int studentID;

    public Student(String name, String birthDate, String SSN, String phone, String dept, int studentID) {
        super(name, birthDate, SSN, phone, dept);
        this.studentID = studentID;
    }
}
