interface Student {
    void details();
}
public class StudentDetails implements Student {
    public void details() {
        System.out.println("Name: John, Age: 21");
    }
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.details();
    }
}
