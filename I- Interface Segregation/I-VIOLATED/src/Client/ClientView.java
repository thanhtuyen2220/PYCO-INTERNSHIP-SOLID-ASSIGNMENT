package Client;

import Process.Customer;
import Process.Products;
import Process.Purchasing;

public class ClientView {

    public static void main(String[] args) {
        Products products = new Products("Oreo","black",2,20000);
        Customer cus = new Customer("Tuyen",true);
        Customer cus1 = new Customer("Thao",false);
        Purchasing purchaseProcess = new Purchasing(cus,products,10);
        Purchasing purchaseProcess1 = new Purchasing(cus1,products,0);

        purchaseProcess.Process();
        purchaseProcess1.Process();

    }
}
