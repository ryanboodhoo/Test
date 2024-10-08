public abstract class Customer extends Person{
    public Customer(String name, Size size, Cloth[] clothingitems) {
        super(name, size);
        this.clothingitems = clothingitems;
    }

    private Cloth[] clothingitems;


    public Cloth[] getClothingitems() {
        return clothingitems;
    }

    public void setClothingitems(Cloth[] clothingitems) {
        this.clothingitems = clothingitems;
    }

    abstract double printPriceAfterDiscount(Cloth cloth);






}
