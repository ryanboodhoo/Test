public class Main {


    public static void main(String[] args) {


        Cloth cloth= new Cloth(Size.S,20.00,"Jean");
        Cloth cloth1= new Cloth(Size.M,8.00,"T-shirt");
        Cloth cloth2= new Cloth(Size.L,2.00,"Hat");


        Cloth [] cloths= {cloth,cloth1,cloth2};
        System.out.println(UtilityMethods.calculateSubtotal(cloths));

        Student student= new Student("Mike",Size.L,cloths);

        Student student1 = new Student("Jane",Size.S,cloths);

        Student [] students= {student,student1};

        for(Student i : students){
            i.printInfo();
        }

//        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alex",Size.S,cloths);



































    }
}
