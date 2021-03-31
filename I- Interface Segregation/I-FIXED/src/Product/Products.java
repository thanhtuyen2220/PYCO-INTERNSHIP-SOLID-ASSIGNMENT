package Product;

public class Products {
    protected int Id_Products;
    protected String name;
    protected String color;
    protected int quantity;
    protected int price;
    //protected int discount;

    public Products(String name, String color, int quantity,int price) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        //this.discount = discount;
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
