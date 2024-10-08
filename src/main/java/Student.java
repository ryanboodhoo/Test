public class Student extends Customer{

  private long studentId;

  private static long studentCounter = 1L;

  final double DISCOUNT = .5;

    public Student(String name, Size size, Cloth[] clothingitems) {
        super(name, size, clothingitems);
        this.studentId =studentCounter++;
     }


    public static void setStudentCounter(long studentCounter) {
        Student.studentCounter = studentCounter;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public static long getStudentCounter() {
        return studentCounter -1L;
    }




    @Override
    double printPriceAfterDiscount(Cloth cloth) {
        return 0;
    }

    @Override
    void printInfo() {
        System.out.println("Student's id " + getStudentId() + "Student Name " + getName());
    }

        public void printStudentCounter(){
            System.out.println("We have created " + getStudentCounter() + "students in our database successfully ");
        }


    }

