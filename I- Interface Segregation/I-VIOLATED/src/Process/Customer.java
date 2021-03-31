package Process;

public class Customer {
    protected int Id;
    protected String name;
    protected int age;
    protected boolean isDiscount;

    public Customer(String name,boolean isDiscount) {
        this.name = name;
        this.isDiscount=isDiscount;
    }
    public String getName(){
        return name;
    }

    public boolean isDiscount() {
        return isDiscount;
    }
}
