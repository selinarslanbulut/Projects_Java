package Projects_Java.Day_5.Homework1.business.abstracts;

import Projects_Java.Day_5.Homework1.entities.concretes.Customer;

public interface CustomerVerificationService {
    void sendVerifyMail(Customer customer);
    boolean verifyMail(String email);
    boolean checkVerifyAccount(String email);
}
