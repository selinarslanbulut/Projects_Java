package Projects_Java.Day_5.Homework1.dataAccess.concretes;

import Projects_Java.Day_5.Homework1.dataAccess.abstracts.CustomerDao;
import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerDao implements CustomerDao {
    List<Customer> customers= new ArrayList<Customer>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
        System.out.println( customer + " Hibernate ile eklendi.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println( customer + " Hibernate ile silindi.");

    }

    @Override
    public void update(Customer customer) {
        System.out.println( customer + " Hibernate ile güncellendi.");

    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }
}
