public abstract class Employee extends Customer implements TerminateAble,Payable{


    private final double DISCOUNT = .10;

    public Employee(String name, Size size, Cloth[] clothingitems) {
        super(name, size, clothingitems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }





}
