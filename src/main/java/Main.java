import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        Cloth cloth= new Cloth(Size.S,20.00,"Jean");
        Cloth cloth1= new Cloth(Size.M,8.00,"T-shirt");
        Cloth cloth2= new Cloth(Size.L,2.00,"Hat");


        Cloth [] shoppingbag= {cloth,cloth1,cloth2};
        System.out.println(UtilityMethods.calculateSubtotal(shoppingbag));

        Student student= new Student("Mike",Size.L,shoppingbag);

        Student student1 = new Student("Jane",Size.S,shoppingbag);
        ArrayList <Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(student);
        studentArrayList.add(student1);

        for(Student i : studentArrayList){
            i.printInfo();
        }
        student.printStudentCounter();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex",Size.S,shoppingbag,-40,20);

        Manager manager = new Manager("Terry",Size.L,shoppingbag,100000);

manager.printInfo();

        System.out.println(hourlyEmployee.printPriceAfterDiscount(cloth));

        System.out.println(UtilityMethods.checkFitting(student,cloth2));


        Business business = new Business("Acme",10000,20);

        business.payTaxOnEarnings();

        Payable [] array = {hourlyEmployee,manager,business};
UtilityMethods.printClassNamesOfPayableEntities();































    }
}
