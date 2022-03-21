package Projects_Java.Day_5.Homework1.business.abstracts;

import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

public interface CustomerService {
    void register(Customer customer);
    void login(Customer customer);
    void verifyAccount(Customer customer);
}
