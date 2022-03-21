package Projects_Java.Day_5.Homework1.dataAccess.abstracts;

import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    List<Customer> getAll();
}
