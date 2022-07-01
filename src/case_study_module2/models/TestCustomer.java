package case_study_module2.models;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Nghia","21/06/2003",true,
                1122,10999,"mail","kh01", Customer.type.Gold,"DaNang");
        System.out.println(customer.toString());
    }
}
