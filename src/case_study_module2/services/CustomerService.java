package case_study_module2.services;

import java.io.FileNotFoundException;

public interface CustomerService extends Service{
    void showCustomers() throws FileNotFoundException;
    void addNewCustomers();
    void editCustomers();
}
