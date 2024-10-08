public class HourlyEmployee extends Employee{

    private float hoursWorked;

    private double hourlyWage;

    public HourlyEmployee(String name, Size size, Cloth[] clothingitems, float hoursWorked, double hourlyWage) {
        super(name, size, clothingitems);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }






    @Override
    double printPriceAfterDiscount(Cloth cloth) {
        return cloth.getPrice()- (cloth.getPrice() * getDISCOUNT());
    }

    @Override
    void printInfo() {

    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculatePay() {
        return  getHourlyWage() * getHoursWorked();
    }
}
