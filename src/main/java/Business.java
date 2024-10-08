public class Business implements Payable,Taxable{
    private String name;
    private int productQty;
    private double productPrice;
private double revenue;

public Business(String name, int productQty, double productPrice) {
        this.name = name;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public double calculatePay() {
        this.revenue = productPrice * productQty;
        return getProductPrice() * getProductQty();
    }

    @Override
    public boolean payTaxOnEarnings() {
        return calculatePay() > 100000;
    }
}
