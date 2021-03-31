package Client;

import Customer.Customer;
import ProcessWithDiscount.IProcessWithDiscount;
import ProcessWithDiscount.ProcessWithDiscount;
import ProcessWithoutDiscount.IProcessWithoutDiscount;
import ProcessWithoutDiscount.ProcessWithoutDiscount;
import Product.Products;

public class Main {
    private static IProcessWithoutDiscount interfaceProcessWithoutDiscount;
    private static IProcessWithDiscount interfaceProcessWithDiscount;

    private static Products products;

    public static void main(String[] args) {
        Customer cus = new Customer("Tuyen",true);
        products = new Products("Cat","White",1,150000);
        IsDiscountProcess(cus);
    }
    public static void IsDiscountProcess(Customer cus){
        if(cus.isDiscount()==true){
            interfaceProcessWithDiscount = new ProcessWithDiscount(cus,products,10);
            interfaceProcessWithDiscount.InProgress();
        }
        if(cus.isDiscount()==false) {
            interfaceProcessWithoutDiscount = new ProcessWithoutDiscount(cus, products, 0);
            interfaceProcessWithoutDiscount.InProgress();
        }
    }
}
