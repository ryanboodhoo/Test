public class Cloth {

   private String name;
    private double price;
    private Size size;

    public Cloth(Size size, double price, String name) {
        this.size = size;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cloth" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
