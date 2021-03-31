package ProcessWithDiscount;
import Customer.Customer;
import Process.Operations;
import ProcessWithoutDiscount.IProcessWithoutDiscount;
import Product.Products;

public class ProcessWithDiscount extends Operations implements IProcessWithDiscount {
    public ProcessWithDiscount(Customer cus, Products productBuy, int discount) {
        super(cus, productBuy, discount);
    }

    @Override
    public void calculateDiscount() {
        System.out.println("You added a coupon of 50% discount");
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
        System.out.println("You are choosing with discount");
        calculateDiscount();
        calculateTotal();
        printBills();
    }
}
