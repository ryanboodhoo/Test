import java.util.Arrays;

public class Manager extends Employee{

    private final double EXTRADISCOUNT = .5;

    private double Salary;

    public Manager(String name, Size size, Cloth[] clothingitems, double salary) {
        super(name, size, clothingitems);
        Salary = salary;
    }

    @Override
    public double getDISCOUNT() {
        return EXTRADISCOUNT;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


    @Override
    double printPriceAfterDiscount(Cloth cloth) {
        double totalDiscount = getDISCOUNT() + EXTRADISCOUNT;
        return cloth.getPrice()- (cloth.getPrice() * totalDiscount);
    }

    @Override
    void printInfo(){
        System.out.println(getName() + "makes" + getSalary() + "and his shopping bag consist of the following items" +
                Arrays.toString(getClothingitems()));

    }

    @Override
    public boolean canGetFired() {
        return false;
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }
}
