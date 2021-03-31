package Process;

import Customer.Customer;
import Product.Products;

public abstract class Operations {
    private Customer cus;
    private Products productBuy;
    private int discount;

    public Operations(Customer cus, Products productBuy, int discount) {
        this.cus = cus;
        this.productBuy = productBuy;
        this.discount = discount;
    }
    public void InProgress(){};
}
