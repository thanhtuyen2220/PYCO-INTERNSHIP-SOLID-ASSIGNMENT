package ProcessWithoutDiscount;

import Customer.Customer;
import Product.Products;
import Process.Operations;

public class ProcessWithoutDiscount extends Operations implements IProcessWithoutDiscount {

    public ProcessWithoutDiscount(Customer cus, Products productBuy, int discount) {
        super(cus, productBuy, discount);
    }

    @Override
    public void calculateTotal() {
        System.out.println("We are calculating your total......");
    }

    @Override
    public void printBills() {
        System.out.println("Please waiting........" );
    }

    @Override
    public void InProgress() {
        System.out.println("You are choosing without discount");
        calculateTotal();
        printBills();
    }
}
