public class Business implements Payable{
    private String name;
    private int productQty;
    private double productPrice;

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
        return 0;
    }
}
