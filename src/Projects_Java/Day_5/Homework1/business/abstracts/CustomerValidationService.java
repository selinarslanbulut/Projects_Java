package Projects_Java.Day_5.Homework1.business.abstracts;

import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

import java.util.List;

public interface CustomerValidationService {
    boolean checkFirstName(Customer customer);
    boolean checkLastName(Customer customer);
    boolean checkPassword(Customer customer);
    boolean checkEmail(Customer customer);
    boolean totalCheck(Customer customer, List<Customer> customerList);
}
