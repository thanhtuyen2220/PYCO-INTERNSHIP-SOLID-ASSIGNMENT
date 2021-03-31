package Process;

public class Purchasing implements IPurchaseProcess {
    private Customer customer;
    Products products;
    private int discount;

    public Purchasing(Customer customer, Products products,int discount) {
        this.customer = customer;
        this.products = products;
        this.discount = discount;
    }


    @Override
    public void calculateDiscount() {
        System.out.println("Please added your coupon and I am calculating ");
    }

    @Override
    public void calculateTotal() {
        System.out.println("We are calculating your total......");
    }

    @Override
    public void printBills() {
        System.out.println("Please waiting........" + customer.getName());
    }

    @Override
    public void Process() {
            if(customer.isDiscount() == true){
                ProcessWithDiscount();
            }
            else ProcessWithoutDiscount();
    }


    @Override
    public void ProcessWithDiscount() {
        calculateDiscount();
        System.out.println("Your discount will be added");
        calculateTotal();
        printBills();

    }

    @Override
    public void ProcessWithoutDiscount() {
        System.out.println("You didn't have a discount?");
        calculateTotal();
        printBills();
    }
}
