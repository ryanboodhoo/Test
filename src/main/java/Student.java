public class Student extends Customer{

  private static long studentId;

  private static long studentCounter = 1;

  final double DISCOUNT = .5;

    public Student(String name, Size size, Cloth[] clothingitems) {
        super(name, size, clothingitems);
        studentId =studentCounter++;
     }


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        Student.studentId = studentId;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public long getStudentCounter() {
        return studentCounter;
    }

    public void setStudentCounter(long studentCounter) {
        Student.studentCounter = studentCounter;
    }


    @Override
    double printPriceAfterDiscount(Cloth cloth) {
        return 0;
    }

    @Override
    void printInfo() {
        System.out.println("Student's id" + getStudentId() + "Student Name" + getName());
    }
}
